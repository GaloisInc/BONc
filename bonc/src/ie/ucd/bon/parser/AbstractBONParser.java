/**
 * Copyright (c) 2007, Fintan Fairmichael, University College Dublin under the BSD licence.
 * See LICENCE.TXT for details.
 */
package ie.ucd.bon.parser;

import ie.ucd.bon.Main;
import ie.ucd.bon.errorreporting.BONProblem;
import ie.ucd.bon.errorreporting.Problems;
import ie.ucd.bon.parser.errors.AntlrParsingError;
import ie.ucd.bon.parser.errors.ParsingError;
import ie.ucd.bon.parser.tracker.ParsingTracker;
import ie.ucd.bon.source.SourceLocation;
import ie.ucd.bon.typechecker.Context;
import ie.ucd.bon.typechecker.TypingInformation;
import ie.ucd.bon.typechecker.informal.InformalTypingInformation;
import ie.ucd.bon.util.NullOutputStream;

import java.io.File;
import java.io.PrintStream;

import org.antlr.runtime.BitSet;
import org.antlr.runtime.EarlyExitException;
import org.antlr.runtime.FailedPredicateException;
import org.antlr.runtime.IntStream;
import org.antlr.runtime.MismatchedNotSetException;
import org.antlr.runtime.MismatchedSetException;
import org.antlr.runtime.MismatchedTokenException;
import org.antlr.runtime.NoViableAltException;
import org.antlr.runtime.Parser;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.Token;
import org.antlr.runtime.TokenStream;

/**
 * @author Fintan
 */
public abstract class AbstractBONParser extends Parser {

  private final Context context;
  
  private boolean validParse;
  private File sourceFile;
  private TypingInformation typingInformation;
  private Problems problems;

  public AbstractBONParser(TokenStream input) {
    super(null);
    this.context = Context.getContext();
  }

  /**
   * {@inheritDoc}
   */
  public void initialise(ParsingTracker tracker, TokenStream input, File sourceFile) {
    this.sourceFile = sourceFile;
    validParse = true;
    this.typingInformation = tracker.getTypingInformation();
    problems = new Problems();
    super.setTokenStream(input);
  }

  /**
   * Get the name for the token type given.
   * @param tokenType The token type to get the name for.
   * @return The name of the given token type.
   */
  public String getTokenTypeName(int tokenType) {
    String[] tokenNames = getTokenNames();
    if (tokenType < tokenNames.length && tokenType >= 0) {
      return tokenNames[tokenType];
    } else {
      return "***INVALID TOKEN TYPE***";
    }
  }

  /**
   * {@inheritDoc}
   */
  protected void mismatch(IntStream input, int ttype, BitSet follow) throws RecognitionException {
    Main.logDebug("Mismatch");
    super.mismatch(input, ttype, follow);
  }

  /**
   * {@inheritDoc}
   */
  public boolean isValidParse() {
    return validParse;
  }

  /**
   * 
   * @param e
   * @param tokenNames 
   */
  //TODO what is the difference between tokenNames here and getTokenNames()
  public BONProblem getErrorProblem(RecognitionException e, String[] tokenNames) {
		if ( e instanceof MismatchedTokenException ) {
			MismatchedTokenException mte = (MismatchedTokenException)e;
			
			String tokenName;
			if ( mte.expecting== Token.EOF ) {
				tokenName = "EOF";
			} else {
				tokenName = tokenNames[mte.expecting];
			}
			
			if (e.token.getType() == Token.EOF) {
			  Token t = input.LT(-1);
			  if (t != null) {
			    String prevTokenText = t.getText();
			    String msg = "Expected " + tokenName + " after " + prevTokenText + ", before end of file";
			    return new AntlrParsingError(sourceFile, t.getLine(), t.getCharPositionInLine()+prevTokenText.length()+1, msg, true);
			  } else {
			    String msg = "Unexpected input " + getTokenErrorDisplay(e.token) + ", expecting " + tokenName + "";
			    return new AntlrParsingError(sourceFile, BONProblem.EOF_LINE, 0, msg, true);
			  }
			} else {
			  //Main.logDebug("Mismatched " + getTokenErrorDisplay(e.token) + ", expecting " + tokenName);
	      String msg = ParseProblemExplanations.getExplanationWithExpecting(e,tokenName);

	      if (msg == null) {
	        msg = "Unexpected input " + getTokenErrorDisplay(e.token) + ", expecting " + tokenName + "";
	      } else {
	        msg = String.format(msg, getTokenErrorDisplay(e.token));
	      }
			  return new AntlrParsingError(sourceFile, e.line, e.charPositionInLine, msg, true);
			}
			
		} else if ( e instanceof NoViableAltException ) {
			String msg = ParseProblemExplanations.getExplanation(e);
			if (msg == null) {
			  msg = "Unexpected input " + getTokenErrorDisplay(e.token);
			}
			return new AntlrParsingError(sourceFile, e.line, e.charPositionInLine, msg, true);
			
		} else if ( e instanceof EarlyExitException ) {
			String explanation = ParseProblemExplanations.getExplanation(e);
			
			String msg;
			if (explanation != null) {
        msg = "Missing " + explanation;  
      } else {
        //Main.logDebug("Debug: could not find explanation for EarlyExitException from method " + methodName);
        //msg = "required (...)+ loop did not match anything at input "+ getTokenErrorDisplay(e.token);
        msg = "Unexpected input "+ getTokenErrorDisplay(e.token);
      }
			return new AntlrParsingError(sourceFile, e.line, e.charPositionInLine, msg, true);
			
		} else if ( e instanceof MismatchedSetException ) {
			MismatchedSetException mse = (MismatchedSetException)e;
			String msg = "mismatched input "+getTokenErrorDisplay(e.token)+" expecting set "+mse.expecting;
			return new AntlrParsingError(sourceFile, e.line, e.charPositionInLine, msg, true);
		} else if ( e instanceof MismatchedNotSetException ) {
			MismatchedNotSetException mse = (MismatchedNotSetException)e;
			String msg = "mismatched input "+getTokenErrorDisplay(e.token)+" expecting set "+mse.expecting;
			return new AntlrParsingError(sourceFile, e.line, e.charPositionInLine, msg, true);
		} else if ( e instanceof FailedPredicateException ) {
			FailedPredicateException fpe = (FailedPredicateException)e;
			String msg = "rule "+fpe.ruleName+" failed predicate: {"+fpe.predicateText+"}?";
			return new AntlrParsingError(sourceFile, e.line, e.charPositionInLine, msg, true);
		} else {
		  return new AntlrParsingError(sourceFile, e.line, e.charPositionInLine, "An unknown error occurred", true);
		}

  }  
  
  
  /**
   * Returns the error header, which is just the source filename and the line number on
   * which the error occurs
   * 
   * @param e The RecognitionException representing the error
   * @return A String giving the source filename and line on which the error occurs
   */
	public String getErrorHeader(RecognitionException e) {
		return null; //sourceFileName + ":" + e.line + ":";
	}

  /**
   * Get a string to identify this Token for use in an error message.
   */
  public String getTokenErrorDisplay(Token t) {
    String s = t.getText();
		if ( s==null ) {
			if ( t.getType()==Token.EOF ) {
				s = "<EOF>";
			}
			else {
				s = "<"+t.getType()+">";
			}
		}
		s = s.replaceAll("\n","\\\\n");
		s = s.replaceAll("\r","\\\\r");
		s = s.replaceAll("\t","\\\\t");
		return "'" + s + "'";
  }

  public void displayRecognitionError(String[] tokenNames, RecognitionException e) {
    BONProblem problem = getErrorProblem(e, tokenNames);

    Main.logDebug("Recognition error (" + e.getClass().getName() + "): " + problem.getMessage());
    Main.logDebug("Stack trace: ");
    if (Main.isDebug()) {
      e.printStackTrace(System.out);
    }
    
    validParse = false;
    
    //TODO adjust severity here according to if we recovered ok or not...
    problems.addProblem(problem);
  }
    
/*  **
   * Emits an error message. Will use the specified error stream or, if none
   * was specified, will use {@link System#out}.
   *//*
  public void emitErrorMessage(String msg) {
    errorStream.println(msg);
  }*/
  
  @Override
  public void recoverFromMismatchedToken(IntStream input, RecognitionException e, int ttype, BitSet follow)
      throws RecognitionException {
    //Suppress System.err output from BaseRecognizer implementation
    Main.logDebug("Recovering from mismatch..." + e);
    PrintStream oldErr = System.err;
    System.setErr(NullOutputStream.getNullPrintStreamInstance());
    super.recoverFromMismatchedToken(input, e, ttype, follow);
    System.setErr(oldErr);
  }

  @Override
  protected boolean recoverFromMismatchedElement(IntStream input,
      RecognitionException e, BitSet follow) {
    boolean success = super.recoverFromMismatchedElement(input, e, follow);
    Main.logDebug("Recovered from mismatched element: " + success);
    return success;
  }

  public final SourceLocation getSourceLocation(Token t) {
    return new SourceLocation(t, this.sourceFile);
  }
  
  //Just a shorter version
  public final SourceLocation getSLoc(Token t) {
    return getSourceLocation(t);
  }
  
  public final void addParseProblem(BONProblem problem) {
    if (problem instanceof ParsingError) {
      if (((ParsingError)problem).isSevere()) {
        validParse = false;
      }
    }
    problems.addProblem(problem);
  }
  
  /**
   * 
   * @return the typing information for this 
   */
  public final TypingInformation getTypingInformation() {
    return typingInformation;
  }
  
  /**
   * 
   * @return the typing information for this 
   */
  public final TypingInformation getTI() {
    return typingInformation;
  }
  
  public final InformalTypingInformation getITI() {
    return typingInformation.informal();
  }

  public Problems getProblems() {
    return problems;
  }
  
  public Context getContext() {
    return context;
  }

}

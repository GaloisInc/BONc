/**
 * Copyright (c) 2007-2009, Fintan Fairmichael, University College Dublin under the BSD licence.
 * See LICENCE.TXT for details.
 */
package ie.ucd.bon.errorreporting;

import ie.ucd.bon.source.SourceLocation;
import ie.ucd.bon.source.SourceReader;

import java.io.PrintStream;

public abstract class BONProblem implements Comparable<BONProblem> {

  private final String sourceLine;
  private final SourceLocation location;

  public BONProblem(SourceLocation sourceLoc) {
    this.location = sourceLoc;
    this.sourceLine = getSourceLine();
  }

  private String getSourceLine() {
    if (location == null || location.getLineNumber() <= 0) {
      return null;
    }
    return SourceReader.getInstance().getSource(location.getSourceFile(), location.getLineNumber());
  }

  public abstract boolean isError();
  public abstract boolean isWarning();

  public SourceLocation getLocation() {
    return location;
  }

  public abstract String getMessage();

  public int compareTo(final BONProblem o) {
    if (this.getLocation() == null) {
      return o.getLocation() == null ? 0 : -1;
    }
    int compare = this.getLocation().compareTo(o.getLocation());

    if (compare != 0) {
      return compare;
    } else {
      if (!this.getClass().equals(o.getClass())) {
        return -1;
      } else {
        return 0;
      }
    }
  }  

  /**
   * Returns a String which simply contains a caret character to indicate the location of
   * the error.
   * @param re The RecognitionException representing the error.
   * @return A String to indicate the position of the error.
   */
  private String getErrorPosition(int caretPosition) {
    StringBuilder sb = new StringBuilder();
    for (int i=0; i < caretPosition; i++) {
      sb.append(' ');
    }
    sb.append('^');
    return sb.toString();
  }

  public void print(PrintStream ps) {
    printStart(ps);
    printMessage(ps);
    printSourcePosition(ps);
  }

  protected void printStart(PrintStream ps) {
    if (location != null) {
      ps.print(location.getSourceFilePath());
      ps.print(':');

      if (location.getLineNumber() > 0) {
        ps.print(location.getLineNumber());
        ps.print(": ");
      } else {
        ps.print(' ');
      }
    }
  }

  protected void printMessage(PrintStream ps) {
    ps.println(getMessage());
  }

  protected void printSourcePosition(PrintStream ps) {
    if (location != null && location.getCharPositionInLine() >= 0 && sourceLine != null) {

      int tabCount = 0;
      StringBuilder sb = new StringBuilder();
      for (int i=0; i < sourceLine.length(); i++) {
        char c = sourceLine.charAt(i);
        if (c == '\t') {
          sb.append("  ");
          if (i < location.getCharPositionInLine()) {
            tabCount++;
          }
        } else {
          sb.append(c);
        }
      }

      ps.println(sb.toString());

      ps.println(getErrorPosition(location.getCharPositionInLine() + tabCount));
    }
  }

  public boolean equals(Object obj) {
    System.out.println("Equals problem");
    if (!(obj instanceof BONProblem)) {
      return false;
    }
    BONProblem other = (BONProblem)obj;
    return this.getClass().equals(other.getClass()) && this.location.equals(other.getLocation()) && this.getMessage().equals(other.getMessage());
  }

  public int hashCode() {
    return this.getLocation().hashCode() + this.getMessage().hashCode();
  }

}

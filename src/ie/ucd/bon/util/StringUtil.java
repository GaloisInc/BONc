/**
 * Copyright (c) 2007, Fintan Fairmichael, University College Dublin under the BSD licence.
 * See LICENCE.TXT for details.
 */
package ie.ucd.bon.util;

public class StringUtil {

  public static String stripForHTML(final String mtb, boolean withSpeechMarks) {
    String stripped = strip(mtb);
    stripped = stripped.replace("<", "&lt;");
    stripped = stripped.replace(">", "&gt;");
    stripped = stripped.replace("&", "&amp;");
    
    StringBuilder sb = new StringBuilder();
    if (withSpeechMarks) {
      sb.append("&#8220;");
    }
    sb.append(stripped.substring(1, stripped.length()-1));
    if (withSpeechMarks) {
      sb.append("&#8221;");
    }
    return sb.toString();
  }
  
  public static String strip(final String mtb) {
    return stripManifestTextBlockToSingleLine(mtb);
  }
  
  public static String stripManifestTextBlockToSingleLine(final String mtb) {
    String[] lines = mtb.split("\\r?\\n");
    if (lines.length == 1) {
      return lines[0];
    }
    
    StringBuilder sb = new StringBuilder();
    sb.append(stripFirstLine(lines[0]));
    
    for (int i=1; i < lines.length-1; i++) {
      sb.append(stripMiddleLine(lines[i]));
    }
    
    sb.append(stripLastLine(lines[lines.length-1]));
    return sb.toString();
  }
  
  private static String stripFirstLine(final String firstLine) {
    String trimmed = firstLine.trim();
    return trimmed.substring(0, trimmed.length()-1); //Lose trailing '/'
  }
  
  private static String stripLastLine(final String lastLine) {
    String trimmed = lastLine.trim();
    return trimmed.substring(1, trimmed.length()); //Lose leading '/'
  }
  
  private static String stripMiddleLine(final String middleLine) {
    String trimmed = middleLine.trim();
    return trimmed.substring(1, trimmed.length()-1); //Lose leading and trailing '/'
  }
  
}

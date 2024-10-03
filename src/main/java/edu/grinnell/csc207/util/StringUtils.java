package edu.grinnell.csc207.util;

import edu.grinnell.csc207.linear.Stack;
import edu.grinnell.csc207.linear.LinkedStack;

import java.io.PrintWriter;

/**
 * Assorted utilities for working with strings.
 * 
 * @author Samuel A. Rebelsky
 * @author Your Name Here
 */ 
public class StringUtils {
  // +------------------+--------------------------------------------
  // | Provided methods |
  // +------------------+
    
  /**
   * Determine whether the parens match in string.
   */
  public static boolean checkMatching(String str) {
    Stack<Character> parens = new LinkedStack<Character>();
    try {
      for (int i = 0; i < str.length(); i++) {
        if (str.charAt(i) == '(') {
          parens.push(str.charAt(i));
        } else if (str.charAt(i) == ')') {
          parens.pop();
        } // if
      }
    } catch (Exception e) {
      // Does nothing.
    } // try/catch
    return parens.isEmpty();
  } // checkMatching

} // class StringUtils    


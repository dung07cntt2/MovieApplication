/**
 * IContainer
 * This file is set of constants used for all rest of files in this project
 * Version 1.0.
 * @author dung.le
 */
package containers;

public interface IContainer {
    public static String DESCRIPTION = "This is Quadration Equation program!";
    public static String EQUATION_FORM = "Ax^2 + Bx + C = 0";
    public static String INPUT_GUIDE = "Please enter value for ";
    public static String A = "A";
    public static String B = "B";
    public static String C = "C";
    public static String COLON = ": ";
    public static int DEFAULT_INT = 0;
    public static String ERROR_MESSAGE  
            = "The values is not legal for the quadration equation!";
    public static String DOUBLE_ROOT_MESSAGE 
            = "There is one distinct real root (double root): ";
    public static String NO_SOLUTION_MESSAGE = "There is no any solution!";
    public static String TWO_SOLUTIONS_MESSAGE
            = "There are two solutions for equation. They are given as below: ";
    public static String INFINITY_SOLUTIONS_MESSAGE 
            = "Result: Infinity!";
    public static String ONE_SOLUTION_MESSAGE 
            = "There is only one solution: ";
}

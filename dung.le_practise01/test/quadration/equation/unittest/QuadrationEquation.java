package quadration.equation.unittest;

/**
 * This class supports some methods to handle a quadratic equation 
 * A quadratic equation is a univariate polynomial equation of the second degree.
 * A general quadratic equation can be written in the form ax^2+bx+c=0
 * Version 1.0
 * @author dung.le
 */
import containers.IContainer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * QuadrationEquation class supports some methods used to handle 
 * the quadration equation and display result
 * @author dung.le
 */
class QuadrationEquation implements IContainer {

    /* a, b, c are constants of quadration equation (a#0) */
    /* x is variable in form of quadration equation: ax*x + bx + c =0 */
    private int a;
    private int b;
    private int c;    
    /* delta variable is calculated according to formula: delta = b*b - 4ac */
    private double delta;
    private double x1, x2; // x1, x2 are the result variables of equation

    /**
     * Some methods in this class are as below 
     */
    /*Define contrustor*/
    public QuadrationEquation() {
        a = IContainer.DEFAULT_INT;
        b = IContainer.DEFAULT_INT;
        c = IContainer.DEFAULT_INT;
    }
    /**
     * setA(), setB(), setC() methods are used to set value of constant A, B, C
     * in the form: Ax^2+ Bx + C=0
     * 
     */
    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setC(int c) {
        this.c = c;
    }
    public void setAll(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    /**
     * some method getA(), getB(), getC(), getX() to get value
     */
    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }
    /**
     * isQuadrationEquation method is to 
     * check if the equation is equation for second degree.
     * @return 
     */
    public boolean isQuadrationEquation() {
        boolean check = false;
        /* check is variable to check if input information is legal */
        if (a != 0) {
            check = true;
        } else {
            check = false;
        }
        return check;
    }

    /**
     * isFirstEquation method is to 
     * check if the equation is equation for first degree.
     * @return 
     */
    public boolean isFirstEquation() {
        boolean check = false;
        /* check is variable to check if input information is legal */
        if (a == 0) {
            check = true;
        } else {
            check = false;
        }
        return check;
    }

    /**
     * handleFirstEquation() method is used to calculate
     * in case the equation of first degree
     */
    public void handleFirstEquation() {
        if (isFirstEquation()) {
            if (c == 0) {
                System.out.println(IContainer.INFINITY_SOLUTIONS_MESSAGE);
            } else {
                double solution = (-1) * c / b;
                x1 = solution;
                x2 = solution;
                System.out.print(IContainer.ONE_SOLUTION_MESSAGE);
                System.out.println(x1);
            }
        }
    }

    /**
     * calculateDelta method returns the value of formula: b*b - 4*a*c
     */
    public double calculateDelta() {
        delta = b * b - 4 * a * c;
        return delta;
    }

    /**
     * handleEquation
     */
    /**
     * handleQuadrationEquation method handles to display results if any 
     * or display error message
     */
    public void handleQuadrationEquation() {
        double x = IContainer.DEFAULT_INT;
        if (!isQuadrationEquation()) { //if not a quadration equation
            handleFirstEquation();
        } else {                       //if be a quadration equation   
            delta = calculateDelta();
            if (delta == 0) {
                x = (-1)*b / (2*a);
                x1 = x;
                x2 = x;
                System.out.print(IContainer.DOUBLE_ROOT_MESSAGE);
                System.out.println(x);
            } else if (delta < 0) {
                System.out.println(IContainer.NO_SOLUTION_MESSAGE);
            } else {
                x1 = ((-1) * b + (Math.sqrt(delta))) / (2 * a);
                x2 = ((-1) * b - (Math.sqrt(delta))) / (2 * a);
                System.out.println(IContainer.TWO_SOLUTIONS_MESSAGE);
                System.out.println(x1);
                System.out.println(x2);
            }
        }
    }

    /**
     * start() method is to start program with some guideline for inputing values
     */
    public static void start() throws IOException {
        int a, b, c;
        double x;
        QuadrationEquation quadrationEquation = new QuadrationEquation();
        System.out.println(IContainer.DESCRIPTION);
        System.out.println(IContainer.EQUATION_FORM);
        System.out.print(IContainer.INPUT_GUIDE + IContainer.A + IContainer.COLON);
        a = QuadrationEquation.ReadInt();
        System.out.print(IContainer.INPUT_GUIDE + IContainer.B + IContainer.COLON);
        b = QuadrationEquation.ReadInt();
        System.out.print(IContainer.INPUT_GUIDE + IContainer.C + IContainer.COLON);
        c = QuadrationEquation.ReadInt();
        quadrationEquation.setAll(a,b,c);
        quadrationEquation.handleQuadrationEquation();
    }

    public static int ReadInt() throws IOException {
        int i = 0;
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        try {
            String s = bufferedReader.readLine();
            i = new Integer(s).intValue();
        } catch (IOException ex) {
            System.out.println(ex);
        }
        return i;
    }

    public static void main(String[] arg) throws IOException {
        QuadrationEquation.start();
    }
}

/**
 * This is unit test for class QuadrationEquation
 * Version 1.0
 * @author dung.le
 */
package quadration.equation.unittest;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author dung.le
 */
public class QuadrationEquationJUnitTest {
    QuadrationEquation quadrationEquation = new QuadrationEquation();
    public QuadrationEquationJUnitTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test
    public void handleTest(){
        quadrationEquation.setAll(0, 2, 0);
        assertEquals(quadrationEquation.isQuadrationEquation(), false);
       
    }
    
}
    
    

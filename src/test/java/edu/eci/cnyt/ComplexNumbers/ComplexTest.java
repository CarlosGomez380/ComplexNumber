package edu.eci.cnyt.ComplexNumbers;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;



/**
 *
 * @author gemec
 */
public class ComplexTest {
    
    public ComplexTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of phase method, of class Complex.
     */
    @Test
    public void testPhase() {
        Complex c = new Complex(1,1);
        assertEquals((Math.PI / 4), c.phase(),0);
    }

    /**
     * Test of modulus method, of class Complex.
     */
    @Test
    public void testModulus() {
        Complex c = new Complex(4,3);
        double d =c.modulus();
        assertEquals(5, d,0);
    }

    /**
     * Test of conjugate method, of class Complex.
     */
    @Test
    public void testConjugate() {
        Complex a = new Complex(2,5);
        Complex b = new Complex(2,-5);
        a.conjugate();
        assertEquals(a,b);
    }

    /**
     * Test of polar method, of class Complex.
     */
    @Test
    public void testPolar() {
        Complex c = new Complex(-1,1);
        double[] p =c.polar();
        assertTrue(p[0]==Math.sqrt(2) && p[1]==(-(Math.PI)/4));
    }
    
}

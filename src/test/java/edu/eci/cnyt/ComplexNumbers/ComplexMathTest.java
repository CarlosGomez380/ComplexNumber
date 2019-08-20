package edu.eci.cnyt.ComplexNumbers;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class ComplexMathTest {
    
    public ComplexMathTest() {
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
     * Test of add method, of class ComplexMath.
     */
    @Test
    public void testAdd() {
        Complex a = new Complex(3, -1);
        Complex b = new Complex(1, 4);
        Complex answ = new Complex(4, 3);
        assertEquals(answ, ComplexMath.add(a, b));
    }
    
    /**
     * Test of Subtraction method, of class ComplexMath.
     */
    @Test
    public void testSubtraction() {
        Complex a = new Complex(3, -1);
        Complex b = new Complex(1, 4);
        Complex answ = new Complex(2, -5);
        assertEquals(answ,ComplexMath.subtraction(a, b));
    }

    /**
     * Test of multiplication method, of class ComplexMath.
     */
    @Test
    public void testMultiplication() {
        Complex a = new Complex(3, -2);
        Complex b = new Complex(1, 2);
        Complex answ = new Complex(7, 4);
        
        assertEquals(answ,ComplexMath.multiplication(a, b));
    }

    /**
     * Test of division method, of class ComplexMath.
     */
    @Test
    public void testDivision() {
        Complex a = new Complex(-2, 1);
        Complex b = new Complex(1, 2);
        Complex answ = new Complex(0, 1);
        assertEquals(answ,ComplexMath.division(a, b));
    }
    
}

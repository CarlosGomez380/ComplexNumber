package edu.eci.cnyt.ComplexNumbers;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class ComplexMatrixTest {
    
    public ComplexMatrixTest() {
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
     * Test of conjugateMatrix method, of class ComplexMatrix.
     */
    @Test
    public void testConjugateMatrix() {
        ComplexMatrix a =new ComplexMatrix(4,1);
        a.setMatrix(0,0,new Complex(6,-4));
        a.setMatrix(1,0,new Complex(7,3));
        a.setMatrix(2,0,new Complex(4.2,-8.1));
        a.setMatrix(3,0,new Complex(0,-3));
        ComplexMatrix b =new ComplexMatrix(4,1);
        b.setMatrix(0,0,new Complex(6,4));
        b.setMatrix(1,0,new Complex(7,-3));
        b.setMatrix(2,0,new Complex(4.2,8.1));
        b.setMatrix(3,0,new Complex(0,3));
        a.conjugateMatrix();
        assertEquals(a,b);
    }

    /**
     * Test of adjoint method, of class ComplexMatrix.
     */
    
}

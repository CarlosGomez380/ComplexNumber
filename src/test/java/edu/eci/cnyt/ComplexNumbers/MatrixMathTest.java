package edu.eci.cnyt.ComplexNumbers;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class MatrixMathTest {
    
    public MatrixMathTest() {
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
     * Test of addMatrix method, of class MatrixMath.
     */
    @Test
    public void testAddMatrix() {
        ComplexMatrix a =new ComplexMatrix(4,1);
        a.setMatrix(0,0,new Complex(6,-4));
        a.setMatrix(1,0,new Complex(7,3));
        a.setMatrix(2,0,new Complex(4.2,-8.1));
        a.setMatrix(3,0,new Complex(0,-3));
        ComplexMatrix b =new ComplexMatrix(4,1);
        b.setMatrix(0,0,new Complex(16,2.3));
        b.setMatrix(1,0,new Complex(0,-7));
        b.setMatrix(2,0,new Complex(6,0));
        b.setMatrix(3,0,new Complex(0,-4));
        ComplexMatrix c =new ComplexMatrix(4,1);
        c.setMatrix(0,0,new Complex(22,-1.7000000000000002));
        c.setMatrix(1,0,new Complex(7,-4));
        c.setMatrix(2,0,new Complex(10.2,-8.1));
        c.setMatrix(3,0,new Complex(0,-7));
        assertEquals(MatrixMath.addMatrix(a,b),c);
    }

    /**
     * Test of subtractionMatrix method, of class MatrixMath.
     */
    @Test
    public void testSubtractionMatrix_ComplexMatrix_ComplexMatrix() {
        ComplexMatrix a =new ComplexMatrix(4,1);
        a.setMatrix(0,0,new Complex(5,3));
        a.setMatrix(1,0,new Complex(7,3));
        a.setMatrix(2,0,new Complex(4,6));
        a.setMatrix(3,0,new Complex(0,-3));
        ComplexMatrix b =new ComplexMatrix(4,1);
        b.setMatrix(0,0,new Complex(3,1));
        b.setMatrix(1,0,new Complex(0,-7));
        b.setMatrix(2,0,new Complex(6,0));
        b.setMatrix(3,0,new Complex(0,-4));
        ComplexMatrix c =new ComplexMatrix(4,1);
        c.setMatrix(0,0,new Complex(2,2));
        c.setMatrix(1,0,new Complex(7,10));
        c.setMatrix(2,0,new Complex(-2,6));
        c.setMatrix(3,0,new Complex(0,1));
        assertEquals(MatrixMath.subtractionMatrix(a,b),c);
    }

    /**
     * Test of subtractionMatrix method, of class MatrixMath.
     */
    @Test
    public void testSubtractionMatrix_ComplexMatrix_Complex() {
        ComplexMatrix a =new ComplexMatrix(4,1);
        a.setMatrix(0,0,new Complex(6,3));
        a.setMatrix(1,0,new Complex(0,0));
        a.setMatrix(2,0,new Complex(5,1));
        a.setMatrix(3,0,new Complex(4,0));
        Complex b= new Complex(3,2);
        ComplexMatrix c =new ComplexMatrix(4,1);
        c.setMatrix(0,0,new Complex(12,21));
        c.setMatrix(1,0,new Complex(0,0));
        c.setMatrix(2,0,new Complex(13,13));
        c.setMatrix(3,0,new Complex(12,8));
        assertEquals(MatrixMath.scalarMultiplication(a,b),c);
    }
    
}

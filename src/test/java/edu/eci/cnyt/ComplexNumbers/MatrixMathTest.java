package edu.eci.cnyt.ComplexNumbers;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
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
     * @throws edu.eci.cnyt.ComplexNumbers.ComplexException
     */
    @Test
    public void testAddMatrix() throws ComplexException{
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
     * Test of addMatrix method, of class MatrixMath.
     * @throws edu.eci.cnyt.ComplexNumbers.ComplexException
     */
    @Test
    public void testAddMatrix1() throws ComplexException{
        ComplexMatrix a =new ComplexMatrix(2,2);
        a.setMatrix(0,0,new Complex(1,1));
        a.setMatrix(0,1, new Complex(2,2));
        a.setMatrix(1,0,new Complex(1,1));
        a.setMatrix(1,1, new Complex(2,2));
        ComplexMatrix b =new ComplexMatrix(2,2);
        b.setMatrix(0,0,new Complex(1,1));
        b.setMatrix(0,1, new Complex(2,2));
        b.setMatrix(1,0,new Complex(1,1));
        b.setMatrix(1,1, new Complex(2,2));
        ComplexMatrix c =new ComplexMatrix(2,2);
        c.setMatrix(0,0,new Complex(2,2));
        c.setMatrix(0,1,new Complex(4,4));
        c.setMatrix(1,0,new Complex(2,2));
        c.setMatrix(1,1,new Complex(4,4));
        assertEquals(MatrixMath.addMatrix(a,b),c);
    }

    /**
     * Test of subtractionMatrix method, of class MatrixMath.
     * @throws edu.eci.cnyt.ComplexNumbers.ComplexException
     */
    @Test
    public void testSubtractionMatrix() throws ComplexException{
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
     * Test of addMatrix method, of class MatrixMath.
     * @throws edu.eci.cnyt.ComplexNumbers.ComplexException
     */
    @Test
    public void testSubtractionMatrix1() throws ComplexException{
        ComplexMatrix a =new ComplexMatrix(2,2);
        a.setMatrix(0,0,new Complex(1,1));
        a.setMatrix(0,1, new Complex(2,2));
        a.setMatrix(1,0,new Complex(1,1));
        a.setMatrix(1,1, new Complex(2,2));
        ComplexMatrix b =new ComplexMatrix(2,2);
        b.setMatrix(0,0,new Complex(1,1));
        b.setMatrix(0,1, new Complex(2,2));
        b.setMatrix(1,0,new Complex(1,1));
        b.setMatrix(1,1, new Complex(2,2));
        ComplexMatrix c =new ComplexMatrix(2,2);
        c.setMatrix(0,0,new Complex(0,0));
        c.setMatrix(0,1,new Complex(0,0));
        c.setMatrix(1,0,new Complex(0,0));
        c.setMatrix(1,1,new Complex(0,0));
        assertEquals(MatrixMath.subtractionMatrix(a,b),c);
    }
    /**
     * Test of scalarProduct method, of class MatrixMath.
     */
    @Test
    public void testScalarMultiplicationMatrix() {
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

    /**
     * Test of MultiplicationMatrix method, of class MatrixMath.
     * @throws edu.eci.cnyt.ComplexNumbers.ComplexException
     */
    @Test
    public void testMultiplicactionMatrix() throws ComplexException{
        ComplexMatrix a =new ComplexMatrix(3,3);
        a.setMatrix(0,0,new Complex(3,2));
        a.setMatrix(0,1,new Complex(0,0));
        a.setMatrix(0,2,new Complex(5,-6));
        a.setMatrix(1,0,new Complex(1,0));
	a.setMatrix(1,1,new Complex(4,2));
	a.setMatrix(1,2,new Complex(0,1));
	a.setMatrix(2,0,new Complex(4,-1));
	a.setMatrix(2,1,new Complex(0,0));
	a.setMatrix(2,2,new Complex(4,0));
        ComplexMatrix b= new ComplexMatrix(3,3);
	b.setMatrix(0,0,new Complex(5,0));
        b.setMatrix(0,1,new Complex(2,-1));
        b.setMatrix(0,2,new Complex(6,-4));
        b.setMatrix(1,0,new Complex(0,0));
	b.setMatrix(1,1,new Complex(4,5));
	b.setMatrix(1,2,new Complex(2,0));
	b.setMatrix(2,0,new Complex(7,-4));
	b.setMatrix(2,1,new Complex(2,7));
	b.setMatrix(2,2,new Complex(0,0));
        ComplexMatrix c =new ComplexMatrix(3,3);
        c.setMatrix(0,0,new Complex(26,-52));
        c.setMatrix(0,1,new Complex(60,24));
        c.setMatrix(0,2,new Complex(26,0));
        c.setMatrix(1,0,new Complex(9,7));
	c.setMatrix(1,1,new Complex(1,29));
	c.setMatrix(1,2,new Complex(14,0));
	c.setMatrix(2,0,new Complex(48,-21));
	c.setMatrix(2,1,new Complex(15,22));
	c.setMatrix(2,2,new Complex(20,-22));
        assertEquals(MatrixMath.multiplicationMatrix(a,b),c);
    }
    
    /**
     * Test of innerProduct method, of class MatrixMath.
     * @throws edu.eci.cnyt.ComplexNumbers.ComplexException
     
    @Test
    public void testInnerProduct() throws ComplexException{
        ComplexMatrix a =new ComplexMatrix(3,1);
	a.setMatrix(0,0,new Complex(5,0));
        a.setMatrix(1,0,new Complex(3,0));
        a.setMatrix(2,0,new Complex(-7,0));
	ComplexMatrix b =new ComplexMatrix(3,1);
	b.setMatrix(0,0,new Complex(6,0));
        b.setMatrix(1,0,new Complex(2,0));
        b.setMatrix(2,0,new Complex(0,0));
	Complex c= new Complex(36,0);
	assertEquals(c,MatrixMath.innerProduct(a,b));
    }
    */
    
    /**
     * Test of norm method, of class ComplexMatrix.
     * @throws edu.eci.cnyt.ComplexNumbers.ComplexException
     */
    @Test
    public void testnorm() throws ComplexException{
	ComplexMatrix a =new ComplexMatrix(3,1);
        a.setMatrix(0,0,new Complex(3,0));
        a.setMatrix(1,0,new Complex(-6,0));
        a.setMatrix(2,0,new Complex(2,0));
	Complex c= new Complex(7,0);
        assertEquals(MatrixMath.norm(a),c);
    }

    /**
     * Test of distanceMatrix method, of class ComplexMatrix.
     * @throws edu.eci.cnyt.ComplexNumbers.ComplexException
     */
    @Test
    public void testDistanceMatrix() throws ComplexException{
	ComplexMatrix a =new ComplexMatrix(3,1);
        a.setMatrix(0,0,new Complex(3,0));
        a.setMatrix(1,0,new Complex(1,0));
        a.setMatrix(2,0,new Complex(2,0));
	ComplexMatrix b =new ComplexMatrix(3,1);
        b.setMatrix(0,0,new Complex(2,0));
        b.setMatrix(1,0,new Complex(2,0));
        b.setMatrix(2,0,new Complex(-1,0));
	Complex c= new Complex(Math.sqrt(11),0);
        assertEquals(MatrixMath.distanceMatrix(a,b),c);
    }

    @Test
    public void testTensorProduct() {
        ComplexMatrix a =new ComplexMatrix(2,1);
        a.setMatrix(0,0,new Complex(2,0));
        a.setMatrix(1,0,new Complex(3,0));
        ComplexMatrix b =new ComplexMatrix(3,1);
        b.setMatrix(0,0,new Complex(4,0));
        b.setMatrix(1,0,new Complex(6,0));
        b.setMatrix(2,0,new Complex(3,0));
        ComplexMatrix c =new ComplexMatrix(6,1);
        c.setMatrix(0,0,new Complex(8,0));
        c.setMatrix(1,0,new Complex(12,0));
        c.setMatrix(2,0,new Complex(6,0));
        c.setMatrix(3,0,new Complex(12,0));
        c.setMatrix(4,0,new Complex(18,0));
        c.setMatrix(5,0,new Complex(9,0));
        assertEquals(MatrixMath.tensorProduct(a, b), c);
    }
    
    
    /**
     * Test of marbles method, of class ComplexMatrix.
     * @throws edu.eci.cnyt.ComplexNumbers.ComplexException
    */
    @Test
    public void testMarbles() throws ComplexException {
        ComplexMatrix a =new ComplexMatrix(6,6);
        a.setMatrix(0,0,new Complex(0,0));
        a.setMatrix(0,1,new Complex(0,0));
        a.setMatrix(0,2,new Complex(0,0));
        a.setMatrix(0,3,new Complex(0,0));
        a.setMatrix(0,4,new Complex(0,0));
        a.setMatrix(0,5,new Complex(0,0));
        a.setMatrix(1,0,new Complex(0,0));
        a.setMatrix(1,1,new Complex(0,0));
        a.setMatrix(1,2,new Complex(0,0));
        a.setMatrix(1,3,new Complex(0,0));
        a.setMatrix(1,4,new Complex(0,0));
        a.setMatrix(1,5,new Complex(0,0));
        a.setMatrix(2,0,new Complex(0,0));
        a.setMatrix(2,1,new Complex(1,0));
        a.setMatrix(2,2,new Complex(0,0));
        a.setMatrix(2,3,new Complex(0,0));
        a.setMatrix(2,4,new Complex(0,0));
        a.setMatrix(2,5,new Complex(1,0));
        a.setMatrix(3,0,new Complex(0,0));
        a.setMatrix(3,1,new Complex(0,0));
        a.setMatrix(3,2,new Complex(0,0));
        a.setMatrix(3,3,new Complex(1,0));
        a.setMatrix(3,4,new Complex(0,0));
        a.setMatrix(3,5,new Complex(0,0));
        a.setMatrix(4,0,new Complex(0,0));
        a.setMatrix(4,1,new Complex(0,0));
        a.setMatrix(4,2,new Complex(1,0));
        a.setMatrix(4,3,new Complex(0,0));
        a.setMatrix(4,4,new Complex(0,0));
        a.setMatrix(4,5,new Complex(0,0));
        a.setMatrix(5,0,new Complex(1,0));
        a.setMatrix(5,1,new Complex(0,0));
        a.setMatrix(5,2,new Complex(0,0));
        a.setMatrix(5,3,new Complex(0,0));
        a.setMatrix(5,4,new Complex(1,0));
        a.setMatrix(5,5,new Complex(0,0));
        ComplexMatrix b =new ComplexMatrix(6,1);
        b.setMatrix(0,0,new Complex(6,0));
        b.setMatrix(1,0,new Complex(2,0));
        b.setMatrix(2,0,new Complex(1,0));
        b.setMatrix(3,0,new Complex(5,0));
        b.setMatrix(4,0,new Complex(3,0));
        b.setMatrix(5,0,new Complex(10,0));
        ComplexMatrix c =new ComplexMatrix(6,1);
        c.setMatrix(0,0,new Complex(0,0));
        c.setMatrix(1,0,new Complex(0,0));
        c.setMatrix(2,0,new Complex(12,0));
        c.setMatrix(3,0,new Complex(5,0));
        c.setMatrix(4,0,new Complex(1,0));
        c.setMatrix(5,0,new Complex(9,0));
        
        ComplexMatrix answ= MatrixMath.marbles(a,b,1);
        assertEquals(c,answ);
    }
    
    /**
     * Test of marbles method, of class ComplexMatrix.
     * @throws edu.eci.cnyt.ComplexNumbers.ComplexException
     */
    @Test
    public void testMarbles1() throws ComplexException {
        ComplexMatrix a = new ComplexMatrix(8,8);
        a.setMatrix(0,0,new Complex(0,0));
        a.setMatrix(0,1,new Complex(0,0));
        a.setMatrix(0,2,new Complex(0,0));
        a.setMatrix(0,3,new Complex(0,0));
        a.setMatrix(0,4,new Complex(0,0));
        a.setMatrix(0,5,new Complex(0,0));
        a.setMatrix(0,6,new Complex(0,0));
        a.setMatrix(0,7,new Complex(0,0));
        a.setMatrix(1,0,new Complex(1/2,0));
        a.setMatrix(1,1,new Complex(0,0));
        a.setMatrix(1,2,new Complex(0,0));
        a.setMatrix(1,3,new Complex(0,0));
        a.setMatrix(1,4,new Complex(0,0));
        a.setMatrix(1,5,new Complex(0,0));
        a.setMatrix(1,6,new Complex(0,0));
        a.setMatrix(1,7,new Complex(0,0));
        a.setMatrix(2,0,new Complex(1/2,0));
        a.setMatrix(2,1,new Complex(0,0));
        a.setMatrix(2,2,new Complex(0,0));
        a.setMatrix(2,3,new Complex(0,0));
        a.setMatrix(2,4,new Complex(0,0));
        a.setMatrix(2,5,new Complex(0,0));
        a.setMatrix(2,6,new Complex(0,0));
        a.setMatrix(2,7,new Complex(0,0));
        a.setMatrix(3,0,new Complex(0,0));
        a.setMatrix(3,1,new Complex(1/3,0));
        a.setMatrix(3,2,new Complex(0,0));
        a.setMatrix(3,3,new Complex(1,0));
        a.setMatrix(3,4,new Complex(0,0));
        a.setMatrix(3,5,new Complex(0,0));
        a.setMatrix(3,6,new Complex(0,0));
        a.setMatrix(3,7,new Complex(0,0));
        a.setMatrix(4,0,new Complex(0,0));
        a.setMatrix(4,1,new Complex(1/3,0));
        a.setMatrix(4,2,new Complex(0,0));
        a.setMatrix(4,3,new Complex(0,0));
        a.setMatrix(4,4,new Complex(1,0));
        a.setMatrix(4,5,new Complex(0,0));
        a.setMatrix(4,6,new Complex(0,0));
        a.setMatrix(4,7,new Complex(0,0));
        a.setMatrix(5,0,new Complex(0,0));
        a.setMatrix(5,1,new Complex(1/3,0));
        a.setMatrix(5,2,new Complex(1/3,0));
        a.setMatrix(5,3,new Complex(0,0));
        a.setMatrix(5,4,new Complex(0,0));
        a.setMatrix(5,5,new Complex(1,0));
        a.setMatrix(5,6,new Complex(0,0));
        a.setMatrix(5,7,new Complex(0,0));
        a.setMatrix(6,0,new Complex(0,0));
        a.setMatrix(6,1,new Complex(0,0));
        a.setMatrix(6,2,new Complex(1/3,0));
        a.setMatrix(6,3,new Complex(0,0));
        a.setMatrix(6,4,new Complex(0,0));
        a.setMatrix(6,5,new Complex(0,0));
        a.setMatrix(6,6,new Complex(1,0));
        a.setMatrix(6,7,new Complex(0,0));
        a.setMatrix(7,0,new Complex(0,0));
        a.setMatrix(7,1,new Complex(0,0));
        a.setMatrix(7,2,new Complex(1/3,0));
        a.setMatrix(7,3,new Complex(0,0));
        a.setMatrix(7,4,new Complex(0,0));
        a.setMatrix(7,5,new Complex(0,0));
        a.setMatrix(7,6,new Complex(0,0));
        a.setMatrix(7,7,new Complex(1,0));
        ComplexMatrix b =new ComplexMatrix(8,1);
        b.setMatrix(0,0,new Complex(1,0));
        b.setMatrix(1,0,new Complex(0,0));
        b.setMatrix(2,0,new Complex(0,0));
        b.setMatrix(3,0,new Complex(0,0));
        b.setMatrix(4,0,new Complex(0,0));
        b.setMatrix(5,0,new Complex(0,0));
        b.setMatrix(6,0,new Complex(0,0));
        b.setMatrix(7,0,new Complex(0,0));
        ComplexMatrix d =new ComplexMatrix(8,1);
        d.setMatrix(0,0,new Complex(0,0));
        d.setMatrix(1,0,new Complex(0,0));
        d.setMatrix(2,0,new Complex(0,0));
        d.setMatrix(3,0,new Complex(1/6,0));
        d.setMatrix(4,0,new Complex(1/6,0));
        d.setMatrix(5,0,new Complex(1/3,0));
        d.setMatrix(6,0,new Complex(1/6,0));
        d.setMatrix(7,0,new Complex(1/6,0));
        ComplexMatrix answ= MatrixMath.marbles(a,b,2);
        assertEquals(d,answ); 
    }
    
    @Test
    public void meanTest() throws ComplexException{
        ComplexMatrix o = new ComplexMatrix(2,2);
        ComplexMatrix k = new ComplexMatrix(2,1);
        Complex res = new Complex(2.5,0);
        o.setMatrix(0,0,new Complex(1,0));
        o.setMatrix(0,1,new Complex(0,-1));
        o.setMatrix(1,0,new Complex(0,1));
        o.setMatrix(1,1,new Complex(2,0));
        k.setMatrix(0,0, new Complex(Math.sqrt(2)/2,0));
        k.setMatrix(1,0, new Complex(0,Math.sqrt(2)/2));
        Assert.assertEquals(MatrixMath.mean(o,k).getReal(),res.getImag(),10);

    }

    @Test
    public void varianceTest() throws ComplexException{
        ComplexMatrix o = new ComplexMatrix(2,2);
        ComplexMatrix k = new ComplexMatrix(2,1);
        Complex res = new Complex(2.5,0);
        o.setMatrix(0,0,new Complex(1,0));
        o.setMatrix(0,1,new Complex(0,-1));
        o.setMatrix(1,0,new Complex(0,1));
        o.setMatrix(1,1,new Complex(2,0));
        k.setMatrix(0,0, new Complex(Math.sqrt(2)/2,0));
        k.setMatrix(1,0, new Complex(0,Math.sqrt(2)/2));
        Assert.assertEquals(MatrixMath.mean(o,k).getReal(),res.getImag(),10);
    }

    @Test
    public void systemDinamicTest() throws ComplexException{

        ComplexMatrix k = new ComplexMatrix(2, 1);
        ComplexMatrix o1 = new ComplexMatrix(2,2);
        ComplexMatrix o2 = new ComplexMatrix(2,2);
        ComplexMatrix res = new ComplexMatrix(2,1);
        res.setMatrix(0,0,new Complex(1.4142135623730951,0));
        res.setMatrix(1,0,new Complex(0,0));
        k.setMatrix( 0, 0,new Complex(1, 0));
        k.setMatrix( 1, 0,new Complex(1, 0));
        o1.setMatrix(0,0,new Complex(0,0));
        o1.setMatrix(1,0,new Complex(1,0));
        o1.setMatrix(0,1,new Complex(1,0));
        o1.setMatrix(1,1,new Complex(0,0));
        o2.setMatrix(0,0,new Complex(Math.sqrt(2) / 2,0));
        o2.setMatrix(1,0,new Complex(Math.sqrt(2) / 2,0));
        o2.setMatrix(0,1,new Complex(Math.sqrt(2) / 2,0));
        o2.setMatrix(1,1,new Complex(-Math.sqrt(2) / 2,0));

        ArrayList<ComplexMatrix> orbit = new ArrayList<ComplexMatrix>();
        orbit.add(o1);
        orbit.add(o2);

        Assert.assertEquals(res,MatrixMath.systemDinamic(k,orbit));


    }

}

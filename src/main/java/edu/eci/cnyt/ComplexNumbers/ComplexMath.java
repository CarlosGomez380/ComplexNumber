package edu.eci.cnyt.ComplexNumbers;

public class ComplexMath {
    
    /**
     * Make addition of two complex numbers.
     * 
     * @param c1 Complex number to make the addition.
     * @param c2 Complex number to make the addition.
     * @return Result of the addition of the two complex numbers.
     */
    public static Complex add(Complex c1, Complex c2){
        double partReal=c1.getReal()+c2.getReal();
        double partImag=c1.getImag()+c2.getImag();
        return new Complex(partReal,partImag);
    }  
    
    /**
     * Make subtraction of two complex numbers.
     * 
     * @param c1 Complex number to make the subtraction.
     * @param c2 Complex number to make the subtraction.
     * @return Result of the subtraction of the two complex numbers.
     */
    public static Complex subtraction(Complex c1, Complex c2){
        double partReal=c1.getReal()-c2.getReal();
        double partImag=c1.getImag()-c2.getImag();
        return new Complex(partReal,partImag);
    }  
    
    /**
     * Make multiplication of two complex numbers.
     * 
     * @param c1 Complex number to make the multiplication.
     * @param c2 Complex number to make the multiplication.
     * @return Result of the multiplication of the two complex numbers.
     */
    public static Complex multiplication(Complex c1, Complex c2){
        return new Complex ((c1.getReal()*c2.getReal()) - (c1.getImag()*c2.getImag()),
                (c1.getReal()*c2.getImag()) + (c1.getImag()*c2.getReal()));
    }  
    
    /**
     * Make division of two complex numbers.
     * 
     * @param c1 Complex number to make the division.
     * @param c2 Complex number to make the division.
     * @return Result of the division of the two complex numbers.
     */
    public static Complex division(Complex c1, Complex c2){
        double partDown =Math.pow(c2.getReal(),2)+ Math.pow(c2.getImag(),2);
        return new Complex ((c1.getReal()*c2.getReal()+ c1.getImag()*c2.getImag())/partDown,
                (c2.getReal()*c1.getImag() - c1.getReal()*c2.getImag())/partDown);
    }
}


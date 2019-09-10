package edu.eci.cnyt.ComplexNumbers;

import java.util.Objects;

public class Complex {
    private double real;
    private double imag;
    
    /*
     * Complex number object constructor.
     *
     * @param real Real part of the complex number.
     * @param imag Imaginary part of the complex number.
     */
    public Complex(double real, double imag){
        this.real=real;
        this.imag=imag;
    }
    
    /**
     * Calculate the phase of a complex number.
     *
     * @return The phase of the complex number.
     */
    public double phase(){
        return Math.atan(imag/real);
    }
    
    /**
     * Calculate the modulus of a complex number.
     *
     * @return The modulus of the complex number.
     */
    public double modulus(){
        return Math.sqrt(Math.pow(real,2) + Math.pow(imag,2));
    }
    
    /**
     * Calculate the conjugate of a complex number.
     */
    public void conjugate(){
        if (imag!=0){
            imag=imag*(-1);
        }
    }
    /**
     * Calculate the polar representation of a complex number.
     * 
     * @return The polar representation of the complex number.
     */
    public double[] polar() {
        double[] p = new double[2];
        p[0] = modulus();
        p[1] = phase();
        return p;
    }

    /**
     * Apply the inverse form on the complex number.
     */
    public void inverse() {
        if (real != 0) {
            real = -real;
        }
        if (imag != 0) {
            imag = -imag;
        }
    }
    
    /**
     * @return the real part of a complex number.
     */
    public double getReal() {
        return real;
    }
    
    /**
     * Changes the real part of the complex number.
     *
     * @param real New real part.
     */
    public void setReal(double real){
        this.real=real;
    }

    /**
     * @return the imaginary part of a complex number.
     */
    public double getImag() {
        return imag;
    }
    
    /**
     * Changes the real part of the complex number.
     *
     * @param imag New imaginary part.
     */
    public void setImag(double imag) {
        this.imag=imag;
    }
    
    @Override
    public String toString() {
        if (imag > 0) {
            return
                    real +
                            " +" + imag +
                            'i';
        }else if(imag==0){
            return
                    real +"";
        }else{
            return
                    real +
                            " " + imag +
                            'i';
        }
    }
    
     @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Complex)) return false;
        Complex that = (Complex) o;
        return Double.compare(that.real, real) == 0 &&
                Double.compare(that.imag, imag) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(real, imag);
    }
}
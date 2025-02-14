
package edu.eci.cnyt.ComplexNumbers;



public class ComplexMatrix {
    private int row;
    private int column;
    private Complex[][] matrix;
    
    /*
     * Complex matrix of complex numbers object constructor.
     *
     * @param real row Number of rows.
     * @param imag column Number of columns.
     */
    public ComplexMatrix(int row, int column){
        this.row = row;
        this.column = column;
        matrix = new Complex[row][column];
    }

    /**
     * Complex matrix constructor
     * @param matrix1 Static Matrix with complex numbers in it.
     */
    public ComplexMatrix(Complex[][] matrix1) {
	row= matrix1.length;
	column= matrix1[0].length;
	matrix= new Complex[matrix1.length][matrix1[0].length];
	for (int i=0; i<row; i++){
            for (int j=0;j<column;j++){
		matrix[i][j]= new Complex(0,0);
		matrix[i][j].setReal(matrix1[i][j].getReal());
		matrix[i][j].setImag(matrix1[i][j].getImag());
            }
        }
    }
    
    /*
    * Make transpose of a matrix
    */
    public void transpose(){
	Complex[][] matrixT = new Complex[column][row];
        for (int i=0; i<row; i++){
            for (int j=0;j<column;j++){
                 matrixT[j][i] = matrix[i][j];
            }
        }
        matrix = matrixT;
	int saver=row;
	setRow(column);
	setColumn(saver);
    }
    
    /*
    *Make conjugate of a matrix
    */
    public void conjugateMatrix(){
        for (int i=0; i<row; i++){
            for (int j=0;j<column;j++){
               matrix[i][j].conjugate(); 
            }
        }
    }
    
    /*
    *Make adjoint of a matrix
    */
    public void adjoint(){
        this.transpose();
        this.conjugateMatrix();
    }
    
    /**
     * Makes the inverse form of the complex matrix.
     */
    public void inverse() {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                matrix[i][j].inverse();
            }
        }
    }
    
    public boolean isVector(){
        return (getColumn() == 1 || getRow() == 1) && getColumn()!= getRow();
    }

    /**
     * Answers if the matrix is an hermitian one.
     * @return true if the matrix is hermitian, false if not.
     */
    public boolean isHermitian(){
        ComplexMatrix a = new ComplexMatrix(matrix);
        a.adjoint();
        return this.equals(a);
    }

    /**
     * Returns if the matrix is unitary or not.
     * @return true if the matrix is unitary, false if not.
     * @throws edu.eci.cnyt.ComplexNumbers.ComplexException
     */
    public boolean isUnitary() throws ComplexException {
        if(getColumn()!=getRow()){
            return false;
        }else{
            ComplexMatrix a = new ComplexMatrix(matrix);
            a.adjoint();
            ComplexMatrix m =MatrixMath.multiplicationMatrix(this,a);
            if(m.equals(MatrixMath.multiplicationMatrix(a,this))){
                for (int  i= 0; row < m.getRow(); i++) {
                    for (int j= 0; j< m.getColumn(); j++) {
                        if((i==j && !m.getMatrix(i, j).equals(new Complex(1, 0))) || (row!=column && !m.getMatrix(i,j).equals(new Complex(0, 0)))){
                            return false;
                        }
                    }
                }
                return true;
            }else{return false;}
        }
    }

    /**
     * @return the number of rows.
     */
    public int getRow() {
        return row;
    }
    
    /**
     * Changes the number of rows.
     *
     * @param row New number of rows.
     */
    public void setRow(int row){
        this.row=row;
    }
    
    /**
     * @return the number of columns.
     */
    public int getColumn() {
        return column;
    }
    
    /**
     * Changes the number of columns.
     *
     * @param column New number of columns.
     */
    public void setColumn(int column){
        this.column=column;
    }
    
    /**
     * 
     * @param row Number of rows.
     * @param column Number of columns.
     * @return the matrix.
     */
    public Complex getMatrix(int row, int column) {
        return matrix[row][column];
    }
    
    /**
     * Changes the number of columns.
     *
     * @param row New number of rows.
     * @param column New number of columns.
     * @param c New complex.
     */
    public void setMatrix(int row,int column, Complex c){
        matrix[row][column]=c;
    }
    
    @Override
    public String toString() {
        String str = "";
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                str = str + matrix[row][column].toString();
                if (column == matrix[row].length - 1) {
                    str = str + "\n";
                } else {
                    str = str + " , ";
                }
            }
        }
        return str;
    }
    
    @Override
    public boolean equals(Object o) {
        if (o instanceof ComplexMatrix) {
            if(((ComplexMatrix) o).getColumn()!=getColumn() || ((ComplexMatrix) o).getRow()!=getRow()){
                return false;
            }
            for (int row = 0; row < matrix.length; row++) {
                for (int column = 0; column < matrix[row].length; column++) {
                    if (!matrix[row][column].equals(((ComplexMatrix) o).getMatrix(row, column))) {
                        return false;
                    }
                }
            }
            return true;
        } else {
            return false;
        }
    }
    
    
}

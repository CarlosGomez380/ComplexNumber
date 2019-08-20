
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
    
    /*
    * Make transpose of a matrix
    */
    public void transpose(){
        Complex[][] matrixT = new Complex[matrix[0].length][matrix.length];
        for (int i=0; i<row; i++){
            for (int j=i+1;j<column;j++){
                 matrixT[column][row] = matrix[row][column];
            }
        }
        matrix = matrixT;
    }
    
    /*
    *Make conjugate of a matrix
    */
    public void conjugateMatrix(){
        System.out.println(column);
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
        transpose();
        conjugateMatrix();
    }
    
    /**
     * @return Number of columns
     */
    public int columnLength() {
        return matrix[0].length;
    }
    
    /**
     * @return Number of rows
     */
    public int rowLength() {
        return matrix.length;
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
     * @return the number of column.
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
            if(((ComplexMatrix) o).columnLength()!=columnLength() || ((ComplexMatrix) o).rowLength()!=rowLength()){
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

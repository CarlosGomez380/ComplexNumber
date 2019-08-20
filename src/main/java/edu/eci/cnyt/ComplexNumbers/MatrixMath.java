package edu.eci.cnyt.ComplexNumbers;

public class MatrixMath {
    
    /**
     * Make addition of two complex Matrices.
     * 
     * @param matrix1 First matrix to add.
     * @param matrix2 Second matrix to add.
     * @return Answer of the addition of matrix1 and matrix2.
     */
    public static ComplexMatrix addMatrix(ComplexMatrix matrix1,ComplexMatrix matrix2){
        ComplexMatrix answ= new ComplexMatrix(matrix1.getRow(),matrix1.getColumn());
        for (int i=0; i<matrix1.getRow(); i++){
            for (int j=0;j<matrix1.getColumn();j++){
                answ.setMatrix(i,j,ComplexMath.add(matrix1.getMatrix(i,j),matrix2.getMatrix(i,j)));
            }
        }
        return answ;
    }
    
    /**
     * Make subtraction of two complex Matrices.
     * 
     * @param matrix1 First matrix to subtract.
     * @param matrix2 Second matrix to subtract.
     * @return Answer of the subtraction of matrix1 and matrix2.
     */
    public static ComplexMatrix subtractionMatrix(ComplexMatrix matrix1,ComplexMatrix matrix2){
        ComplexMatrix answ= new ComplexMatrix(matrix1.getRow(),matrix1.getColumn());
        for (int i=0; i<matrix1.getRow(); i++){
            for (int j=0;j<matrix1.getColumn();j++){
                answ.setMatrix(i,j,ComplexMath.subtraction(matrix1.getMatrix(i,j),matrix2.getMatrix(i,j)));
            }
        }
        return answ;
    }
    
    /**
     * Make scalar multiplication between a complex and a matrix.
     * 
     * @param matrix Matrix to do the scalar multiplication.
     * @param c Complex to do the scalar multiplication.
     * @return Answer of the scalar multiplication.
     */
    public static ComplexMatrix scalarMultiplication(ComplexMatrix matrix,Complex c){
        ComplexMatrix answ= new ComplexMatrix(matrix.getRow(),matrix.getColumn());
        for (int i=0; i<matrix.getRow(); i++){
            for (int j=0;j<matrix.getColumn();j++){
                answ.setMatrix(i,j,ComplexMath.multiplication(matrix.getMatrix(i,j),c));
            }
        }
        return answ;
    }
}

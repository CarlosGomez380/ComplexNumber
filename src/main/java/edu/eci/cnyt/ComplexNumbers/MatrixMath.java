package edu.eci.cnyt.ComplexNumbers;

public class MatrixMath {
    
    /**
     * Make addition of two complex Matrices.
     * 
     * @param matrix1 First matrix to add.
     * @param matrix2 Second matrix to add.
     * @return Answer of the addition of matrix1 and matrix2.
     * @throws edu.eci.cnyt.ComplexNumbers.ComplexException
     */
    public static ComplexMatrix addMatrix(ComplexMatrix matrix1,ComplexMatrix matrix2) throws ComplexException{
        if(matrix1.getRow()== matrix2.getRow() && matrix1.getColumn() == matrix2.getColumn()){
            ComplexMatrix answ= new ComplexMatrix(matrix1.getRow(),matrix1.getColumn());
            for (int i=0; i<matrix1.getRow(); i++){
                for (int j=0;j<matrix1.getColumn();j++){
                    answ.setMatrix(i,j,ComplexMath.add(matrix1.getMatrix(i,j),matrix2.getMatrix(i,j)));
                }
            }
            return answ;
        }
        else{
            throw new ComplexException("Both matrices have different dimesions");
        }
    }
    
    /**
     * Make subtraction of two complex Matrices.
     * 
     * @param matrix1 First matrix to subtract.
     * @param matrix2 Second matrix to subtract.
     * @return Answer of the subtraction of matrix1 and matrix2.
     * @throws edu.eci.cnyt.ComplexNumbers.ComplexException
     */
    public static ComplexMatrix subtractionMatrix(ComplexMatrix matrix1,ComplexMatrix matrix2)throws ComplexException{
        if(matrix1.getRow()== matrix2.getRow() && matrix1.getColumn() == matrix2.getColumn()){
            ComplexMatrix answ= new ComplexMatrix(matrix1.getRow(),matrix1.getColumn());
            for (int i=0; i<matrix1.getRow(); i++){
                for (int j=0;j<matrix1.getColumn();j++){
                    answ.setMatrix(i,j,ComplexMath.subtraction(matrix1.getMatrix(i,j),matrix2.getMatrix(i,j)));
                }
            }
            return answ;
        }
        else{
            throw new ComplexException("Both matrices have different dimesions");
        }
    }
    
    /**
     * Make scalar multiplication between a complex and a matrix.
     * 
     * @param matrix Matrix to do the scalar multiplication.
     * @param c Complex to do the scalar
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
    
    /**
     * Make multiplication of two complex Matrices.
     * 
     * @param matrix1 First matrix to subtract.
     * @param matrix2 Second matrix to subtract.
     * @return Answer of the multiplication of matrix1 and matrix2.
     * @throws edu.eci.cnyt.ComplexNumbers.ComplexException
     */
    public static ComplexMatrix multiplicationMatrix(ComplexMatrix matrix1,ComplexMatrix matrix2)throws ComplexException{
        if(matrix1.getColumn() == matrix2.getRow()){
            ComplexMatrix answ= new ComplexMatrix(matrix1.getRow(),matrix2.getColumn());
            for (int i=0; i<matrix1.getRow(); i++){
                for (int j=0;j<matrix2.getColumn();j++){
		    answ.setMatrix(i,j, new Complex(0,0));
                    for (int k=0; k< matrix2.getRow();k++){
                        answ.setMatrix(i,j,ComplexMath.add(answ.getMatrix(i,j),
                                ComplexMath.multiplication(matrix1.getMatrix(i,k),matrix2.getMatrix(k,j))));
                    }
                }
            }
            return answ;
        }
        else{
            throw new ComplexException("Both matrices have different dimesions");
        }
    }
    
    /**
     * Multiplies a complex matrix n*n with a vector n
     * 
     * @param matrix1 Complex matrix of n*n
     * @param matrix2 Complex vector of n
     * @return Action operation between a and b.
     * @throws edu.eci.cnyt.ComplexNumbers.ComplexException
     */
    public static  ComplexMatrix action(ComplexMatrix matrix1,ComplexMatrix matrix2) throws ComplexException {
        if(matrix1.getColumn()!=matrix1.getRow()){
            throw new ComplexException("The given matrix must be a square one.");
        }else if(matrix1.getRow()!=matrix2.getColumn() || !matrix2.isVector()){
            throw new ComplexException("matrix2 must be a complex vector with same row lenght of matrix matrix1");
        }else{
            return multiplicationMatrix(matrix1,matrix2);
        }
    }
    
    /**
     * Make the Inner Product of two complex Matrices.
     * 
     * @param matrix1 First matrix to subtract.
     * @param matrix2 Second matrix to subtract.
     * @return a Complex of the innerProduct of matrix1 and matrix2.
     * @throws edu.eci.cnyt.ComplexNumbers.ComplexException
     */
    public static Complex innerProduct(ComplexMatrix matrix1,ComplexMatrix matrix2)throws ComplexException{
	Complex res= new Complex(0,0);
        if(matrix1.isVector()==true && matrix2.isVector()==true){
		matrix1.adjoint();
		ComplexMatrix answ = multiplicationMatrix(matrix1,matrix2);
		for (int i=0; i<answ.getRow(); i++){
                	for (int j=0;j<answ.getColumn();j++){
				res= ComplexMath.add(res,answ.getMatrix(i,j));
			}
		}
		return res;		
	}
	else if (matrix1.getRow()==matrix1.getColumn() && matrix2.getRow()==matrix2.getColumn() && matrix1.getRow()==matrix2.getColumn()){
		matrix1.adjoint();
		ComplexMatrix answ= new ComplexMatrix(matrix1.getRow(),matrix2.getColumn());
		answ=multiplicationMatrix(matrix1,matrix2);
		for (int i=0; i<matrix1.getRow(); i++){
			for (int j=0; j<matrix1.getColumn(); j++){
				res= ComplexMath.add(res,answ.getMatrix(i,j));
			}
		}
		return res;
	}
	else{
		throw new ComplexException("Both matrices have different dimesions");
	}
    }
 
    /**
     * Gives the norm of the vector.
     * @param matrix complex matrix
     * @return The norm of the vector.
     * @throws ComplexException
     */
    public static Complex norm(ComplexMatrix matrix) throws ComplexException{
	Complex answ= new Complex(0,0);
	ComplexMatrix matrix2= new ComplexMatrix(matrix.getRow(),matrix.getColumn());
	for (int i=0; i<matrix.getRow(); i++){
		for (int j=0; j<matrix.getColumn(); j++){
			matrix2.setMatrix(i,j,matrix.getMatrix(i,j));
		}
	}
	
	answ = innerProduct(matrix,matrix2);
	answ.setReal(Math.sqrt(answ.getReal()));
	return answ;
    }

    /**
     * Gives the distance between two matrices.
     * @param matrix1 complex matrix
     * @param matrix2 complex matrix
     * @return The distance between two matrices.
     * @throws ComplexException
     */
    public static Complex distanceMatrix(ComplexMatrix matrix1, ComplexMatrix matrix2) throws ComplexException{
	ComplexMatrix matrix3= subtractionMatrix(matrix1,matrix2);
	return norm(matrix3);
    }

    /**
     * Return the tensor product between two complex matrices.
     * @param matrix1 complex matrix
     * @param matrix2 complex matrix
     * @return tensor product between a and b.
     */
    public static ComplexMatrix tensorProduct(ComplexMatrix matrix1, ComplexMatrix matrix2){
        ComplexMatrix answer= new ComplexMatrix(matrix1.getRow()*matrix2.getRow(),matrix1.getColumn()*matrix2.getColumn());
        for (int row1 = 0; row1 < matrix1.getRow(); row1++) {
            for (int column1 = 0; column1 < matrix1.getColumn(); column1++) {
                for (int row2 = 0; row2 < matrix2.getRow(); row2++) {
                    for (int column2 = 0; column2 < matrix2.getColumn(); column2++) {
                        answer.setMatrix(row1*matrix2.getRow()+row2,column1*matrix2.getColumn()+column2,ComplexMath.multiplication(matrix1.getMatrix(row1,column1),matrix2.getMatrix(row2,column2)));
                    }
                }
            }
        }
        return answer;
    }
    
    public static ComplexMatrix matrixRecursive(ComplexMatrix matrix1,ComplexMatrix matrix2, int clicks) throws ComplexException{
        if(matrix1.getColumn() == matrix2.getRow()){
            if(clicks==1){
                return matrix1;
            }else{
                ComplexMatrix matrix3= multiplicationMatrix(matrix1,matrix2);
                return matrixRecursive(matrix3,matrix2,clicks-1);
            }
        }else{
            throw new ComplexException("Both matrices have different dimesions");
        }
    }

    public static ComplexMatrix marbles(ComplexMatrix matrix, ComplexMatrix vector, int clicks) throws ComplexException{
        if(matrix.getColumn() == vector.getRow() && clicks>0 && vector.isVector()){
            ComplexMatrix answ= new ComplexMatrix(vector.getRow(),1);
            ComplexMatrix matrix1=matrixRecursive(matrix,matrix,clicks);
            for (int i=0; i<matrix1.getRow(); i++){
                Complex value =new Complex(0,0);
                for (int j=0;j<vector.getRow();j++){
                    /**
                    System.out.println(matrix1.getMatrix(i,j));
                    System.out.println(vector.getMatrix(j,0));
                    */
                    value = ComplexMath.add(ComplexMath.multiplication(matrix1.getMatrix(i,j), vector.getMatrix(j,0)) , value);
                    /**
                    System.out.println(value);
                    */
                }
                answ.setMatrix(i,0,value );
            }
            return answ;
        }else{
            throw new ComplexException("The matrix and vector have different dimesions");
        }
    }
}

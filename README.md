# Libreria de numeros complejos 

This library introduces you into the Complex space. It implements operations between Complex numbers, Complex Matrices and Complex Vectors such as addition, subtraction, multiplication, scalar product, etc.

Tensor product which is another, more important, method of combining vector spaces. In quantum systems tensor product the fundamental building operation. 

In this project we are assuming that every real number is a complex number which can be written with its value as a Real component and 0 as a Imaginary component. 

In addition, every vector is a matrix with just one column or row. 

## How to install:
First at all, check out java and maven are downloaded and installed in your PC.
Then clone this repository with the command ­

```git clone[repository's link]­``` 

![Clone](https://user-images.githubusercontent.com/53835467/64828229-23d86500-d58d-11e9-922e-99b81056ac75.PNG)

in the path that you want to save it.
Afterwards, compile and install it with the next commands

­```mvn package­```

![package](https://user-images.githubusercontent.com/53835467/64828256-35ba0800-d58d-11e9-85e8-60715780fb3a.PNG)

­```mvn install­```

![install](https://user-images.githubusercontent.com/53835467/64828268-3e124300-d58d-11e9-87be-a7dbeae3251a.PNG)

## Execute tests:
For executing testd follow the command

```mvn test```

![test](https://user-images.githubusercontent.com/53835467/64828285-5c783e80-d58d-11e9-8206-af0228580b81.PNG)

## Complex Numbers Functions:

1. PHASE: Calculate the phase of a complex number.
2. MODULUS: Calculate the modulus of a complex number.

   ``` Let c=1−i ```
   
   ``` |c|=|1−i|=+√((1^2) +((−1)^2)) =√2. ```
   
3. CONJUGATE: Calculate the conjugate of a complex number.

   ``` Let c=1−i ```
   
   ``` c=1+i ```
4. POLAR: Calculate the polar representation of a complex number.

    ``` Let c =1+i. ```
    
    ``` ρ =√((1^2)+(1^2)) =√2 ```
    
    ``` θ =tan−1 (1/1)= tan−1(1)= π/4 ```
    
5. ADDITION: Make addition of two complex numbers.

   ``` Let c1 =3−i and c2 =1+4i.  ```
   
   ``` We want to compute c1 + c2  ``` 
   
   ```c1 + c2 =3−i +1+4i =(3+1)+(−1+4)i =4+3i  ```
   
6. SUBTRACTION: Make subtraction of two complex numbers.

   ``` Let c1 =3−i and c2 =1+4i.  ```
  
   ``` We want to compute c1 - c2  ``` 
   
   ```c1 - c2 =3−i - (1+4i) =(3-1)+(−1-4)i =2-5i  ```
   
7. MULTIPLICATION: Make multiplication of two complex numbers.

   ``` Let c1 =3−i and c2 =1+4i.  ```
   
   ``` We want to compute c1 x c2  ``` 
   
   ```c1 x c2 = (3−i)×(1+4i)=(3×1)+(3×4i)+(−i ×1)+(−i ×4i) = (3+4)+(−1+12)i =7+11i.   ```
   
8. DIVISION: Make division of two complex numbers.

   ``` Let c1 =− 2+i and c2 =1+2i  ```
   
   ``` We want to compute c1 / c2  ``` 
   
   ``` In this case, a1 =− 2, b1 =1, a2 =1, and b2 =2. Therefore, a2^2 +b2^2 =5 ```
   
   ``` a1a2 +b1b2 =− 2×1+1×2=0, a2b1 −a1b2 = 1×1−(−2)×2=1+4=5. ```
   
   ``` c1/c2= i  ```

## Complex Matrix Functions:

1. TRANSPOSE: Make transpose of a matrix
2. CONJUGATE: Make conjugate of a matrix
3. ADJOINT: Make adjoint of a matrix
4. ADDITION: Make addition of two complex Matrices.

   ``` Let V =[2-2i, 2-2i, 2-2i, 2-2i] and W = [2-2i, 2-2i, 2-2i, 2-2i] ```
   
   ``` We want to compute V+W  ``` 
   
   ``` V + W= [4-4i, 4-4i, 4-4i, 4-4i] ```   

5. SUBTRACTION: Make subtraction of two complex Matrices.

   ``` Let V =[2-2i, 2-2i, 2-2i, 2-2i] and W = [2-2i, 2-2i, 2-2i, 2-2i] ```
   
   ``` We want to compute V+W  ``` 
   
   ``` V - W= [0, 0, 0, 0] ```  

6. SCALAR MULTIPLICATION: Make scalar multiplication between a complex and a matrix.

   ``` Let V =[6+3i, 0, 5+i, 4] and c = 3+2i ```
   
   ``` We want to compute V . c  ``` 
   
   ``` V . c = [12+21i, 0, 13-13, 12+8i] ```  

7. HERMITIAN: Answers if the matrix is an hermitian one.

   ``` Let V =[[5, 4+5i, 6-16i][4-5i,13,7][6+16i,7,-2.1]] ```

8. UNITARY: Returns if the matrix is unitary or not.

   ``` Let V =[[cos(θ), -sin(θ), 0][sin(θ),cos(θ),0][0,0,1]] ```

9. MULTIPLICATION: Make multiplication of two complex Matrices.
   ``` Let A =[[3+2i,0,5-6i][1,4+2i,i][4-i,0,4]] and B = [[5,2-i , 6-4i][0,4+5i,2][7-4i,2+7i,0]] ```
   
   ``` We want to compute A*B  ``` 
   
   ``` A*B= [[26-52i,60+24i, 26][9+7i,1+29i,14][48-21i,15+22i,20-22i]] ```  
10. INNERPRODUCT: Make inner product of two complex Matrices.

    ``` <[5,3,-7],[6,2,0]> = [5,3,-7]* [6,2,0]=(5x6) + (3x2) + (-7x0)= 36 ```

11. NORM: Gives the norm of the vector.

    ``` |[3,-6,2]|= √(<[3,-6,2],[3,-6,2]>)=√49=7 ```

12. DISTANCE: Gives the distance between two matrices.
13. TENSOR: Return the tensor product between two complex matrices.

## Some tests:

![adjoint](https://user-images.githubusercontent.com/53835467/64828512-68b0cb80-d58e-11e9-9901-fab596bc805c.PNG)

![innerProduct](https://user-images.githubusercontent.com/53835467/64828523-723a3380-d58e-11e9-9111-40c90817c72e.PNG)

## Executing tests - Results:

![testRun](https://user-images.githubusercontent.com/53835467/64828356-b5e06d80-d58d-11e9-8ffe-fadfe9ea742b.PNG)

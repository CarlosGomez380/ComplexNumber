# Libreria de numeros complejos 

This is a library introduces you into the Complex space.You can find out operations such as addition, subtraction, multiplication,etc. Between Complex numbers, Complex Matrices and Complex Vectors. 

This library includes tensor product which is another, more important, method of combining vector spaces. It is important due to it is the fundamental building operation of quantum systems. 

In this project we are assuming that every real number is a complex number which can be written with its value as a Real component and 0 as a Imaginary component. In addition, every vector is a matrix with just one column or row. 

## How to install:
First at all, check out java and maven are downloaded and installed in your PC.
Then clone this repository with the command ­

```git clone[repository's link]­``` 

in the path that you want to save it.
Afterwards, compile and install it with the next commands

­```mvn package­```

­```mvn install­```

## Execute tests:
For executing testd follow the command
```mvn test```

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

![addition1](https://user-images.githubusercontent.com/53835467/64621195-def4d880-d3aa-11e9-9a9b-683fc0c808a7.PNG)

![addition2](https://user-images.githubusercontent.com/53835467/64621004-845b7c80-d3aa-11e9-8330-5350f41d2d18.PNG)

5. SUBTRACTION: Make subtraction of two complex Matrices.

![inverse1](https://user-images.githubusercontent.com/53835467/64621244-f5029900-d3aa-11e9-869e-96ecb89b860a.PNG)

![inverse2](https://user-images.githubusercontent.com/53835467/64621263-fe8c0100-d3aa-11e9-97f0-03f929b4dbf6.PNG)

![subtraction](https://user-images.githubusercontent.com/53835467/64621294-0c418680-d3ab-11e9-918b-7737ffcbe245.PNG)

6. SCALAR MULTIPLICATION: Make scalar multiplication between a complex and a matrix.

![scalar1](https://user-images.githubusercontent.com/53835467/64621322-1b283900-d3ab-11e9-9db1-b54856e19f06.PNG)

![scalar2](https://user-images.githubusercontent.com/53835467/64621338-224f4700-d3ab-11e9-9ff1-ddb99779fb30.PNG)

7. HERMITIAN: Answers if the matrix is an hermitian one.

![hermitian](https://user-images.githubusercontent.com/53835467/64621366-2bd8af00-d3ab-11e9-949d-a840abd52949.PNG)

8. UNITARY: Returns if the matrix is unitary or not.

![unitary](https://user-images.githubusercontent.com/53835467/64621390-36934400-d3ab-11e9-9bc1-7ef574210200.PNG)

9. MULTIPLICATION: Make multiplication of two complex Matrices.

![multiplication1](https://user-images.githubusercontent.com/53835467/64621443-4b6fd780-d3ab-11e9-803c-60d228cb8f4e.PNG)

![multiplication2](https://user-images.githubusercontent.com/53835467/64621463-5296e580-d3ab-11e9-9a20-5e8991d47817.PNG)

10. INNERPRODUCT: Make inner product of two complex Matrices.

![inner](https://user-images.githubusercontent.com/53835467/64621421-4448c980-d3ab-11e9-86dd-b353e6a39a33.PNG)

11. NORM: Gives the norm of the vector.

![norm](https://user-images.githubusercontent.com/53835467/64621481-5c204d80-d3ab-11e9-9493-5b457ba3f144.PNG)

12. DISTANCE: Gives the distance between two matrices.
13. TENSOR: Return the tensor product between two complex matrices.

![tensor](https://user-images.githubusercontent.com/53835467/64621501-680c0f80-d3ab-11e9-8841-05476d72d452.PNG)

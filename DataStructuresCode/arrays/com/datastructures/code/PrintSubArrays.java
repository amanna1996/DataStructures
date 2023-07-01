package com.datastructures.code;

public class PrintSubArrays {

    public static void printSubArrays(int[] arrayOfNumbers){

        //Using three for loops we are printing the sub-arrays.
        for(int i=0;i<arrayOfNumbers.length;i++){
            for(int j=0;j<arrayOfNumbers.length;j++){
                for(int k = i; k<= j; k++){
                    System.out.print(arrayOfNumbers[k]+" ");
                }
                System.out.println();
            }

        }
    }


    public static void main(String[] args) {
       int[] arrayOfNumbers ={2,4,6,8,10};
       printSubArrays(arrayOfNumbers);
    }
}

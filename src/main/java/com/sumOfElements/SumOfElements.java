package com.sumOfElements;

public class SumOfElements {
    public static void main(String[] args) {
        int[] arr = {1, 14, 1, -10, 1, 18, 7, 8, 91, 1};
        int res = 0;

        for(int i =0; i < arr.length; i++ ){
            if (i != 0 && i!= arr.length-1) {
                res += arr[i];
            }
        }
        System.out.println("The sum of array elements (exclude first and last) is: " + res);
    }
}

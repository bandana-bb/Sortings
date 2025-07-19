package dev.bandana;

import java.util.Arrays;

/*
Given an integer array A of size N. Return 1 if the array can be arranged to form an arithmetic progression, otherwise return 0.

A sequence of numbers is called an arithmetic progression if the difference between any two consecutive elements is the same.
 */
public class ArithmeticPro {
    public static void main(String[] args) {

        int [] A = {3,5,1};

        int ans = createAp(A);
        System.out.println(ans);

    }
    public static int createAp(int[] A) {
        int n = A.length;
        int diff = 0;
        Arrays.sort(A);
        diff = A[1]- A[0];
        for(int i = 1; i < n-1; i++) {
            if((A[i+1]-A[i])!=diff){
                return 0;
            }
        }
        return 1;
    }
}

package dev.bandana;

import java.util.Arrays;

/*
Given an array of n integers, minimize the cost to empty given array where cost of removing an element is equal to sum of all elements left in an array.

Example :

A[ ] = { 2, 1, 4 }
Ans = 11

 */

public class MinEmptyCostArr {
    public static void main(String[] args) {
        int [] arr = {2, 1, 4};

        emptySrrMinCost(arr);

        reversrArr(arr);


    }

    public static int[] reversrArr(int [] arr){
        int index =0;

        int [] b = new int[arr.length];

        for(int i =arr.length-1;i>=0;i--){
            b[index]=arr[i];
            index++;
        }
        return  b;
    }

    public static void emptySrrMinCost(int [] arr){

        int n = arr.length;
        Arrays.sort(arr); //sort the array in asc order O(nlogn)
        // minimize cost by counting the largest no in min times
        int [] reverser= reversrArr(arr);  // --O(n)
        int minCost = 0;
        for(int i =0;i<reverser.length;i++){  // O(n)
            minCost = minCost + reverser[i]*(i+1);
        }
        System.out.println("Cost of removing all elements: " + minCost);

    }
}

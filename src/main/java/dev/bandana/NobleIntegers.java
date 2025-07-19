package dev.bandana;


import java.util.Arrays;

/*
Given an integer array A of size N. You can remove any element from the array in one operation.
The cost of this operation is the sum of all elements in the array present before this operation.

Find the minimum cost to remove all elements from the array.
 */

public class NobleIntegers {
    public static void main(String[] args) {

        int [] a = {-3, 0, 2, 5};

        int []b ={-10, 1, 1, 3, 100 };

        countNobleInt(a);
        findCountNobleInt(a);
        findCountNobleIntDist(b);

    }

    //BruteForce approach
    public static void countNobleInt(int[] a) {
        int n = a.length;
        int ans = 0;
        for(int i = 0; i < n; i++) {
            int count = 0;
            for(int j = 0; j < n; j++) {
                if(a[j]<a[i]){
                    count++;
                }
            }

            if(count ==a[i]){
                ans++;
            }
        }
        System.out.println("Total Noble Integers are: " + ans);

    }

    //Optimised Approach
    public static void findCountNobleInt(int[] a) {
        int n = a.length;
        Arrays.sort(a); //sort in asc
        int count = 0;
        for(int i = 0; i < n; i++) {
            if(a[i]==i){
                count++;
            }
        }

        System.out.println("Total No.of Noble Integers are: " + count);
    }

    public static void findCountNobleIntDist(int[] a) {
        int n = a.length;
        Arrays.sort(a);
        int count = 0;
        int ans = 0;

        if(a[0] == 0)
            ans++;

        for(int i = 1; i < n; i++) {
           if(a[i]!=a[i-1]){
               count = i ;
           }
           if(count == a[i]){
               ans++;
           }
        }
        System.out.println("Total Noble Integers are: " + ans);

    }


}

package dev.bandana;

public class BubbleSort {
    public static void main(String[] args) {
        int [] A = { 3, 5,1,7, 9};

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A.length-1; j++) {
                if (A[j] > A[j+1]) {
                    int temp = A[j];
                    A[j] = A[j+1];
                    A[j+1] = temp;
                }
            }
        }

        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + ", ");
        }

    }
}

package dev.bandana;

public class InsertionSort {
    public static void main(String[] args) {
        int [] A = {5,6,2,7,1,9};
        int n = A.length;
        for (int i = 1; i < n; i++) {
            for(int j = i-1; j>=0; j--){
                if(A[j]>A[j+1]){
                    int temp = A[j];
                    A[j] = A[j+1];
                    A[j+1] = temp;
                }
                else {
                    break;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(A[i] + " ");
        }
    }
}

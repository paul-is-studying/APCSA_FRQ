package spr_b1;

import java.util.Arrays;

public class _05_MergeSort {

    static boolean verbose = true;

    public static void main(String[] args) {

        // create an array of 10 integers in range[1,99]
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 99 + 1);
        }
        System.out.println("Unsorted(ascending): \t" + Arrays.toString(arr));

        // write and use insertionSort() to sort arr
        mergeSort(arr);
        System.out.println("Sorted(ascending): \t" + Arrays.toString(arr));

    }

    public static void mergeSort(int[] arr) {

    }

    public static void mergeSort(int[] arr, int low, int high) {

    }

    public static void merge(int[] arr, int low, int high) {

    }

}








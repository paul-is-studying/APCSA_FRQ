package spr_b1;

import java.util.Arrays;

public class _03_RInsertionSort {

    public static void main(String[] args) {

        // create an array of 10 integers in range[1,99]
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 99 + 1);
        }
        System.out.println("Unsorted: \t\t" + Arrays.toString(arr));

        // write and use insertionSort() to sort arr
        insertionSort(arr);
        System.out.println("Sorted(ascending): \t" + Arrays.toString(arr));

    }

    // implement insertion sort recursively
    public static void insertionSort(int[] arr) {

    }


}

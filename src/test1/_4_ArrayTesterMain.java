package test1;

import java.util.Arrays;

// Requires: ArrayTester.java
public class _4_ArrayTesterMain {

	public static void main(String[] args) {
		
		// (a)
		int[][] arr2D = {
				{0, 1, 2},
				{3, 4, 5},
				{6, 7, 8},
				{9, 5, 3},
		};
		int[] result = ArrayTester.getColumn(arr2D, 1);
		System.out.println( Arrays.toString(result) );
		
		// testing hasAllValues()
		int[] a1 = {1, 2, 3};
		int[] a2 = {3, 2, 1};
		int[] a3 = {1, 2, 4};
		// should be TTF
		System.out.println("should return TTF");
		System.out.println(ArrayTester.hasAllValues(a1, a1));
		System.out.println(ArrayTester.hasAllValues(a1, a2));
		System.out.println(ArrayTester.hasAllValues(a1, a3));
		
		// testing containsDuplicates()
		int[] b1 = {1, 2, 3, 4, 5};
		int[] b2 = {1, 2, 3, 1, 5};
		// should be FT
		System.out.println("should return FT");
		System.out.println(ArrayTester.containsDuplicates(b1));
		System.out.println(ArrayTester.containsDuplicates(b2));
		
		// (b)
		int[][] ls1 = {
				{1, 2, 3},
				{2, 3, 1},
				{3, 1, 2},
		};
		int[][] ls2 = {
				{10, 30, 20, 0},
				{0, 20, 30, 10},
				{30, 0, 10, 20},
				{20, 10, 0, 30},
		};
		int[][] nls1 = {
				{1, 2, 1},
				{2, 1, 1},
				{1, 1, 2},
		};
		int[][] nls2 = {
				{1, 2, 3},
				{3, 1, 2},
				{7, 8, 9},
		};
		int[][] nls3 = {
				{1, 2},
				{1, 2},
		};
		// should be TTFFF
		System.out.println("should return TTFFF");
		System.out.println(ArrayTester.isLatin(ls1));
		System.out.println(ArrayTester.isLatin(ls2));
		System.out.println(ArrayTester.isLatin(nls1));
		System.out.println(ArrayTester.isLatin(nls2));
		System.out.println(ArrayTester.isLatin(nls3));
	}

}

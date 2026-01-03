package com.demo.sort_test;

import java.util.Arrays;

import com.demo.sorting.MergeSorting;

public class MergerSortingTest {

	public static void main(String[] args) {
		int arr[] = {3,5,7,10,10,10,11,12,13,17,20,22,25,27,30};
		MergeSorting.mergeSortingAscending(arr,0,arr.length-1);
		System.out.println(Arrays.toString(arr));

	}

}

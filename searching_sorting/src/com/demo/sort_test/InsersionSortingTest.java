package com.demo.sort_test;

import java.util.Arrays;

import com.demo.sorting.InsertionSorting;

public class InsersionSortingTest {

	public static void main(String[] args) {
		int arr[] = {5,3,8,1,4,6,2,7};
		System.out.println("Insertion sort by ascending order");
		InsertionSorting.sortingsortinginsersionSortAsce(arr);
		System.out.println(Arrays.toString(arr));
		
		System.out.println("Insertion sort by Descending order");
		InsertionSorting.sortingsortinginsersionSortDesc(arr);
		System.out.println(Arrays.toString(arr));

	}

}

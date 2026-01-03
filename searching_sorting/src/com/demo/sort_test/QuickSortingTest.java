package com.demo.sort_test;

import java.util.Arrays;

import com.demo.sorting.QuickSorting;

public class QuickSortingTest {

	public static void main(String[] args) {
		int arr[] = {11,23,22,5,1,7,8,10,3,17};
		System.out.println("sort by ascending order");
		QuickSorting.quickSortingAsce(arr,0,arr.length-1);
		System.out.println(Arrays.toString(arr));
		
		System.out.println("sorted by Descending order");
//		QuickSorting.quickSortingDesc(arr,0,arr.length-1);
//		System.out.println(Arrays.toString(arr));
		

	}

}

package com.demo.sorting;

import java.util.Arrays;

public class InsertionSorting {

	public static void sortingsortinginsersionSortAsce(int[] arr) {
		for(int i=1;i<arr.length;i++)
		{
			int j=i-1;
			int key = arr[i];
//			int j;
//			for(j=i-1;j>=0;j--)
//			{
//			 if(arr[j]>key)
//			 {
//				 arr[j+1] = arr[j];
//			 }
//			}
//			arr[j+1] = key;
			while(j>=0 && arr[j]>key)
			{
				 arr[j+1] = arr[j];
				 j--;
			}
			arr[j+1] = key;
			System.out.println(Arrays.toString(arr));
		}
	 }

	public static void sortingsortinginsersionSortDesc(int[] arr) {
		for(int i=1;i<arr.length;i++)
		{
			int key = arr[i];
			int j=i-1;
			while(j>=0 && arr[j]<key)
			{
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = key;
			System.out.println(Arrays.toString(arr));
		}
		
	}
}



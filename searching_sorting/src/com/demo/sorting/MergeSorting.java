package com.demo.sorting;

public class MergeSorting {

	public static void mergeSortingAscending(int[] arr, int start, int end) {
		if(start<end)
		{
		  int mid = (start+end)/2;
		  mergeSortingAscending(arr, start, mid);
		  mergeSortingAscending(arr, mid+1, end);
		  mergeArrays(arr,start,mid,end);
		}
	}

	public static void mergeArrays(int[] arr, int start, int mid, int end) {
		int n1 = mid-start+1;
		int n2 = end-mid;
		int arr1 [] = new int[n1];
		int arr2 [] = new int[n2];
		
		for(int i=0;i<n1;i++)
		{
			arr1[i] = arr[start+i];
		}
		
		for(int i=0;i<n2;i++)
		{
			arr2[i] = arr[mid+1+i];
		}
		int i=0;
		int j=0;
		int k =start;
		while(i<n1 && j<n2)
		{
		if(arr1[i]<arr2[j])
		{
			arr[k++] = arr1[i++];
		}
		else
		{
			arr[k++] = arr2[j++];
		}
		}
		if(i<n1)
		{
			arr[k++] = arr1[i++];
		}
		else
		{
			arr[k++] = arr2[j++];
		}
	}
}


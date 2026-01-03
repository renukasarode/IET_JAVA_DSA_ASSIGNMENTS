package com.demo.sorting;

import java.util.Arrays;

public class QuickSorting {

	public static void quickSortingAsce(int[] arr, int start, int end) {
		if(start<end)
		{
			int p = getPartition(arr,start,end);
			quickSortingAsce(arr, start, p-1);
			quickSortingAsce(arr, p+1, end);
		}
      		
	}

	public static int getPartition(int[] arr, int start, int end) {
		
			int i=start;
			int j=end;
			int pivot =start;
			while(i<j)
			{
			  while(i<end && arr[i]<=arr[pivot])
			  {
				  i++;
			  }
			  while(j>start && arr[j]>arr[pivot])
			  {
				  j--;
			  }
			  
			  if(i<j)
			  {
				  int temp = arr[i];
				 arr[i] = arr[j];
				 arr[j] = temp;
			  }
			}
			if(j!=pivot)
			{
				int temp = arr[pivot];
				arr[pivot] = arr[j];
				arr[j] = temp;
			}
			System.out.println(Arrays.toString(arr));
			System.out.println("j s position "+j+" j element----"+arr[j]);
			System.out.println("swapped with "+arr[j]+" pivot is "+arr[pivot]);
		return j;
	}

	public static void quickSortingDesc(int[] arr, int start, int end) {
		while(start<end)
		{
			int p = partitionDesc(arr,start,end);
			quickSortingDesc(arr, start, p-1);
			quickSortingDesc(arr, p+1,end);
		}
	}

	public static int partitionDesc(int[] arr, int start, int end) {
		int i=start;
		int j=end;
		int pivot =start;
		while(i<j)
		{
		  while(i<end && arr[i]>=arr[pivot])
		  {
			  i++;
		  }
		  while(j>start && arr[j]<arr[pivot])
		  {
			  j--;
		  }
		  
		  if(i<j)
		  {
			  int temp = arr[i];
			 arr[i] = arr[j];
			 arr[j] = temp;
		  }
		}
		if(j!=pivot)
		{
			int temp = arr[pivot];
			arr[pivot] = arr[j];
			arr[j] = temp;
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("j s position "+j+" j element----"+arr[j]);
		System.out.println("swapped with "+arr[j]+" pivot is "+arr[pivot]);
	return j;

}
}

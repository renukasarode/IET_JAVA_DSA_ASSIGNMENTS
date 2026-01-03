package com.demo.sort_test;

import java.util.Arrays;

import com.demo.sorting.Sorting;

public class SortingTest {

	public static void main(String[] args) {
		
      int arr[] = {2,8,1,2,7,9,6,4};
      
      
      Sorting.bubbleSort(arr);
      System.out.println("Asceding order sorting using bubble Sort----->");
      System.out.println(Arrays.toString(arr));
      
      Sorting.bubbleSortDesc(arr);
      System.out.println("Descending order sorting using bubble Sort----->");
      System.out.println(Arrays.toString(arr));
      
      Sorting.bubbleSortAdvance(arr);
      System.out.println("Asceding order sorting using bubble Sort Advanced----->");
      System.out.println(Arrays.toString(arr));
      
      Sorting.bubbleSortAdvanceDesc(arr);
      System.out.println("Descending order sorting using bubble Sort Advanced----->");
      System.out.println(Arrays.toString(arr));
      
      
      
        
	}

}

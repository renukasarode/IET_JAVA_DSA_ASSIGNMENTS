package com.demo.search_test;

import com.demo.searching.Searching;

public class SearchingTest {

	public static void main(String[] args) {
       int arr1[] = {2,3,4,1,3,56,75,56};
//       int value = 4;
//       int value = 100;
       int value = -1;
       System.out.println("Sequential Searching--------->");
       int pos = Searching.seqentialSearch(arr1,value);
       if(pos!=-1)
       {
    	   System.out.println("Element is found at position "+pos);
       }
       else
       {
    	   System.out.println("The given Element is not found");
       }
       int arr2[] = {1,2,3,4,5};
       int ele = 5;
       System.out.println("Binary Searching without Recursion---------->");
       int index = Searching.binarySearchWithoutRecursion(arr2,ele);
       if(index!=-1)
       {
    	   System.out.println("Element is found at position "+ index);
       }
       else
       {
    	   System.out.println("The given Element is not found");
       }
       
       System.out.println("Binary Searching With Recursion---------->");
       
       int low =0;
       int high =arr2.length-1;
       int index1 = Searching.binarySearchRecursion(arr2,ele,low,high);
       if(index1!=-1)
       {
    	   System.out.println("Element is found at position "+ index1);
       }
       else
       {
    	   System.out.println("The given Element is not found");
       }
}
}

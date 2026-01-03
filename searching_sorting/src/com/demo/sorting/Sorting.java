package com.demo.sorting;

import java.util.Arrays;

public class Sorting {

	public static void bubbleSort(int[] arr) {
      for(int i=0;i<arr.length;i++)
      {
    	  for(int j=0;j<arr.length-1-i;j++)
    	  {
    		  if(arr[j]>arr[j+1])
    		  {
    			  int temp = arr[j];
    			  arr[j] = arr[j+1];
    			  arr[j+1] = temp;
    		  }
    	  }
    	  System.out.println("Iteration----"+i);
		  System.out.println(Arrays.toString(arr));
      }
	}

	public static void bubbleSortDesc(int[] arr) {
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length-1-i;j++)
			{
				if(arr[j]<arr[j+1])
				{
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
			 System.out.println("Iteration----"+i);
   		     System.out.println(Arrays.toString(arr));
		}
	}

	public static void bubbleSortAdvance(int[] arr) {
		boolean flag=false;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length-1-i;j++)
			{
				if(arr[j]>arr[j+1])
	    		  {
	    			  int temp = arr[j];
	    			  arr[j] = arr[j+1];
	    			  arr[j+1] = temp;
	    			  flag =true;
	    		  }
			}
			System.out.println("Iteration----"+i);
  		    System.out.println(Arrays.toString(arr));
			if(!flag)
				break;
		}
	}

	public static void bubbleSortAdvanceDesc(int[] arr) {
	  boolean flag =false;
	  for(int i=0;i<arr.length;i++)
	  {
		  for(int j=0;j<arr.length-1-i;j++)
		  {
			  if(arr[j]<arr[j+1])
    		  {
    			  int temp = arr[j];
    			  arr[j] = arr[j+1];
    			  arr[j+1] = temp;
    			  flag =true;
    		  }
			  System.out.println("Iteration----"+i);
	   		  System.out.println(Arrays.toString(arr));
			  if(!flag)
				  break;
		  }
	  }
		
	}

}

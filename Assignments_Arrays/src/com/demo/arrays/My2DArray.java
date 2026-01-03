package com.demo.arrays;

import java.util.Scanner;

public class My2DArray {

	Scanner sc = new Scanner(System.in);
	public static int[][] reverseArray(int arr[][]) {
		int newReverse [][] = new int[arr.length][arr[0].length];
		
		for(int i=0;i<arr.length;i++)
		{
			for(int k=0,j=arr[0].length-1;j>=0;j--)
			{
			  newReverse[i][k++] = arr[i][j];
			}
		}
		return newReverse;
	}

	public static void accpet2DArray(int arr[][]) {
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[0].length;j++)
			 {
				System.out.println("enter the value of the element "+i+" and "+j);
				arr[i][j] = sc.nextInt();
       		}
		}
	}

	public static void displayArray(int[][] arr) {
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[0].length;j++)
			 {
				System.out.print(arr[i][j]+"\t");
         	 }
			System.out.println();
		}
	}

	public static int[] findMaxElement(int[][] arr) {
		int maxArr[] = new int[arr.length];
		for(int i=0;i<arr.length;i++)
		{
			int max = arr[i][0];
		  for(int j=0;j<arr[0].length;j++)
		  {
			 if(arr[i][j]>max)
			 {
				 max=arr[i][j];
			 }
		  }
		    maxArr[i] = max;
		}
		return maxArr;
	}

	public static int[] findRowAverage(int[][] arr) {
		int arrAvg[] = new int[arr.length];
		for(int i=0;i<arr.length;i++)
		{
			int sum =0;
			for(int j=0;j<arr[i].length;j++)
			{
			  sum=sum+arr[i][j];
			}
			arrAvg[i] = sum/arr.length;
		}
		return arrAvg;
	}
	
	public static int[] findColumnAverage(int[][] arr) {
		int arrAvg[] = new int[arr.length];
		for(int i=0;i<arr.length;i++)
		{
			int sum =0;
			for(int j=0;j<arr[i].length;j++)
			{
			  sum=sum+arr[j][i];
			}
			arrAvg[i] = sum/arr.length;
		}
		return arrAvg;
	}

	public static int[] additionRowsColumnsAvg(int[][] arr) {
		int sumAvgColRow[] = new int[arr.length];
		int [] rowAvg =findRowAverage(arr);
		int [] columnAvg = findColumnAverage(arr);
		for(int i=0;i<arr.length;i++)
		{
			sumAvgColRow[i] = rowAvg[i]+columnAvg[i];
		}
		return sumAvgColRow;
	}
}

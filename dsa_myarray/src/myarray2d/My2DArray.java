package myarray2d;

import java.util.Arrays;
import java.util.Scanner;

public class My2DArray {
private int [][] arr;


public My2DArray() {
	arr = new int[3][3];
}

public My2DArray(int [][] arr) {
	super();
	this.arr = arr;
}

public My2DArray(int rows, int cols) {
	arr =new int[rows][cols] ;
}

public void acceptArray()
{
	Scanner sc = new Scanner(System.in);
	for(int i=0;i<arr.length;i++)
	{
		for(int j=0;j<arr[i].length;j++)
		{
			System.out.println("Enter the value of ele--->"+"("+i+","+j+")");
			arr[i][j] = sc.nextInt();
		}
	}
}

public void displayData()
{
	for(int i=0;i<arr.length;i++)
	{
		for(int j=0;j<arr[i].length;j++)
		{
			System.out.print(arr[i][j]+"\t");
		}
		System.out.println();
	}
}

public int[] findRowSum()
{
	int sum[] = new int[arr.length];
	for(int i=0;i<arr.length;i++)
	{
		for(int j=0;j<arr[i].length;j++)
		{
			sum[i] += arr[i][j];
		}
	}
	return sum;
}

public int[] findSumColumn()
{
	int sum[] = new int[arr[0].length];
	for(int i=0;i<arr[0].length;i++)
	{
		for(int j=0;j<arr.length;j++)
		{
			sum[i] += arr[j][i];
		}
	}
	return sum;
}

public int[][] addTwoArrays(int [][] arr1, int [][] arr2)
{
    for(int i=0;i<arr.length;i++)
    {
    	for(int j=0;j<arr[i].length;j++)
    	{
    		arr1[i][j] = arr1[i][j] + arr2[i][j];
    	}
    	
    }
    return arr1;
}

public void addTwoArrays(My2DArray obj)
{
//	int nArr[][] = new int[this.arr.length][obj.arr.length];
	if(arr.length==obj.arr.length && arr[0].length==obj.arr[0].length)
	{
    for(int i=0;i<this.arr.length;i++)
    {
    	for(int j=0;j<this.arr[i].length;j++)
    	{
    		this.arr[i][j] +=obj.arr[i][j];
    	}
    }
	}
}

public void subtractTwoArrays(My2DArray obj)
{
//	int nArr[][] = new int[this.arr.length][obj.arr.length];
	if(arr.length==obj.arr.length && arr[0].length==obj.arr[0].length)
	{
    for(int i=0;i<this.arr.length;i++)
    {
    	for(int j=0;j<this.arr[i].length;j++)
    	{
    		this.arr[i][j] -=obj.arr[i][j];
    	}
    }
	}
}

public void rowRotation(boolean flag,int num)
{
	//if true--> up
		//else ----> down
	if(flag)
	{
		for(int k =0;k<num;k++) 
		{
			int[] row1 = arr[0];
		  for(int i=0;i<arr.length-1;i++)
		  {
			  arr[i] = arr[i+1];
		  }
		  arr[arr.length-1] = row1;
		}
	}
	else
	{
		for(int k =0;k<num;k++) 
		{
			int[] rowL = arr[arr.length-1];
		  for(int i=arr.length-1;i>0;i--)
		  {
			  arr[i] = arr[i-1];
		  }
		  arr[0] = rowL;
		}
		
}
}

public void rotateColumn(boolean flag, int num)
{
	//if true--> left
	//else ----> right
	if(flag)
	{
		for(int k=0;k<num;k++)
		{
			for(int i=0;i<arr.length;i++)
			{
				int value = arr[i][0];
				for(int j=0;j<arr[i].length-1;j++)
				{
					arr[i][j] = arr[i][j+1];
				}
				arr[i][arr[i].length-1] = value;
			}
		}
	}
	else
	{
		for(int k=0;k<num;k++)
		{
			for(int i=0;i<arr.length;i++)
			{
				int value = arr[i][arr[i].length-1];
				for(int j=arr[i].length-1;j>0;j--)
				{
				  arr[i][j] = arr[i][j-1];
				}
				arr[i][0] = value;
			}
		}
	}
}

public int[][] transpose()
{
	int tranArr[][] = new int[arr[0].length][arr.length];
	for(int i=0;i<tranArr.length;i++)
	{
		for(int j=0;j<tranArr[i].length;j++)
		{
			tranArr[i][j] = arr[j][i];
		}
	}
	return tranArr;
}

public boolean isSymetric()
{
	if(arr.length==arr[0].length)
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				if(arr[i][j]!=arr[j][i])
				{
					return false;
				}
			}
		}
		return true;
	}
	return false;
}

public boolean isIdentity()
{
	if(arr.length==arr[0].length)
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
			  if((i==j  && (arr[i][j]!=1)) || (i!=j  && arr[i][j]!=0 ))
               {
            	   return false;
               }
			}
		}
		return true;
	}
	return false;
}

//@Override
//public String toString() {
//	return "My2DArray [arr=" + Arrays.toString(arr) + "]";
//}


}

package myarray;
import java.util.Arrays;

public class MyArray {
	private int [] arr;
	static int count=0;
   
    
	public MyArray() {
		super();
		 this.arr = new int[10];
	}
	
	public MyArray(int size) {
		super();
		 this.arr = new int[size];
	}
	
	public MyArray(int []copy) {
		super();
		 this.arr = copy;
	}
	public int getCapacity()
	{
		return arr.length;
	}
	
	public int getSize()
	{
		return count;
	}
	 
	public boolean addData(int value)
	{
		if(count<arr.length)
		{
		arr[count] = value;
		count++;
		return true;
		}
	    
		return false;
	}
	
	public boolean addGivenPosition(int pos,int value)
	{
		if(pos<count && count<arr.length)
		{
		  for(int i=pos;i<count;i++)
		  {
			  arr[i+1] = arr[i];
		  }
		  arr[pos] = value;
		  count++;
			return true;
		}
		return false;
	}
	
	
	public int searchByValue(int value)
	{
		if( count<arr.length)
		{
			for(int i=0;i<count;i++)
			{
				if(arr[i]==value)
				{
					return i;
				}
			}
		}
		return -1;
	}
	
	public boolean deleteByPosition(int pos)
	{
		if(pos<count && count<arr.length)
		{
			for(int i=pos;i<count;i++)
			{
				arr[i] = arr[i+1];
			}
			count--;
			return true;
		}
		return false;
	}
	
	public boolean deleteByValue(int value)
	{
		int index = searchByValue(value);
		if(index!=-1)
		return deleteByPosition(index);
		return false;
	}
	
	public void rotateArray(boolean flag, int n)
	{
		
			if(flag)
			{
				for(int i=0;i<n;i++)
				{
				int last = arr[count-1];
				for(int j=count-1;j>0;j--)
				{
				 arr[j] = arr[j-1];
				}
				arr[0] = last;
				}
			}
			else
			{
				for(int i=0;i<n;i++)
				{
				int first = arr[0];
				for(int j=0;j<count;j++)
				{
				 arr[j] = arr[j+1];
				}
				arr[count-1] = first;
				}
			}
	}
	
//	public void rotateArray(boolean flag, int n)
//	{
//		for(int i=0;i<n;i++)
//		{
//		
//			if(flag)
//			{
//				
//				int last = arr[count-1];
//				for(int j=count-1;j>0;j--)
//				{
//				 arr[j] = arr[j-1];
//				}
//				arr[0] = last;
//				
//			}
//			else
//			{
//				
//				int first = arr[0];
//				for(int j=0;j<count;j++)
//				{
//				 arr[j] = arr[j+1];
//				}
//				arr[count-1] = first;
//				}
//		}
//	}
	
	public int[] reverseArray(boolean flag)
	{
		if(flag)
		{
		  for(int i=0;i<count/2;i++)
		  {
			  int temp = arr[i];
			  arr[i] = arr[count-1-i];
			  arr[count-1-i] = temp;
		  }
		  return arr;
		}
		else
		{
			int copy[] = new int[count];
			int k=0;
			for(int i=count-1;i>=0;i--)
			{
			  	copy[k++] = arr[i];
			}
			return copy;
		}
	}
	
	public int[] exchangeIndexValue()
	{
		int max = findMax();
		int copy[] = new int[max+1];
		for(int i=0;i<copy.length;i++)
		{
		  copy[i] = -1;
		}
		for(int i=0;i<count;i++)
		{
			copy[arr[i]] = i;
		}
		return copy;
	}
	

	public int findMax() {
		int max = arr[0];
		for(int i=0;i<count;i++)
		{
			if(arr[i]>max)
			{
				max = arr[i];
			}
		}
		return max;
	}
	
	public int findSum()
	{
		int sum =0;
		for(int i=0;i<count;i++)
		{
			sum+=arr[i];
		}
		return sum;
	}
	public String toString()
	{
		return "MyArray [arr="+Arrays.toString(arr)+"]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}

package myarray;

import java.util.Arrays;

public class MyArrayTest {

	public static void main(String[] args) {
		MyArray obj = new MyArray();
		System.out.println(obj);
		obj.addData(0);
		obj.addData(1);
		obj.addData(2);
		System.out.println(obj);
		boolean flag = obj.addGivenPosition(2, 101);
		if(flag)
		System.out.println(obj);
		else
			System.out.println("not added");
		
		if(obj.searchByValue(101) !=-1)

		{
			System.out.println(obj.searchByValue(101));
		}
		else
		{
			System.out.println("not found");
		}
		
		obj.deleteByPosition(3);
		System.out.println(obj);
		
		obj.deleteByValue(101);
		System.out.println(obj);
		
		obj.addData(2);
		obj.addData(4);
		obj.addData(8);
		obj.addData(6);
		System.out.println(obj);
		obj.rotateArray(true, 3);
		System.out.println(obj);
		obj.rotateArray(false, 1);
		System.out.println(obj);
		int arr[] = obj.reverseArray(true);
		System.out.println(Arrays.toString(arr));
		int arr1[] = obj.reverseArray(false);
		System.out.println(Arrays.toString(arr1));
		
		System.out.println(Arrays.toString(obj.exchangeIndexValue()));
		
		System.out.println(obj.findSum());
		
		

	}

}

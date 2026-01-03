package com.demo.stack_test;

import com.demo.stack.MyCircularQueue;

public class MyCircularQueueTest {

	public static void main(String[] args) {
		 MyCircularQueue obj = new  MyCircularQueue();
		 obj.enqueue(2);
		 //obj.diplay();
		 obj.enqueue(3);
		 obj.enqueue(2);
		 obj.enqueue(2);
		int val= obj.dequeue();
		 if(val!=-1)
		 {
			 System.out.println("deleted successfully");
		 }
		 else
		 {
			 System.out.println("not deleted");
		 }
		 
		 obj.dequeue();
		 obj.dequeue();
		 obj.dequeue();
		 
		 
		 
	}

}

package com.demo.Test;

import com.demo.linkedList.DoublyLinkedList;

public class DoublyLinkedListTest {

	public static void main(String[] args) {
		DoublyLinkedList obj1=new DoublyLinkedList();
		obj1.addNode(12);
		obj1.addNode(23);
		obj1.addNode(22);
		obj1.addNode(24);
		obj1.displayDlist();
		//obj1.addByValue(11, 15);
		//obj1.addByPosition(20, 2);
		//obj1.deleteByValue(24);
		obj1.deleteByPosition(4);
		
	   obj1.displayDlist();
		
		
	}

}

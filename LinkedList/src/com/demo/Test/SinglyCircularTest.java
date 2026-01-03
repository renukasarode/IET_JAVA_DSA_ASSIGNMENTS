package com.demo.Test;

import com.demo.linkedList.SinglyCircularLinkedList;

public class SinglyCircularTest {

	public static void main(String[] args) {
		SinglyCircularLinkedList obj1 = new SinglyCircularLinkedList();
		obj1.addNode(11);
		obj1.addNode(22);
		obj1.addNode(42);
		obj1.addNode(51);
		obj1.displaySinCir();
		//obj1.addByValue(13,31);
		obj1.addByPosition(10, 6);
		//obj1.deleteByValue(23);
		//obj1.deleteByPosition(1);
		
     	obj1.displaySinCir();
		
		
		
	}

}

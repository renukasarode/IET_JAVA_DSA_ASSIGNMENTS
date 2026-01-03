package com.demo.Test;

import java.util.LinkedList;

import com.demo.linkedList.SinglyLinkedList;

public class SinglyLinkedListTest {

	public static void main(String[] args) {
      SinglyLinkedList obj1 = new SinglyLinkedList();
     obj1.addNode(23);
     obj1.addNode(113);
     obj1.addNode(17);
     obj1.addNode(25);
     obj1.displayLinkedList();
     System.out.println();
      
       obj1.addByPosition(3, 12);
 //      obj1.displayLinkedList();
//       obj1.deleteByValue(17);
//       obj1.deleteByPosition(1);
    obj1.displayLinkedList();
       
       
       
	}

}

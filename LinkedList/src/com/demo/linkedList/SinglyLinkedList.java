package com.demo.linkedList;

public class SinglyLinkedList {
	Node head;
	class Node{
		int data;
		Node next=null;
		
		public Node(int value)
		{                      
		 this.data = value;
		 this.next=null;
		}
		
	}
	
	public void addNode(int value)
	{
		Node newNode = new Node(value);
		if(head==null)
		{
		  head = newNode;
		}
		
		else
		{
			Node temp = head;
			while(temp.next!=null)
			{
				temp = temp.next;
			}
			  temp.next=newNode;
		}
	}
	
	public void addByPosition(int pos, int val)
	{
		Node newNode = new Node(val);
		if(pos==1) 
		{
		  newNode.next=head;
		  newNode = null;
		}
		else
		{
			Node temp = head;
			int i=1;
			while(i<=pos-2)
			{
			 temp = temp.next;
			 i++;
		    }
			if(temp!=null)
			{
			newNode.next = temp.next;
			temp.next=newNode;
			}
	  }
	}
	
	public void deleteByValue(int value)
	{
		Node temp  = head;
	  if(temp.data==value)
	  {
		  head = temp.next;
		  temp.next=null;
	  }
	  else {
			Node prev=null;
			while(temp!=null && temp.data!=value) {
				prev=temp;
				temp=temp.next;
			}
			//value found
			if(temp!=null) {
				prev.next=temp.next;
				temp.next=null;
			}else {
				System.out.println(value + " not found");
			}
		}
	}
	
	public void deleteByPosition(int pos)
	{
		Node temp=head;
		//delete from the head
		if(pos==1) {
			head=temp.next;
			temp.next=null;
		}else {
			Node prev=null;
			for(int i=0;temp!=null && i<pos-1;i++) {
				prev=temp;
				temp=temp.next;
			}
			if(temp!=null) {
				prev.next=temp.next;
				temp.next=null;
			}else {
				System.out.println(pos+ " is beyond the limit");
			}
		}
	}
	
	public void displayLinkedList()
	{
		Node temp = head;
		if(head==null)
		{
			System.out.println("List is empty");
		}
		while(temp!=null)
		{
			System.out.print("["+temp.data+"-------->"+"]");
			temp = temp.next;
		}
	}
}

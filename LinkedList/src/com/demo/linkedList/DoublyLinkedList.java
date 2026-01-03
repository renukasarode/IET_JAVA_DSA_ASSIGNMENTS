package com.demo.linkedList;

public class DoublyLinkedList {
	Node head ;
	class Node{
		int data;
		Node prev,next;
		public Node(int data) {
			super();
			this.data = data;
			prev = null;
			next = null;
		}
	}
	public DoublyLinkedList() {
		super();
		head = null;
	}
	
	public void addNode(int val)
	{
		Node newNode = new Node(val);
		if(head ==null)
		{
			head = newNode;
		}
		else {
			Node temp=head;
			while(temp.next!=null)
			{
				temp = temp.next;
				
			}
			temp.next = newNode;
			newNode.prev = temp;
			
		}
	}

	public void displayDlist() {
		Node temp=head;
		while(temp!=null)
		{
			System.out.print(temp.data +"-->");
			
			temp = temp.next;
		}
		System.out.println();
	}
	
	public void addByValue(int val,int data)
	{
		if(head==null)
		{
			System.out.println("empty list");
		}
		else
		{
			Node newNode  = new Node(data);
			Node temp = head;
			
			while(temp!=null && temp.data!=val)
			{
				temp = temp.next;
			}
			
			if(temp.next!=null)
			{
				newNode.next=temp.next;
				temp.next = newNode;
				newNode.prev = temp;
			}
			else {
				System.out.println("value is not found");
			}
		}
	}
	
	public void addByPosition(int value,int pos)
	{
		Node newNode = new Node(value);
	  if(pos==1)
	  {
		  head = newNode;
	  }
	  else {
		  int i=1;
		  Node temp = head;
		  while(i<=pos-2 && temp.next !=null )
		  {
			  temp = temp.next;
			  i++;
		  }
		  if(i>pos-2)
		  {
			  newNode.prev = temp;
			  newNode.next = temp.next;
			  temp.next = newNode;
		  }
		  else {
			  System.out.println("position is not found");
		  }
	  }
	}
	public void deleteByValue(int val)
	{
		Node temp = head;
		if(head==null)
		{
			System.out.println("empty list");
		}
		
		else if(temp.data ==val)
		{
			head.next.prev=null;
			head=temp.next;
		}
		else
		{
			while(temp.next!=null && temp.data != val)
			{
				temp = temp.next;
			}
			if(temp.data == val)
			{
				if(temp.next!=null)
				{
				temp.next.prev = temp.prev;
				temp.prev.next = temp.next;
				}
				else
				{
					temp.prev.next=null;
				}
			}
			else {
				System.out.println("value is not found");
			 }
			
		}
		
	}
	public void deleteByPosition(int pos)
	{
		Node temp =head;
		if(pos==1)
		{
           head=temp.next;
           head.prev=null;
		}
		else
		{
			int  i=0;
			while(temp!=null && i<pos-1)
			{
			  temp = temp.next;
			  i++;
			}
			if(i==pos-1)
			{
				temp.prev.next=temp.next;
				if(temp.next!=null)
				{
				temp.next.prev=temp.prev;
				}
			}
			else
			{
				System.out.println("pos is out of length");
			}
		}
	}
}
		

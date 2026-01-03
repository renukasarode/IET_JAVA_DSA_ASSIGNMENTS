package com.demo.linkedList;

public class SinglyCircularLinkedList {
	Node head;
	class Node {
		int data;
		Node next;
		
		public Node(int data)
		{
			this.data = data;
			this.next=null;
		}
		
	}
	public SinglyCircularLinkedList()
	{
		head= null;
	}
	
	public void addNode(int data)
	{
		Node newNode = new Node(data);
		if(head==null)
		{
		 head=newNode;
		 head.next = head;
		}
		else
		{
			Node temp = head;
			while(temp.next
					!=head)
			{
				temp = temp.next;
			}
			temp.next = newNode;
			newNode.next= head;
		}
	}
	public void displaySinCir()
	{
	  Node temp =head;	
//	  System.out.print(temp.data+"---->");
//	  while(temp.next!=head)
//	  {
//	     System.out.print(temp.next.data+"--->");
//	     temp=temp.next;
//	  }
//	   System.out.println();
	  do {
		  System.out.print(temp.data+"---->");
		  temp=temp.next;
	  }
	  while(temp!=head);
	  System.out.println();
	}
	public void addByValue(int val,int data)
	{
		Node newNode = new Node(data);
		if(head==null)
		{
			System.out.println("empty linked list");
		}
		else if(head.data == val)
		{
			newNode.next = head.next;
			head.next = newNode;
		}
		else
		{
			Node temp = head;
			while(temp.next!=head && temp.data!=val)
			{
				temp = temp.next;
			}
			if(temp.data==val)
			{
				newNode.next = temp.next;
				temp.next = newNode;
			}
			else {
				System.out.println("value is not found");
			}
		}
	}
	public void addByPosition(int pos,int data)
	{
		Node newNode = new Node(data);
		if(head ==null)
		{
			System.out.println("empty list");
		}
		else if(pos ==1)
		{
			newNode.next=head.next;
			head = newNode;
		}
		else
		{
			int i=1;
			Node temp = head;
			while(temp.next!=head && i<=pos-2)
			{
				temp = temp.next;
				i++;
				System.out.println("in while");
			}
		
			if(i>pos-2)
			{
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
		Node tail = head;
		while(tail.next!=head)
		{
			tail=tail.next;
		}
		if(head==null)
		{
			System.out.println("empty list");
		}
		else if(head.data==val)
		{
			head = head.next;
			tail.next=head;
		}
		else {
			Node temp = head;
			Node prev = head;
			while(temp.next!=head && temp.data!=val)
			{
				prev = temp;
				temp = temp.next;
			}
			if(temp.data==val) {
				prev.next=temp.next;
			}
			else {
				System.out.println("value is not found");
			}
		}
		
	}
	public void deleteByPosition(int pos)
	{
		Node prev = head;
		while(prev.next!=head)
		{
			prev = prev.next;
		}
		if(head ==null)
		{
			System.out.println("empty list ");
		}
		else if(pos==1)
		{
			head=head.next;
			prev.next=head;
		}
		else {
			int i=0;
			Node temp = head;
			Node tail = head;
			while(temp!=null && i!=pos -1) {
				tail  = temp;
				temp = temp.next;
				i++;
			}
			if(i==pos -1)
			{
				tail.next = temp.next;
				
			}
			else {
				System.out.println("position is out of bound");
			}
		}
	}
}
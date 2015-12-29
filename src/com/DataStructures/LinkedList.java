package com.DataStructures;

class Node{
int num;
Node next;
}

public class LinkedList {

	public static void main(String[] args) {
		
	
	Node head = new Node();
	Node temp = head;
	
	head = null;
	
	//---------- Node creation
	Node node  =new Node();
	node.num=10;
	node.next=null;
	//----------
	
	
	//now put the above created node in list
	if(head==null)
		head = node;
	else{
		temp.next = node;
		temp=node;
	}
	//-------	
	
	//to displau
	temp=head;
	while (temp!=null) {
		
		
		System.out.println(temp.num);
		temp=temp.next;
		
	}
		
	}
}

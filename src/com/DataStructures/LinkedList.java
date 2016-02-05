package com.DataStructures;

class Node{
int num;
Node next;
}

public class LinkedList {

	public static Node head;
	public static Node temp;
	public static Node node;
	
	public static void main(String[] args) {
		
	
	head = new Node();
	temp = head;
	
	head = null;
	
	//---------- Node creation
	node  =new Node();
	node.num=10;
	node.next=null;
	//----------
	
	makeHeadAsNode(head,node);
	
	
	
	//to display
	temp=head;
	while (temp!=null) {
		
		
		System.out.println(temp.num);
		temp=temp.next;
		
	}
	
		
	}
	
	private static void makeHeadAsNode(Node head2, Node node2) {
		
		
		if(head==null){
			head = node;
		}
		else{
			
			temp.next=node;
			temp=node;
		}
		
	}

	}

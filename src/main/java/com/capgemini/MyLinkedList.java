package com.capgemini;

public class MyLinkedList {
	private INode<Integer> head;
	private INode<Integer> tail;

	public MyLinkedList() {
		this.head = null;
		this.tail = null;
	}

	public INode<Integer> getHead() {
		return this.head;
	}

	public void setHead(INode<Integer> head) {
		this.head = head;
	}
	public void add(INode<Integer> myNode) {
		if(this.tail == null) {
			this.tail = myNode;
		}
		if(this.head == null) {
			this.head = myNode;
		}
		else {
			INode<Integer> tempNode = this.head;
			this.head = myNode;
			this.head.setNext(tempNode);
		}
	}
	public void append(INode<Integer> myNode) {
		if(this.tail == null) {
			this.tail = myNode;
		}
		if(this.head == null) {
			this.head = myNode;
		}
		else {
			this.tail.setNext(myNode);
			this.tail = myNode;
		}
	}
	public void addInMiddle(INode myNode) {
		int middle = size()/2;
		int index = 0;
		INode<Integer> tempNode = this.head;
		while(index+1 != middle) {
			tempNode = tempNode.getNext();
		}
		myNode.setNext(tempNode.getNext());
		tempNode.setNext(myNode);
	}
	public INode popLast() {
		int size = size();
		if(size == 0) {
			System.out.println("No nodes present");
		}
		else {
			INode<Integer> tempNode = this.head;
			while(tempNode.getNext().getNext() != null) {
				tempNode = tempNode.getNext();
			}
			tempNode.setNext(null);
			this.tail = tempNode;
		}
		return this.tail;
	}
	public INode pop() {
		if(size() == 0) {
			System.out.println("No nodes present");
			return null;
		}
		else {
		this.head = head.getNext();
		return this.head;}
	}
	public int size() {
		INode<Integer> tempNode = this.head;
		int count = 0;
		while(tempNode != null) {
			tempNode = tempNode.getNext();
			count++;
		}
		return count;
	}
}

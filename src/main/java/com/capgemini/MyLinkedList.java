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
}

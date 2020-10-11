package com.capgemini;
import org.junit.*;
public class MyLinkedListTest {
	@Test
	public void given3NumbersWhenAddedToLinkedListShouldBeAddedToTop() {
		MyNode<Integer> myFirstNode = new MyNode<Integer>(70);
		MyNode<Integer> mySecondNode = new MyNode<Integer>(30);
		MyNode<Integer> myThirdNode = new MyNode<Integer>(56);
		MyLinkedList linkedlist = new MyLinkedList();
		linkedlist.append(myThirdNode);
		linkedlist.append(myFirstNode);
		linkedlist.addInMiddle(mySecondNode);
		INode node = linkedlist.popLast();
		Assert.assertEquals(mySecondNode, node);
		INode node1 = linkedlist.popLast();
		Assert.assertEquals(myThirdNode, node1);
	}
}

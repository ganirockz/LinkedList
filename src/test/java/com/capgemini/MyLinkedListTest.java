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
		linkedlist.insert(40, 30);
		linkedlist.printMyNodes();
		Assert.assertTrue(linkedlist.search(40));
	}
}

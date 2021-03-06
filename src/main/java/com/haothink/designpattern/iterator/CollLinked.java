package com.haothink.designpattern.iterator;

/**
 *
 */
public class CollLinked implements ICollection{

	private Node head = null;

	private Node tail = null;
	private int count = 0;

	public void add(Object obj){
		Node node = new Node(obj,null);
		if(head == null){
			head = node;
			tail = node;
		}

		tail.setNext(node);

		tail = node;
		count++;
	}


	public int size(){
		return count;
	}


	public IIterator iiterator() {

		return new Linked();
	}

	private class Linked implements IIterator{
		int cursor=0;

		public Object next() {
			Node currNode;
			Node node = head.getNext();
			cursor++;
			if(node == null){
				
				return head.getObj();
			}
			currNode = head;
			head = node;
		
			return currNode.getObj();
		}

	

		public boolean hasNext() {
			// TODO Auto-generated method stub
			return cursor!=size();
		}

	}

}

class Node{

	private Object obj;

	private Node next;

	
	public Node(Object obj, Node next) {
		super();
		this.obj = obj;
		this.next = next;
	}
	public Object getObj() {
		return obj;
	}
	public void setObj(Object obj) {
		this.obj = obj;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}

}

package com.haothink.designpattern.template.hibernate;

public class Transaction {
	
	public void commit(){
		System.out.println("������ύ");
	}
	
	public void rollback(){
		System.out.println("��������лع�");
	}
}

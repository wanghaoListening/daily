package com.haothink.designpattern.template.hibernate;

public class Session {
	
	public void save(Object obj){
		String name = obj.getClass().getName();
		System.out.println("�Ѿ���"+name+"���浽���ݿ���");
	}

	public Transaction beginTransaction() {
		System.out.println("��������");
		return new Transaction();
	}

	public Transaction getTransaction() {
		
		return new Transaction();
	}
	
	
}

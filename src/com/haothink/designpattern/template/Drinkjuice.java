package com.haothink.designpattern.template;

public class Drinkjuice extends DrinkProcess{

	@Override
	protected void joinMaterial() {
		System.out.println("��������֭");
		
	}

	@Override
	protected void making() {
		
		System.out.println("��ʼ�����ˡ�����");
	}

	@Override
	protected void putSpices() {
		
		System.out.println("��������");
	}
	/*
	 * ����ͨ�����ǵ���ʽѡ����ع��Ӻ���
	 * */
	@Override
	protected boolean cusAdree() {
		
		return false;
	}

}

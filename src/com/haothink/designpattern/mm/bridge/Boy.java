package com.haothink.designpattern.mm.bridge;
/**
 * ��ν��ϣ���������ʵ�����Ϊ��ĳ��ǿ�������������ǵ�ǿ����ȥ����������ϵĽ��ѣ�
 * �����������������ָ�����󻯺�ʵ�ֻ�֮�����Ͻ��ѿ�������˵�ǽ�����֮��
 * ��ǿ�����Ļ�����������
 * ��������ɫ֮��ļ̳й�ϵ��Ϊ�ۺϹ�ϵ�����ǽ�����֮���ǿ�����Ļ���Ϊ��������
 * ��ˣ�����ģʽ�е���ν�������ָ��һ�����ϵͳ�ĳ��󻯺�ʵ�ֻ�֮��ʹ�����/��
 * �Ϲ�ϵ�����Ǽ̳й�ϵ���Ӷ�ʹ���߿�����Զ����ر仯�����������ģʽ�����⡣
 * */
public class Boy {
	
	private String name;
	
	public void pursue(MM mm){
		Gift gift = new Ordinary(new Phone());
		boolean b = mm.getGift(gift);
		System.out.println(b);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}

package com.haothink.designpattern.observer.jdkobserver.copy;

import java.util.Observable;
import java.util.Observer;
/**
 * �۲����뱻�۲���֮����������ȵĹ�����ϵ�������ǳ�����ϵġ�������
 * �����������Ƚ�������չ��
 * ȱ�㣺��������ʽ���������۲��߱Ƚ϶�ʱʱ�������������˵���
 * */
public class ConcreteObserver implements Observer{
	private String name;
	@Override
	public void update(Observable o, Object arg) {		
		//System.out.println(name+"���͵�"+arg);
		System.out.println(name+"��ȡ��"+((WeatherSubject)o).getContent());		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}	
}

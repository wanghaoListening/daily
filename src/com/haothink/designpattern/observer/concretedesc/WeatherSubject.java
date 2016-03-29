package com.haothink.designpattern.observer.concretedesc;

import java.util.ArrayList;
import java.util.List;

/**
 * Ŀ�������֪���۲����Ĺ۲��ţ����ṩע����Ӻ�ɾ���۲��ŵĽӿ�
 * @author wanghao
 * 
 * */
public class WeatherSubject {
	List<Observer> obs = new ArrayList<Observer>();
	//�Ѷ�������������ӵ�������
	public void attach(Observer observer){
		obs.add(observer);
	}
	/**
	 * @param observer
	 * ɾ��������������
	 * */
	public void delete(Observer observer){
		obs.remove(observer);
	}
	/**
	 * �������еĶ�����������
	 * */
	protected void notifyObs(){
		System.out.println(obs.size());
		for(Observer ob : obs){
			ob.update(this);
		}
	}
}

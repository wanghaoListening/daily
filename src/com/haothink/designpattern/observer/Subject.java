package com.haothink.designpattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Ŀ�������֪���۲����Ĺ۲��ţ����ṩע����Ӻ�ɾ���۲��ŵĽӿ�
 * @author wanghao
 * 
 * */
public class Subject {
	List<Observer> obs = new ArrayList<Observer>();
	
	public void attach(Observer observer){
		obs.add(observer);
	}
	/**
	 * @param observer
	 * */
	public void delete(Observer observer){
		obs.remove(observer);
	}
	/**
	 * �������еĹ۲���
	 * */
	protected void notifyObs(){
		for(Observer ob : obs){
			ob.update(this);
		}
	}
}

package com.haothink.designpattern.observer;

public class ConcreteSubject extends Subject {	
	private String subjectState;

	public String getSubjectState() {
		return subjectState;
	}
	/**
	 * ��Ŀ����״̬�ı�ʱ���ѹ۲��� 
	 * */
	public void setSubjectState(String subjectState) {
		this.subjectState = subjectState;
		this.notifyObs();
	}
		
}

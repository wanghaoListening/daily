package com.haothink.designpattern.observer.concretedesc;
/**
 * ��ģ�͵�ʵ��
 * */
public class ConcreteObserver implements Observer{
	//�۲��ߵ����֣���˭�յ������ѶϢ
	private String name;
	//�������������Ŀ�����ȡ
	private String weatherContent;
	//���ѵ�����
	private String content;
	/**
	 * ��ȡĿ����״̬�ı�ʱͬ�����۲���
	 * */
	@Override
	public void update(WeatherSubject subject) {
		
		weatherContent = ((ConcreteWeatherSubject)subject).getSubjectState();
		System.out.println(name+"�յ���"+weatherContent+","+content);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getWeatherContent() {
		return weatherContent;
	}
	public void setWeatherContent(String weatherContent) {
		this.weatherContent = weatherContent;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	
	

}

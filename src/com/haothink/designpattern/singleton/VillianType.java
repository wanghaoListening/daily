package com.haothink.designpattern.singleton;
/*��ʽ����ģʽ��ʾ
 * 1.˽�еĹ�����
 * 3.ָ���Լ�ʵ����˽�еľ�̬����
 * 3.�����Լ�����ʵ���ĵĹ�����̬����
 * 
 * */
public class VillianType {
	
	private VillianType villianType = new VillianType();
	
	private VillianType(){}
	
	public VillianType getInstance(){
		
		return villianType;
	}
}

package com.haothink.classloading;
/**
 * ����ʹ�����ֶ���ʾһ��
* ͨ���������ø���ľ�̬�ֶΣ����ᵼ�������ʼ��
 **/
class SuperClass {

	static {
		System.out.println("SuperClass init!");
	}

	public static int value = 123;
}

public class SubClass extends SuperClass {

	static {
		System.out.println("SubClass init!");
	}
}

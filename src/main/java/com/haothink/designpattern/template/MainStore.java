package com.haothink.designpattern.template;
/*ģ�淽��ģʽ�ľ���Ҫ��
 * 1�������
 * 		1.��������
 * 		2.���󷽷�
 * 		3.��ѡ�Ĺ���
 * 		4.template������final��
 * 2��������
 * 		1.ʵ�ֻ���ĳ��󷽷�
 * 		2.���ǹ��ӷ���
 * 
 * */
public class MainStore {
	public static void main(String[] args) {
		DrinkProcess dp = new Drinkjuice();
		dp.makeDrink();
	}
}

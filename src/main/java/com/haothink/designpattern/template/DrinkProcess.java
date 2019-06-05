package com.haothink.designpattern.template;
/*
 *     ģ�巽��ģʽ��ģ�巽��ģʽ׼��һ�������࣬�������߼��Ծ��巽���Լ����幹���ӵ�
 *     ��ʽʵ�֣�Ȼ������һЩ���󷽷�����ʹ����ʵ��ʣ����߼�����ͬ����������Բ�ͬ��
 *     ��ʽʵ����Щ���󷽷����Ӷ���ʣ����߼��в�ͬ��ʵ�֡����ƶ�һ�������߼���ܣ���
 *     ���߼���ϸ���������������ȥʵ�֡�����ԭ����ָһ�����ʵ��Ӧ�ö���չ���ţ�����
 *     �Ĺرա�Ҳ����˵���ʵ��������ڲ����޸ĵ�����±���չ��ģ�巽��ģʽ��ͼ���ɳ�
 *     ������ƶ����߼������ѻ���������ʵ���Ƴٵ�����ȥʵ��,����ͨ���̳е��ֶ�����
 *     ������ĸ��ã�ͬʱҲ�����˿���ԭ��
 * */
public abstract class DrinkProcess {
	//�˷���Ϊfinal���ܱ�����̳�����ͳһ���������в�ͬ��ʵ��
	public final void makeDrink(){
		//1����ˮ
		boilingWater();
		//2��������
		if(cusAdree())
		putSpices();
		//3����ԭ��
		joinMaterial();
		//4��ʼ����
		making();
		//5�ʸ��˿�
		toCustomer();		

	}
	/*HOOK���ӷ���,protectedȨ�޿ɱ����า�ǣ�Ĭ��Ϊ����true 
	 *ѯ�ʹ˿��Ƿ�Ҫ��������
	 *�ṩһ��Ĭ�ϻ�յ�ʵ�֣������������н����ιҹ� 
	 * */ 
	protected boolean cusAdree() {
		
		return true;
	}

	protected abstract void joinMaterial();
	

	private void toCustomer() {
		System.out.println("�ʸ��˿�");
		
	}

	protected abstract void making();
	

	protected abstract void putSpices();
			

	private void boilingWater() {
		System.out.println("��ʼ����ˮ");
		
	}
}

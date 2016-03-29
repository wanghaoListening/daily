package com.haothink.designpattern.adapter;
/*
 * ��һ����Ľӿڡ�ת���ɿͻ���������һ���ӿڣ�
 * ʹԭ�����ڽӿڲ����ݶ�����һ��������Щ�������һ����
 * */
public class  AdapterTrans implements ThreePlugIf{

	private GBTwoPlug plug;
	
	public AdapterTrans(GBTwoPlug plug){
		this.plug = plug;
	}
	@Override
	public void powerSupply() {
	
		plug.powerSupply();
	}

}

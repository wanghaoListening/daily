package com.haothink.designpattern.iterator;
/*
 * ģ��jdk��arraylist����
 * */
public class Container implements ICollection{
	Object[] objs = new Object[10];
	int index=0;
	public void add(Object obj){
		if(objs.length==index){
			Object[] newObjs = new Object[index+index/2];
			//�Ѿ����������copy���µ�����
			System.arraycopy(objs, 0, newObjs, 0, objs.length);
			//������������ø���������
			objs = newObjs;
		}
		objs[index] = obj;
		index++;
	}
	//����Ŀǰ����Ԫ�صĳ���
	public int size(){
		return index;
	}
	@Override
	public IIterator iiterator() {
		
		return new Itr();
	}
	
	private class Itr implements IIterator{
		int cursor;       // index of next element to return
		@Override
		public Object next() {
			
			return objs[cursor++];
		}

		@Override
		public boolean hasNext() {
			return cursor!=size();
		}
		
	}
}

package com.haothink.gc;

public class JavaVMStackSOF {
	
	private int stackLength = 1;
	
	public void stackLeak(){
		stackLength++;
		stackLeak();
		
	}
	
	public static void main(String[] args) {
		JavaVMStackSOF oom = new JavaVMStackSOF();
		try {
			oom.stackLeak();
			//��Ϊջ����Ǹ�err������exception������Throwable
		} catch (Throwable e) {
			System.out.println("���Ϊ  " + oom.stackLength);
			throw e;
		}
	}
	
}

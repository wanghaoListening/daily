package com.haothink.designpattern.mm.command;

public class ShoppingCmd extends Command{

	@Override
	public void excute() {
	
		System.out.println("ȥ����");
	}

	@Override
	public void undo() {
	
		System.out.println("����ȥ����");
	}
	
}

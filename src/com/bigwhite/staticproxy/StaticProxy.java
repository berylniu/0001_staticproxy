package com.bigwhite.staticproxy;

public class StaticProxy implements ISomeService {
	
	private ISomeService target;
	public StaticProxy() {
		target = new SomeServiceImpl();
	}

	@Override
	public void doFirst() {
		target.doFirst();
	}

	@Override
	public void doSecond() {
		System.out.println("无权访问");
	}
}

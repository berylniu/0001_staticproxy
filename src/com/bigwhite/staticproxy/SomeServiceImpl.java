package com.bigwhite.staticproxy;

public class SomeServiceImpl implements ISomeService {

	@Override
	public void doFirst() {
		System.out.println("实现doFirst方法");
	}

	@Override
	public void doSecond() {
		System.out.println("实现doSecond方法");
	}
}

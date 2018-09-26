package com.bigwhite.test;

import com.bigwhite.staticproxy.ISomeService;
import com.bigwhite.staticproxy.SomeServiceImpl;
import com.bigwhite.staticproxy.StaticProxy;

//期望通过proxy实现权限的分离
public class MyClient {
	public static void main(String[] args) {
//		此种方式不可实现权限分离，额外添加静态代理方式实现
		/*ISomeService someservice = new SomeServiceImpl();
		someservice.doFirst();
		someservice.doSecond();*/
//		通过静态代理的方式把目标类中方法进行权限分离
		ISomeService staticProxy = new StaticProxy();
		staticProxy.doFirst();
		staticProxy.doSecond();
	}
}

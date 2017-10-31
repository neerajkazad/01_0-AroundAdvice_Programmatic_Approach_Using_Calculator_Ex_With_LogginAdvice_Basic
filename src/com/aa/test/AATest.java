package com.aa.test;

import org.springframework.aop.framework.ProxyFactory;

import com.aa.beans.Calculator;
import com.aa.beans.LoggingAdvice;

public class AATest {
	public static void main(String[] args) {
		ProxyFactory pf = new ProxyFactory();
		pf.setTarget(new Calculator());
		pf.addAdvice(new LoggingAdvice());
		Calculator proxy = (Calculator) pf.getProxy();
		// Calculator proxy = new Calculator();
		int res = proxy.add(10, 20);
		// int res = proxy.multiply(10, 2, 5);
		System.out.println("Result = " + res);
	}

}

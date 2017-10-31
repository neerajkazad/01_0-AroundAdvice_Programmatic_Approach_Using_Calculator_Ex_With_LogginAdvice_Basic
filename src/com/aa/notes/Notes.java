package com.aa.notes;

public class Notes {
	/**
	 * In this example we are learning how we can use AOP for logging.
	 * LogginAdvice class is only meant for tracing the flow of the application,
	 * suppose in future we don't want logging then directly we can call
	 * 
	 * //Calculator proxy = (Calculator) pf.getProxy(); //line1
		Calculator proxy = new Calculator(); //line2
		int res = proxy.add(10, 20); //line3
		
		line2 Calculator proxy = new Calculator();
		and called the add method.
		
		and if we want logging apply on our clasess then simply we need to create 
		
		ProxyFactory pf = new ProxyFactory();
		pf.setTarget(new Calculator());
		pf.addAdvice(new LoggingAdvice());
		//Calculator proxy = (Calculator) pf.getProxy();
		Calculator proxy = new Calculator();
		int res = proxy.add(10, 20);
		
		In the above code we are creating the Proxy class Object using ProxyFactory class 
		and using ProxyFactory pf we are just telling to proxy what is the target class and 
		which advice we are applying.
		After that using ProxyFactory pf instance we are calling getProxy() method that gives the 
		proxy to use and by this we are calling add() method.
		
		So instead of calling add() method, control is going to invoke method and using MethodInvocation we are 
		accessing the all the information related to target class like 
		
		String methodName = methodInvocation.getMethod().getName();
		
		we get the methodName,
		
		Object[] args = methodInvocation().getArguments();
		we get all the args of the target class method
		
		and when we are calling 
		
		Object ret = methodInvocation.proceed();
		then only our target class method is going to execute other wise target class method
		never called because we are using AroundAdvice AOP.
		
	 */
}

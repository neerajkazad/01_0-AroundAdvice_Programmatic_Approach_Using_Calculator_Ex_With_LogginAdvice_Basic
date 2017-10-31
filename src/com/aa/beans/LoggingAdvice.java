package com.aa.beans;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class LoggingAdvice implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation methodInvocation) throws Throwable {
		String methodName = null;
		Object[] args = null;
		methodName = methodInvocation.getMethod().getName();
		args = methodInvocation.getArguments();
		/*System.out.println("Entering into "+methodName +"("+args[0]+","+args[1]+")");*/
		/**
		 * Generic logic for getting any number of parameter for any method name
		 * because this cross cutting logic not only for add(a,b) method with two 
		 * parameters, so if we have any other method with different parameter also
		 * then we are going to use below logic this is applicable in all scenario.
		 */
		System.out.print("Entering into "+methodName+"(");
		for(int i=0; i<args.length; i++) {
			if(i==0) {
				System.out.print(args[i]);
				continue;
			}
			System.out.print(","+args[i]);
		}
		System.out.println(")");
		Object ret = methodInvocation.proceed();
		System.out.println("Exiting from "+methodName+ "() with ret = "+ret);
		
		return ret;
	}

}
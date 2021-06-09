package com.springbook.biz.common;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Service;
import org.springframework.util.StopWatch;

public class AroundAdvice {

	
	public Object aroundLog(ProceedingJoinPoint pjp) throws Throwable {

		// adound advice�� �޼ҵ� ���� ��.�Ŀ� �����ϴ� ���� 
		// ProceedingJoinPoint�� �ʿ��ϴ�. 
		// ���⿡�� getSignature�� ���翡 �ش��ϴ� ��ü ������ ��ȯ���ְ� .getName���� ���� �޼ҵ��� �̸��� ���Ѵ�. 
		String method = pjp.getSignature().getName();
		

		StopWatch stopWatch = new StopWatch();
		stopWatch.start();

		Object obj = pjp.proceed(); // ���⿡�� ����Ͻ� ������ ����

		stopWatch.stop();

		System.out.println(method + "() �޼ҵ� ���࿡ �ɸ� �ð� : " + stopWatch.getTotalTimeMillis() + "(ms)��");
		return obj;
	}
}

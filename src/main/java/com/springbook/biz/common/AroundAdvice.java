package com.springbook.biz.common;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Service;
import org.springframework.util.StopWatch;

public class AroundAdvice {

	
	public Object aroundLog(ProceedingJoinPoint pjp) throws Throwable {

		// adound advice는 메소드 실행 전.후에 동작하는 로직 
		// ProceedingJoinPoint가 필요하다. 
		// 여기에서 getSignature는 현재에 해당하는 전체 정보를 반환해주고 .getName으로 현재 메소드의 이름을 구한다. 
		String method = pjp.getSignature().getName();
		

		StopWatch stopWatch = new StopWatch();
		stopWatch.start();

		Object obj = pjp.proceed(); // 여기에서 비즈니스 로직이 실행

		stopWatch.stop();

		System.out.println(method + "() 메소드 수행에 걸린 시간 : " + stopWatch.getTotalTimeMillis() + "(ms)초");
		return obj;
	}
}

package com.luban.entity;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

public class LubanAspect {

	@Pointcut("execution(* com.luban.service.AService.test())")
	private void log(){}


	@Before("log()")
	public void invoke() {

	}
}

package com.luban;

import com.luban.entity.User;
import com.luban.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
		UserService userService = applicationContext.getBean(UserService.class);
		userService.test();


//		ProxyFactory factory = new ProxyFactory();
//		factory.setOptimize(true);
//		factory.setTargetClass(UserService.class);
//		factory.addInterface(UserInterface.class);
//		factory.addAdvisor(new MyAdvisor());
//		factory.addAdvice(new AfterReturningAdvice() {
//			@Override
//			public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
//				System.out.println("return");
//			}
//		});
//
//		UserInterface userService = (UserInterface) factory.getProxy();
//		userService.test();
	}
}

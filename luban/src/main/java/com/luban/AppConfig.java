package com.luban;


import com.luban.entity.User;
import com.luban.service.LubanBeanDefinitionRegistar;
import com.luban.service.UserService;
import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.aop.framework.autoproxy.BeanNameAutoProxyCreator;
import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.*;
import org.springframework.core.io.support.PropertiesLoaderUtils;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;


@ComponentScan(value = "com.luban")
public class AppConfig {  // AppConfig对象.user()--->单例池
	                       // AppConfig对象.userService()--->AppConfig对象.user()-->user---userserivce--->单例池


//	@Bean
//	public MapperScannerConfigurer configurer() {
//		MapperScannerConfigurer configurer = new MapperScannerConfigurer();
//		configurer.setBasePackage("com.luban");
//		return configurer;
//	}





	//	@Bean
//	public MessageSource messageSource() {
//		ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
//		messageSource.setBasename("messages");
//		return messageSource;
//	}
//
//	@Bean
//	public ApplicationListener applicationListener() {
//		return new ApplicationListener() {
//			@Override
//			public void onApplicationEvent(ApplicationEvent event) {
//				if (event instanceof PayloadApplicationEvent) {
//					System.out.println(((PayloadApplicationEvent) event).getPayload());
//				}
//
//				System.out.println("接收到了一个事件"+event);
//			}
//		};
//	}

//	@Bean
//	public CustomEditorConfigurer customEditorConfigurer() {
//		CustomEditorConfigurer customEditorConfigurer = new CustomEditorConfigurer();
//
//		Map<Class<?>, Class<? extends PropertyEditor>> propertyEditorMap = new HashMap<>();
//
//		propertyEditorMap.put(User.class, StringToUserPropertyEditor.class);
//
//		customEditorConfigurer.setCustomEditors(propertyEditorMap);
//
//		return customEditorConfigurer;
//	}

	// String-->OrderService

//	@Bean
//	public ConversionServiceFactoryBean conversionService() {
//		ConversionServiceFactoryBean conversionServiceFactoryBean = new ConversionServiceFactoryBean();
//
//		conversionServiceFactoryBean.setConverters(Collections.singleton(new StringToUserConverter()));
//
//		return conversionServiceFactoryBean;
//	}


//	@Bean
//	public ConversionServiceFactoryBean conversionService() {
//		ConversionServiceFactoryBean conversionServiceFactoryBean = new ConversionServiceFactoryBean();
//		conversionServiceFactoryBean.setConverters(Collections.singleton(new StringToUserConverter()));
//
//		return conversionServiceFactoryBean;
//	}

//	@Bean
//	public CustomEditorConfigurer customEditorConfigurer() {
//		CustomEditorConfigurer customEditorConfigurer = new CustomEditorConfigurer();
//		Map<Class<?>, Class<? extends PropertyEditor>> propertyEditorMap = new HashMap<>();
//		propertyEditorMap.put(User.class, StringToUserPropertyEditor.class);
//		customEditorConfigurer.setCustomEditors(propertyEditorMap);
//		return customEditorConfigurer;
//	}


//	@Bean
//	public DataSource dataSource() {
//		DriverManagerDataSource dataSource = new DriverManagerDataSource();
//		dataSource.setUrl("jdbc:mysql://192.168.99.100:33306/luban");
//		dataSource.setUsername("root");
//		dataSource.setPassword("123456");
//		return dataSource;
//	}

	// 事务管理器
//	@Bean
//	public PlatformTransactionManager transactionManager() {
//		DataSourceTransactionManager transactionManager = new DataSourceTransactionManager();
//		transactionManager.setDataSource(dataSource());
//
//		return transactionManager;
//	}

//	@Bean
//	public SqlSessionFactoryBean sqlSessionFactory() {
//		SqlSessionFactoryBean sessionFactoryBean = new SqlSessionFactoryBean();
//		sessionFactoryBean.setDataSource(dataSource());
//		return sessionFactoryBean;
//	}


//	@Bean
//	public MyAspect myAspect() {
//		return new MyAspect();
//	}


//	@Bean
//	public MyAdvisor myAdvisor() {
//		return new MyAdvisor();
//	}

//	@Bean
//	public ProxyFactoryBean foo() {
//		ProxyFactoryBean proxy = new ProxyFactoryBean();
//		proxy.setTarget(userService());
//		proxy.addAdvisor(myAdvisor());
//		return proxy;
//	}

//	@Bean
//	public BeanNameAutoProxyCreator foo(){
//		BeanNameAutoProxyCreator beanNameAutoProxyCreator = new BeanNameAutoProxyCreator();
//		beanNameAutoProxyCreator.setBeanNames("userService");
//		beanNameAutoProxyCreator.setInterceptorNames("myAdvisor");
////		beanNameAutoProxyCreator.setCustomTargetSourceCreators(new TargetSourceCreator() {
////			@Override
////			public TargetSource getTargetSource(Class<?> beanClass, String beanName) {
////
////			}
////		});
//		return beanNameAutoProxyCreator;
//	}


}

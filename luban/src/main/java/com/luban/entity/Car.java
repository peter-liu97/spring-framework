package com.luban.entity;

public class Car {

	public User createBean(){
		System.out.println("无参");
		return new User();
	}

	public static User createBean(String name){
		System.out.println("有参");
		return new User();
	}

}

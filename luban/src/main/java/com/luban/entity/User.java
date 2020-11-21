package com.luban.entity;

import org.springframework.stereotype.Component;

public class User implements UserInterface {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

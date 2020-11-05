package com.mamta.sl.shared;

import org.dominokit.jacksonapt.annotation.JSONMapper;

@JSONMapper
public class User {

	private String name;

	public User() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

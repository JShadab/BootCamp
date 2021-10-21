package com.shad.model;

import org.springframework.stereotype.Component;

@Component("intel")
public class Intel implements CPU {

	@Override
	public void process() {
		System.out.println("Most selling CPU..Intel");

	}

}

package com.shad.model;

import org.springframework.stereotype.Component;

@Component("amd")
//@Primary
public class Amd implements CPU  {

	@Override
	public void process() {
		System.out.println("Another CPU i.e. AMD");
		
	}

	
}

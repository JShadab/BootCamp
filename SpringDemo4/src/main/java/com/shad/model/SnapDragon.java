package com.shad.model;

import org.springframework.stereotype.Component;

@Component()
//@Primary
public class SnapDragon implements CPU  {

	@Override
	public void process() {
		System.out.println("Mobile CPU i.e. SnapDragon");
		
	}

	
}

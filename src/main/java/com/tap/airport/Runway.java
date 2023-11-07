package com.tap.airport;

import org.springframework.stereotype.Component;

@Component
public class Runway {

	public Runway() {
		System.out.println(this.getClass().getSimpleName()+"Runway Created");
	}

}

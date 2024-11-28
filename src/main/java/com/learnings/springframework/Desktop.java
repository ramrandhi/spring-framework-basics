package com.learnings.springframework;

public class Desktop implements Computer {

	@Override
	public void compile() {
		System.out.println("Code Compiled inside Desktop");
		
	}

}

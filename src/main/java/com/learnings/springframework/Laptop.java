package com.learnings.springframework;

public class Laptop implements Computer {

	@Override
	public void compile() {
		System.out.println("Code Compiled inside Laptop");
		
	}

}

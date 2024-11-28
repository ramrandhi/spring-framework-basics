package com.learnings.springframework;

public class Alien {
	
	private Computer com;
	
	private int age;
	
	public Alien() {
		System.out.println("Alien class constructor called");
	}
	
	public void code() {
		System.out.println("HEHE");
		com.compile();
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Computer getCom() {
		return com;
	}

	public void setCom(Computer com) {
		this.com = com;
	}
	
	
}

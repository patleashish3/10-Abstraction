package com.abstraction;

public abstract class AbstractClass_Demo {
	public void disp1() {
		System.out.println("Concreate method of abstract class");
	}
	abstract public void disp2(); 

	public void disp3() {
		System.out.println("I am overriding abstract method");
	}
	public static void main(String[] args) {
		AbstractClass_Demo obj=new AbstractClass_Demo();
		obj.disp1();
		obj.disp2();
	}

}

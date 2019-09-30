package com.abstraction;

public abstract class AbstractClass_Ex2 {
	abstract void get(int a, int b);
	abstract void add();
	abstract void display();
}
abstract class SubClass extends AbstractClass_Ex2{
	int x,y,z;
	void get(int a, int b) {
		x=a;
		y=b;
	}
	void add() {
		z=x+y;
	}
	void display() {
		System.out.println("The Addition is:"+z);
	}
}
class MainClass{
	public static void main(String[] args) {
		SubClass obj=new SubClass();
		obj.get(10, 20);
		obj.add();
		obj.display();
		
	}
}
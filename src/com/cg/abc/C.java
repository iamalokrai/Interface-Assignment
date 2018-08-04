package com.cg.abc;

//Class C implementing interface B which is extending interface A
public class C implements B {

	// Overriding display method
	@Override
	public void disp1() {

		System.out.println("This is display of interface A");
	}

	// Overriding display method of interface B
	@Override
	public void disp2() {
		System.out.println("This is display of interface B");

	}

	public static void main(String[] args) {
		C c = new C();
		c.disp1();
		c.disp2();
	}

}

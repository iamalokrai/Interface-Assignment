package com.cg.vechicle;

//Class to implement all the methods
public class VDemo {

	// main method
	public static void main(String[] args) {

		Vechicle vechicle[] = new Vechicle[3];
		vechicle[0] = new TwoWheeler();
		vechicle[1] = new ThreeWheeler();
		vechicle[2] = new FourWheeler();

		for (int i = 0; i < 3; i++) {
			if (vechicle[i].getClass().isInstance(new ThreeWheeler())) {
				vechicle[i].start();
			}
		}

	}

}

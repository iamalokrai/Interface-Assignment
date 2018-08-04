package com.cg.game;

//Class Demo which will create a method perform to call all the classes
public class Demo {
	void perform(Game game) { // method created
		game.play();
	}

	public static void main(String[] args) {
		Demo demo = new Demo(); // object created with interface reference as
								// parameter
		Game cricket = new Cricket();
		demo.perform(cricket);

		Game football = new Football();
		demo.perform(football);

		Game tennis = new Tennis();
		demo.perform(tennis);

	}

}

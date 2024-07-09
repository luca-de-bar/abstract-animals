package org.lessons.java.abstractanimals;

public class Delfino extends Animale implements IVolante{

	//Implement abstract methods from Animale.
	@Override
	public void verso() {
		System.out.println("IIOOUUIIIIIIIIII");
	}
	
	@Override
	public void mangia() {
		System.out.println("Gamberetti");
	}
	
	@Override
	public void vola() {
		System.out.println("Sto Nuotando!");
	}
}

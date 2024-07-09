package org.lessons.java.abstractanimals;

public class Aquila extends Animale implements IVolante{
	
	//Implement abstract methods from Animale.
	@Override
	public void verso() {
		System.out.println("RRRAAAA AMERICAAAAAA");
	}
	
	@Override
	public void mangia() {
		System.out.println("Daini");
	}
	
	//Implements interface method
	@Override
	public void vola() {
		System.out.println("Sto volando!!");
	}
}

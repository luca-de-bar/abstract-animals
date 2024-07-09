package org.lessons.java.abstractanimals;

public class Passerotto extends Animale implements IVolante{
	
	//Implement abstract methods from Animale.}
	@Override
	public void verso() {
		System.out.println("Chip Chip");
	}
	
	@Override
	public void mangia() {
		System.out.println("Piccoli Insetti");
	}
	
	//Implements interface method
	@Override
	public void vola() {
		System.out.println("Sto volando!!");
	}
	
}

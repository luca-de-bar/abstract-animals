package org.lessons.java.abstractanimals;

public class Cane extends Animale implements INuotante{
	
	//Implement abstract methods from Animale.
	@Override
	public void verso() {
		System.out.println("Bau Bau");
	}
	
	@Override
	public void mangia() {
		System.out.println("Croccantini"); 
	}
	
	@Override
	public void nuota() {
		System.out.println("Affogo!");
	}
	
}

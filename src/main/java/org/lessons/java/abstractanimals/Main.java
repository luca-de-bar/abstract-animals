package org.lessons.java.abstractanimals;

public class Main {
	
	public static void faiVolare (IVolante animale) {
		animale.vola();
	}
	
	public static void faiNuotare (INuotante animale) {
		animale.nuota();
	}
	
	public static void main(String[] args) {
		
		//Creating new istance of each class and test it out
		Cane fufi = new Cane();
		Passerotto chip = new Passerotto();
		Aquila jhonny = new Aquila();
		Delfino jimmy = new Delfino();
		
		
		fufi.dormi();
		fufi.mangia();
		fufi.verso();
		
		chip.dormi();
		chip.mangia();
		chip.verso();
		
		jhonny.dormi();
		jhonny.mangia();
		jhonny.verso();
		
		jimmy.dormi();
		jimmy.mangia();
		jimmy.verso();
		
		Main.faiVolare(chip);
		Main.faiNuotare(fufi);
		
	}
}

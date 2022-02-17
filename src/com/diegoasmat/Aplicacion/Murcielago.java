package com.diegoasmat.Aplicacion;

public class Murcielago extends Mamifero {
	public Murcielago() {
		super.setNivelDeEnergia(300);
	}
	
	public void volar() {
		System.out.println("Vuela");
		setNivelDeEnergia(getNivelDeEnergia()-50);
	}
	public void comerHumanos() {
		System.out.println("Comiendo...");
		setNivelDeEnergia(getNivelDeEnergia()+25);
	}
	public void atacarPueblo() {
		System.out.println("Fuego...");
		setNivelDeEnergia(getNivelDeEnergia()-100);
	}
}

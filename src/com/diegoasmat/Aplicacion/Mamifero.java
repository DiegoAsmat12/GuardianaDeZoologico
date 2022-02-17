package com.diegoasmat.Aplicacion;

public class Mamifero {
	private int nivelDeEnergia;
	
	public Mamifero() {
		nivelDeEnergia=100;
	}
	
	public int mostrarEnergia() {
		System.out.println("Nivel de energía: "+nivelDeEnergia);
		return nivelDeEnergia;
	}

	public int getNivelDeEnergia() {
		return nivelDeEnergia;
	}

	public void setNivelDeEnergia(int nivelDeEnergia) {
		this.nivelDeEnergia = nivelDeEnergia;
	}
	
	
}

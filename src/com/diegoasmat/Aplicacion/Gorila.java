package com.diegoasmat.Aplicacion;

public class Gorila extends Mamifero {
	public void lanzarAlgo() {
		System.out.println("El gorila lanzó algo!");
		setNivelDeEnergia(getNivelDeEnergia()-5);
	}
	
	public void comerBananas() {
		System.out.println("El gorila se siente feliz de comer!!");
		setNivelDeEnergia(getNivelDeEnergia()+10);
	}
	public void escalar() {
		System.out.println("El gorila ha trepado un arbol!");
		setNivelDeEnergia(getNivelDeEnergia()-10);
	}
}

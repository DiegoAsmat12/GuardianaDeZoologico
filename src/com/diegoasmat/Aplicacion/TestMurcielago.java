package com.diegoasmat.Aplicacion;

public class TestMurcielago {

	public static void main(String[] args) {
		Murcielago murcielago = new Murcielago();
		
		murcielago.atacarPueblo();
		murcielago.atacarPueblo();
		murcielago.atacarPueblo();
		
		murcielago.comerHumanos();
		murcielago.comerHumanos();
		
		murcielago.volar();
		murcielago.volar();
		
		murcielago.mostrarEnergia();

	}

}

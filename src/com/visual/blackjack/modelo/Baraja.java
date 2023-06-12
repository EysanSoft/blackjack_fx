package com.visual.blackjack.modelo;

import java.util.Random;

public class Baraja {
	
	public static int[] crearBaraja() {
		int[] barajaDeCartas = new int[52];
        for (int i = 0; i < 52; i++){
        	barajaDeCartas[i] = i;
        }
        return barajaDeCartas;
	}
	
	public static int[] barajar(int[]barajaDeCartas) {
		Random r = new Random();
		for (int i = 0; i < barajaDeCartas.length; i++) {
            int posAleatoria = r.nextInt(barajaDeCartas.length);
            int temp = barajaDeCartas[i];
            barajaDeCartas[i] = barajaDeCartas[posAleatoria];
            barajaDeCartas[posAleatoria] = temp;
        }
		return barajaDeCartas;
	}
}

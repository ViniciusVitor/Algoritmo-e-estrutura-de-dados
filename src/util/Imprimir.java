/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

/**
 *
 * @author Vinicius
 */

import Simplimente_Encadeada.Elemento;
import Simplimente_Encadeada.ListaLigada;

public class Imprimir {

	public Imprimir() {
		// TODO Auto-generated constructor stub
	}

	public static void imprimir(int[] v) {
		System.out.print("[ ");
		for (int i = 0; i < v.length; i++) {
			System.out.print(v[i]);
			if (i < v.length - 1) {
				System.out.print(", ");
			}
		}
		System.out.println(" ]");
	}
	
	public static void imprimir(ListaLigada lista) {
		System.out.print("[ ");
		Elemento proximo = lista.getPrimeiro();
		while (proximo != null) {
			System.out.print(proximo.getValor());
			System.out.print(", ");
			proximo = proximo.getProximo();
		}
		System.out.println(" ]");
	}

}
    


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Simplimente_Encadeada;

/**
 *
 * @author Vinicius
 */
import util.Imprimir;

public class TestarLista {
    
	
public static void main(String[] args) {
		
		ListaLigada lista = new ListaLigada();                
		
                
		lista.inserir(new Elemento(1));
		lista.inserir(new Elemento(2));                
		lista.inserir(new Elemento(3));
		lista.inserir(new Elemento(4));
                lista.inserirP(new Elemento(5), 0);
                lista.inserir(new Elemento(6));
                lista.inserirP(new Elemento(9), 5);
                
                
                lista.Remover(9);
                lista.Remover(5);
                
                
		
		Imprimir.imprimir(lista);
	}

}
    


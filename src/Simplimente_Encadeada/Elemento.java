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
public class Elemento {
    private int valor;
    private Elemento proximo;
    private int qtd;

    public Elemento(int valor) {
        this.valor = valor;
        this.proximo = proximo;
        this.qtd = 0;
    }

   

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Elemento getProximo() {
        return proximo;
    }

    public void setProximo(Elemento proximo) {
        this.proximo = proximo;
    }
    
    
}


package Duplamente_Encadeada;

public class Link {
	private Link anterior;		
	private Link proximo;
	private String valor;		
	//Define valor do nó.
	public void setValor(String valor) {
		this.valor = valor;
	}
	//Retorna valor do nó.
	public String getValor() {
		return valor;
	}
	//Define nó anterior.
	public void setAnterior(Link anterior) {
		this.anterior = anterior;
	}
	//Retorna nó anterior
	public Link getAnterior() {
		return anterior;
	}
	//Define proximo nó.
	public void setProximo(Link proximo) {
		this.proximo = proximo;
	}
	//Retorna proximo nó
	public Link getProximo() {
		return proximo;
	}
}

    


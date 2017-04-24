
package Simplimente_Encadeada;

public class ListaLigada {
    private Elemento primeiro;
    public Elemento ultimo;
    public int qtd = 0;
   
	
    public void inserir(Elemento elemento) {
	if (primeiro == null) {
		primeiro = elemento;
	} else {
		Elemento elementoAtual = primeiro;
		while (elementoAtual.getProximo() != null) {
			elementoAtual = elementoAtual.getProximo();
		}
		elementoAtual.setProximo(elemento);
			
	}
}
    public void inserirP(Elemento valor, int indice){
		Elemento aux;
		Elemento elementoAtual = primeiro;
                if(indice == 0){
                    aux = elementoAtual;
                    primeiro = valor;
                    valor.setProximo(aux);     
                                      
                }else{
                    for(int i = 0; i < indice-1; i++){
                            elementoAtual = elementoAtual.getProximo();	

                    }
                    aux = elementoAtual.getProximo();
                    elementoAtual.setProximo(valor);
                    valor.setProximo(aux); 
                }
	}
   
    
    public void Remover(int elemento){
	Elemento NoTemp = primeiro;
        Elemento NoAnt = null;
	if (primeiro.getValor() == elemento){
            primeiro = primeiro.getProximo();
	}
	else{
            while (NoTemp !=null && NoTemp.getValor() != elemento){
		NoAnt = NoTemp;
		NoTemp = NoTemp.getProximo();
            }
            if(NoTemp != null){
		
                NoAnt.setProximo(NoTemp.getProximo());
            }
            if(NoTemp == ultimo){
		ultimo = NoAnt;
            }
	}
}
    

	public Elemento getPrimeiro() {
		return primeiro;
	}

	public void setPrimeiro(Elemento primeiro) {
		this.primeiro = primeiro;
	}
           
     
			
   
}

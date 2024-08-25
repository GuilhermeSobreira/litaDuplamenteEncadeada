package listaDuplaEncadeada;

public class Lista {
	
	private Celula cabeca;
	private Celula cauda;
	private int totalDeElementos=0;
	
	public void adicionarNoInicio(String nome) {
		if(this.totalDeElementos==0) {
			Celula nova = new Celula(nome);
			this.cabeca = nova;
			this.cauda = nova;
		}else {
			Celula nova = new Celula(this.cabeca, null, nome);
			this.cabeca.setAnterior(nova);
			this.cabeca = nova;
		}
		
		this.totalDeElementos++;
	}
	
	public void adicionarNoFim(String nome) {
		if(this.totalDeElementos==0) {
			adicionarNoInicio(nome);
		}else {
			Celula nova = new Celula(null, this.cauda, nome);
			this.cauda.setProxima(nova);
			this.cauda = nova;
		}
		
		this.totalDeElementos++;
	}
	
	public void adicionarPorPosicao(int posicao, String nome) {
        if (posicao == 0) {
            adicionarNoInicio(nome);
        } 
        
        if (posicao == this.totalDeElementos) {
            adicionarNoFim(nome);
        } else {
            Celula atual = this.cabeca;
            for (int i = 0; i < posicao - 1; i++) {
                atual = atual.getProxima();
            }
            
            Celula nova = new Celula(atual.getProxima(), atual, nome);
            atual.getProxima().setAnterior(nova);
            atual.setProxima(nova);
            
            this.totalDeElementos++;
        	}
        }
        
	public void excluirInicio() {
        if (this.totalDeElementos == 0) {
            return;
        }
        this.cabeca = this.cabeca.getProxima();
        if (this.cabeca != null) {
            this.cabeca.setAnterior(null);
        } else {
            this.cauda = null;
        }
        this.totalDeElementos--;
    }
	
	public void excluirFim() {
        if (this.totalDeElementos == 0) {
            return;
        }
        if (this.totalDeElementos == 1) {
            this.cabeca = null;
            this.cauda = null;
        } else {
            this.cauda = this.cauda.getAnterior();
            this.cauda.setProxima(null);
        }
        
        this.totalDeElementos--;
        
    }
	
	public void excluirPorPosicao(int posicao) {
        if (posicao == 0) {
            excluirInicio();
        } if (posicao == this.totalDeElementos - 1) {
            excluirFim();
        } else {
            Celula atual = this.cabeca;
            for (int i = 0; i < posicao; i++) {
                atual = atual.getProxima();
            }
            atual.getAnterior().setProxima(atual.getProxima());
            atual.getProxima().setAnterior(atual.getAnterior());
            this.totalDeElementos--;
        }
    } 
	
	public void imprimir() {
		Celula aux = this.cabeca;
		for(int cont = 0; cont < this.totalDeElementos-1; cont++) {
				System.out.println(aux.getElemento());
				aux = aux.getProxima();
			}
		}
		
		
	public void imprimirReverso() {
	    Celula aux = this.cauda;
	    for (int cont = 0; cont < this.totalDeElementos - 1; cont++) {
	        System.out.println(aux.getElemento());
	        aux = aux.getAnterior();
	    }
	}

}
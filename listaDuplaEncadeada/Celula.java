package listaDuplaEncadeada;

public class Celula {
	public Celula proxima;
	public Celula anterior;
	public Celula valor;
	public Object elemento;
	
	
	public Celula(String elemento) {
        this.elemento = elemento;
        this.proxima = null;
        this.anterior = null;
    }
	
	public Celula() {
		super();
	}

	public Celula(Celula proxima, Celula anterior, Object elemento) {
		super();
		this.proxima = proxima;
		this.anterior = anterior;
		this.elemento = elemento;
	}

	public Celula getProxima() {
		return proxima;
	}

	public void setProxima(Celula proxima) {
		this.proxima = proxima;
	}

	public Celula getAnterior() {
		return anterior;
	}

	public void setAnterior(Celula anterior) {
		this.anterior = anterior;
	}

	public Object getElemento() {
		return elemento;
	}

	public void setElemento(Object elemento) {
		this.elemento = elemento;
	}

	@Override
	public String toString() {
		return "Celula [proxima=" + proxima + ", anterior=" + anterior + ", elemento=" + elemento + "]";
	}

}

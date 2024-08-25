package listaDuplaEncadeada;

public class Principal {
	public static void main(String[] args) {
		
		Lista l = new Lista();
		l.adicionarNoFim("Lunes");
		l.adicionarNoInicio("Marte");
		l.adicionarNoInicio("Miercules");
		
		System.out.println("Lista: ");
		l.imprimir();
		System.out.println("___________________");
		
		l.adicionarNoFim("Jueves");
		System.out.println("\nLista (adicionado no fim): ");
		l.imprimir();
		System.out.println("___________________");

		l.adicionarPorPosicao(1, "Vienes");
		System.out.println("\nLista (adicionado por posição): ");
		l.imprimir();
		System.out.println("___________________");
		
		System.out.println("\nLista (reversa [primeira versão]): ");
		l.imprimirReverso();
		System.out.println("___________________");
		
		l.excluirPorPosicao(2);
		System.out.println("\nLista (excluido por posição): ");
		l.imprimir();
		System.out.println("___________________");
		
		l.excluirInicio();
		System.out.println("\nLista (excluido inicio): ");
		l.imprimir();
		System.out.println("___________________");

		l.excluirFim();
		System.out.println("\nLista (excluido fim): ");
		l.imprimir();
		System.out.println("___________________");

		System.out.println("\nLista (reversa [segunda versão]): ");
		l.imprimirReverso();

	}
}

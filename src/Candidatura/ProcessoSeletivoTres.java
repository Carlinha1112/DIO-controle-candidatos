package Candidatura;

public class ProcessoSeletivoTres {
	public static void main(String[] args) {
		imprimirSelecionados();
	}
	static void imprimirSelecionados() {
		String [] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO"};
		System.out.println("Imprimindo a lista de candidatos informando o índice do elemento");
		
		for(int indice = 0; indice < candidatos.length; indice++) {
			System.out.println("O candidato de n°" + (indice+1) + " é " + candidatos[indice]);
		}
		System.out.println("Forma abreviada de interação FOR EACH");

		for(String candidato: candidatos) {
			System.out.println("O candidato selecionado foi " + candidato);
		}
	}
}

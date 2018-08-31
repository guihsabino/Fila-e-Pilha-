
public class Fila {
	// FILA
	private int dados[];
	private int tamanho;

	public Fila(int c) {
		dados = new int[c];
		tamanho = 0;
	}

	public void addFinal(int e) {
		// So serve pra dizer se ta errado
		if (tamanho == dados.length) {
			System.out.println("Erro! Encheu, jovem!");
			// Aqui comeca a brincadeira
		} else {
			dados[tamanho] = e;
			tamanho++;
		}

	}

	public int removerInicio() {
		int aux = -1;
		// So serve pra dizer se ta errado
		if (tamanho == 0) {
			System.out.println("ERRO!Esta vazio, jovem!");
			// Aqui comeca a brincadeira
		} else {
			aux = dados [0];
			for (int i = 0; i < tamanho - 1; i++) {
				dados[i] = dados[i + 1];
			}
			tamanho--;
		}
		return aux;
	}

	public String toString() {
		String r = "";
		for (int i = 0; i < tamanho; i++) {
			r = r + " " + dados[i];
		}
		r = r + "\n Quantidade de elementos: " + tamanho;
		return r;
	}
}

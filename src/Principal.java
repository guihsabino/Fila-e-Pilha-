
import javax.swing.JOptionPane;

public class Principal {
	public static void main(String args[]) {
		Fila l1 = new Fila(4);
		// int e;
		int opc = 0;
		do {
			opc = Integer.parseInt(JOptionPane.showInputDialog("1- Adicionar ao final da fila." 
					+ "\n 2- Remover do inicio da fla."
					+ "\n 3- Mostra todos os elementos" 
					+ "\n 6- Sair"));
			switch (opc) {
			case 1:
				l1.addFinal(Integer.parseInt(JOptionPane.showInputDialog("Digite o valor para a ultima posicao: ")));
				break;

			case 2:
				JOptionPane.showConfirmDialog(null, l1.removerInicio());
				break;

			case 3:
				JOptionPane.showMessageDialog(null, l1.toString());
				break;
			default:
				System.out.println("Opcao Invalida!");
				break;
			}
		} while (opc != 6);
	}
}

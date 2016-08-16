package tiegoandrade.github.fibonacci;

import javax.swing.JOptionPane;

/**
 * Classe que implementa a sequ�ncia de Fibonacci.
 * 
 * @author Tiego
 *
 */
public class Aplicacao {

	public static void main(String[] args) {

		/**
		 * N�mero anterior em uma sequ�ncia de fibonacci.
		 */
		int numeroAnterior1 = 0;

		/**
		 * O outro n�mero anterior em uma sequ�ncia de fibonacci.
		 */
		int numeroAnterior2 = 1;

		/**
		 * N�mero subsequente, resultante da soma dos dois n�meros anteriores.
		 */
		int numeroNovo;

		/**
		 * N�mero escolhido para relizar a sequ�ncia de fibonacci.
		 */
		int numeroFibonacci;

		/**
		 * Armazena as informa��es da sequ�ncia que ser� apresentada ao usu�rio.
		 */
		String mensagem = "O 1� n�mero fibonacci �: 1";

		/*
		 * Usu�rio informa quantos n�meros ser�o usado na sequ�ncia de
		 * fibonacci.
		 */
		numeroFibonacci = Integer
				.parseInt(JOptionPane
						.showInputDialog("Informe quantos n�meros ser�o usados na sequ�ncia de fibonacci: "));

		// Realiza a l�gica do c�lculo da sequ�ncia de fibonacci.
		for (int i = 2; i <= numeroFibonacci; i++) {
			numeroNovo = numeroAnterior1 + numeroAnterior2;
			numeroAnterior1 = numeroAnterior2;
			numeroAnterior2 = numeroNovo;
			mensagem = mensagem + "\nO " + i + "� n�mero fibonacci �: "
					+ numeroNovo;
		}

		// Apresenta ao usu�rio a sequ�ncia de fibonacci.
		JOptionPane.showMessageDialog(null, "Os n�meros Fibonacci s�o: \n"
				+ mensagem);
		}
}

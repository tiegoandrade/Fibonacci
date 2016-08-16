package tiegoandrade.github.fibonacci;

import javax.swing.JOptionPane;

/**
 * Classe que implementa a sequência de Fibonacci.
 * 
 * @author Tiego
 *
 */
public class Aplicacao {

	public static void main(String[] args) {

		/**
		 * Número anterior em uma sequência de fibonacci.
		 */
		int numeroAnterior1 = 0;

		/**
		 * O outro número anterior em uma sequência de fibonacci.
		 */
		int numeroAnterior2 = 1;

		/**
		 * Número subsequente, resultante da soma dos dois números anteriores.
		 */
		int numeroNovo;

		/**
		 * Número escolhido para relizar a sequência de fibonacci.
		 */
		int numeroFibonacci;

		/**
		 * Armazena as informações da sequência que será apresentada ao usuário.
		 */
		String mensagem = "O 1° número fibonacci é: 1";

		/*
		 * Usuário informa quantos números serão usado na sequência de
		 * fibonacci.
		 */
		numeroFibonacci = Integer
				.parseInt(JOptionPane
						.showInputDialog("Informe quantos números serão usados na sequência de fibonacci: "));

		// Realiza a lógica do cálculo da sequência de fibonacci.
		for (int i = 2; i <= numeroFibonacci; i++) {
			numeroNovo = numeroAnterior1 + numeroAnterior2;
			numeroAnterior1 = numeroAnterior2;
			numeroAnterior2 = numeroNovo;
			mensagem = mensagem + "\nO " + i + "° número fibonacci é: "
					+ numeroNovo;
		}

		// Apresenta ao usuário a sequência de fibonacci.
		JOptionPane.showMessageDialog(null, "Os números Fibonacci são: \n"
				+ mensagem);
		}
}

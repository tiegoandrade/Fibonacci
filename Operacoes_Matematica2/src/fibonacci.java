import javax.swing.JOptionPane;


public class fibonacci {

	public static void main(String[] args) {
		
		//Declara��o de vari�veis
		int numero_anterior;
		int numero_posterior;
		int numero_novo;
		int i;
		String mensagem = "";
		
		// Atribui��o de valores �s vari�veis.
		numero_anterior = 0;
		numero_posterior = 1;
		mensagem = "O 1� n�mero fibonacci �.: 1";
		
		// Estrutura de Repeti��o que ir� aprensentar os 10 primeiros n�meros de Fibonacci.
		for (i = 2; i <=10; i++)
		{
			numero_novo = numero_anterior + numero_posterior;
			numero_anterior = numero_posterior;
			numero_posterior = numero_novo;
			mensagem = mensagem + "\nO " + i + "� n�mero fibonacci �.: " + numero_novo;
		}
		
		JOptionPane.showMessageDialog (null, "Os n�meros Fibonacci s�o.: \n" + mensagem);
	}

}

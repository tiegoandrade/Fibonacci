import javax.swing.JOptionPane;


public class fibonacci {

	public static void main(String[] args) {
		
		//Declaração de variáveis
		int numero_anterior;
		int numero_posterior;
		int numero_novo;
		int i;
		String mensagem = "";
		
		// Atribuição de valores às variáveis.
		numero_anterior = 0;
		numero_posterior = 1;
		mensagem = "O 1° número fibonacci é.: 1";
		
		// Estrutura de Repetição que irá aprensentar os 10 primeiros números de Fibonacci.
		for (i = 2; i <=10; i++)
		{
			numero_novo = numero_anterior + numero_posterior;
			numero_anterior = numero_posterior;
			numero_posterior = numero_novo;
			mensagem = mensagem + "\nO " + i + "° número fibonacci é.: " + numero_novo;
		}
		
		JOptionPane.showMessageDialog (null, "Os números Fibonacci são.: \n" + mensagem);
	}

}

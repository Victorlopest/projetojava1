package cursojava.executavel;

import javax.swing.JOptionPane;

public class PrimeiraClasseJava {
	
	public static void main(String[] args) {

		String carros = JOptionPane.showInputDialog("informe a quantidade de carros:");
		String pessoas = JOptionPane.showInputDialog("informe a quantidade de pessoas:");
		
		double carroNumero = Double.parseDouble(carros);
		double pessoaNumero = Double.parseDouble(pessoas);
		
		int divisao = (int) (carroNumero / pessoaNumero);
		
		double resto = carroNumero % pessoaNumero;
		
		int resposta = JOptionPane.showConfirmDialog(null, "Deseja ver o resultado?");
		
		if (resposta == 0) {
			JOptionPane.showMessageDialog(null, "divisão para pessoas deu " + divisao);
		}else {
			JOptionPane.showMessageDialog(null,"Obrigado por usar o programa ");
		}
		
		resposta = JOptionPane.showConfirmDialog(null, "Deseja ver o resto?");
		if (resposta == 0) {
			JOptionPane.showMessageDialog(null," sobraram " + resto);
		}else {
			JOptionPane.showMessageDialog(null,"Obrigado por usar o programa ");
		}

	}
	
}

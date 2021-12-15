package cursojava.executavel;


import javax.swing.JOptionPane;

import cursojava.classes.Aluno;

public class PrimeiraClasseJava {
	
	public static void main(String[] args) {
		
		String nome = JOptionPane.showInputDialog("informe o nome");
		String idade = JOptionPane.showInputDialog("informe a idade");
		String registro = JOptionPane.showInputDialog("informe o numero de registro");
		String nota1 = JOptionPane.showInputDialog("informe a nota 1");
		String nota2 = JOptionPane.showInputDialog("informe a nota 2");
		String nota3 = JOptionPane.showInputDialog("informe a nota 3");
		String nota4 = JOptionPane.showInputDialog("informe a nota 4");
		
		Aluno aluno1 = new Aluno();
		aluno1.setNome(nome);
		aluno1.setRegistrogeral(registro);
		aluno1.setIdade(Integer.valueOf(idade));
		aluno1.setNota1(Integer.valueOf(nota1));
		aluno1.setNota2(Integer.valueOf(nota2));
		aluno1.setNota3(Integer.valueOf(nota3));
		aluno1.setNota4(Integer.valueOf(nota4));
		
		System.out.println("O nome do aluno é: " + aluno1.getNome());
		System.out.println("O registro do " + aluno1.getNome() + " é: " + aluno1.getRegistrogeral());
		System.out.println("Média do " + aluno1.getNome() + " é: " + aluno1.mediaNota());
		System.out.println("Resultado é: " + (aluno1.alunoAprovado() ? "Aprovado" : "Reprovado"));
	
		Aluno aluno2 = new Aluno("Maria");
		
		//System.out.println("nome do aluno 2 é: " + aluno2.getNome());
	
		Aluno aluno3 = new Aluno("José", 25);
		
	}
	
		
}

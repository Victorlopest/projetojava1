package cursojava.classes;

import java.util.Objects;

public class Aluno {
	
	private String nome;
	private int idade;
	private String dataNasc;
	private String registrogeral;
	private String numeroCpf;
	private String nomePai;
	private String nomeMae;
	private String dataMatricula;
	private String nomeEscola;
	private String serieMatriculado;
	private int nota1;
	private int nota2;
	private int nota3;
	private int nota4;
	
	
	public Aluno() {
		
	}
	
	public Aluno(String nome) {
		this.setNome(nome);
	}
	
	public Aluno(String nome, int idade) {
		this.setNome(nome);
		this.idade = idade;
		
	}
	
	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(String dataNasc) {
		this.dataNasc = dataNasc;
	}

	public String getRegistrogeral() {
		return registrogeral;
	}

	public void setRegistrogeral(String registrogeral) {
		this.registrogeral = registrogeral;
	}

	public String getNumeroCpf() {
		return numeroCpf;
	}

	public void setNumeroCpf(String numeroCpf) {
		this.numeroCpf = numeroCpf;
	}

	public String getNomePai() {
		return nomePai;
	}

	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}

	public String getNomeMae() {
		return nomeMae;
	}

	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}

	public String getDataMatricula() {
		return dataMatricula;
	}

	public void setDataMatricula(String dataMatricula) {
		this.dataMatricula = dataMatricula;
	}

	public String getNomeEscola() {
		return nomeEscola;
	}

	public void setNomeEscola(String nomeEscola) {
		this.nomeEscola = nomeEscola;
	}

	public String getSerieMatriculado() {
		return serieMatriculado;
	}

	public void setSerieMatriculado(String serieMatriculado) {
		this.serieMatriculado = serieMatriculado;
	}



	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNota1() {
		return nota1;
	}

	public void setNota1(int nota1) {
		this.nota1 = nota1;
	}

	public int getNota2() {
		return nota2;
	}

	public void setNota2(int nota2) {
		this.nota2 = nota2;
	}

	public int getNota3() {
		return nota3;
	}

	public void setNota3(int nota3) {
		this.nota3 = nota3;
	}

	public int getNota4() {
		return nota4;
	}

	public void setNota4(int nota4) {
		this.nota4 = nota4;
	}
	
	public double mediaNota() {
		return ((nota1 + nota2 + nota3 + nota4) /4);
	}
	
	public boolean alunoAprovado() {
		double media = this.mediaNota();
		if (media >= 70) {
			return true;
		}else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return Objects.hash(numeroCpf);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		return Objects.equals(numeroCpf, other.numeroCpf);
	}
}
	


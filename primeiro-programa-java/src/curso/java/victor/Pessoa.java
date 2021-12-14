package curso.java.victor;

import java.util.Date;

public class Pessoa {
	
	private String nome;
	private String sobrenome;
	private int idade;
	private Date dataNasc;
	private String pessoa1;
	
	
	public Date getDataNasc() {
		return dataNasc;
	}
	public void setDataNasc(Date dataNasc) {
		this.dataNasc = dataNasc;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public String getPessoa1() {
		return pessoa1;
	}
	public void setPessoa1(String pessoa1) {
		this.pessoa1 = pessoa1;
	}
	

	

}

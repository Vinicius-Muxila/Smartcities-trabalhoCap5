package br.com.fiap.smartcities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "aluno")
public class Aluno {
	
	@Id
	@SequenceGenerator(name="aluno",sequenceName="sq_tb_aluno",allocationSize=1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="aluno")
	@Column(name = "id_aluno")
	private int id;
	
	@Column(name = "nome_aluno", length = 50)
	private String nome;
	
	@Column(name = "idade_aluno")
	private int idade;

	public Aluno(int id, String nome, int idade) {
		super();
		this.id = id;
		this.nome = nome;
		this.idade = idade;
	}

	public Aluno() {
		super();

		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	
}

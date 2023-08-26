package br.com.fiap.smartcities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "professores")
public class Professores {
	
	@Id
	@SequenceGenerator(name="professores",sequenceName="sq_tb_professores",allocationSize=1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="professores")
	@Column(name = "id_professor")
	private int id;
	
	@Column(name = "nome_professor", length = 50)
	private String nome;

	public Professores(int id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
	}

	public Professores() {
		super();

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	

}

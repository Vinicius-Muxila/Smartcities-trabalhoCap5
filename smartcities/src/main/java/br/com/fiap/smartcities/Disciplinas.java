package br.com.fiap.smartcities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "disciplinas")
public class Disciplinas {
	
	@Id
	@SequenceGenerator(name="disciplinas",sequenceName="sq_tb_disciplinas",allocationSize=1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="disciplinas")
	@Column(name = "id_disciplina")
	private int id;
	
	@Column(name = "nome_disciplina", length = 50)
	private String nome;

	public Disciplinas(int id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
	}

	public Disciplinas() {
		super();

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	

}

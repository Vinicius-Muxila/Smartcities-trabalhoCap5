package br.com.fiap.smartcities.domain;

import java.util.Calendar;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name = "tb_programacao_ferias")
public class ProgramacaoFerias {
	
	@Id
	@SequenceGenerator(name="programacaoFerias",sequenceName="sq_tb_programacaoFerias",allocationSize=1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="programacaoFerias")
	@Column(name = "id_programacao_ferias")
	private int id;
	
	@CreationTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "periodo_aquisitivo", length = 50)
	private Calendar periodoAquisitivo;

	@CreationTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "programar_dt")
	private Calendar programarData;
	
	
	@Column
	private String situacao;
	
	@Column
	private String observacao;
	
	@OneToMany(mappedBy="programacao")
	private List<Ferias> ferias;

	public ProgramacaoFerias(int id, Calendar periodoAquisitivo, Calendar programarData, String situacao,
			String observacao) {
		super();
		this.id = id;
		this.periodoAquisitivo = periodoAquisitivo;
		this.programarData = programarData;
		this.situacao = situacao;
		this.observacao = observacao;
	}

	public ProgramacaoFerias() {
		super();
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Calendar getPeriodoAquisitivo() {
		return periodoAquisitivo;
	}

	public void setPeriodoAquisitivo(Calendar periodoAquisitivo) {
		this.periodoAquisitivo = periodoAquisitivo;
	}

	public Calendar getProgramarData() {
		return programarData;
	}

	public void setProgramarData(Calendar programarData) {
		this.programarData = programarData;
	}

	public String getSituacao() {
		return situacao;
	}

	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public List<Ferias> getFerias() {
		return ferias;
	}

	public void setFerias(List<Ferias> ferias) {
		this.ferias = ferias;
	}

	
	
}

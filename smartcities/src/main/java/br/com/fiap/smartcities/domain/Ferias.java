package br.com.fiap.smartcities.domain;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.crypto.Data;

import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name = "tb_ferias")
public class Ferias {
	
	@Id
	@SequenceGenerator(name="ferias",sequenceName="sq_tb_ferias",allocationSize=1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="ferias")
	@Column(name = "id_ferias")
	private int id;
	
	@CreationTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "periodo_aquisitivo", length = 50)
	private Calendar periodoAquisitivo;

	@CreationTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "dt_inicio")
	private Calendar dataInicio;
	
	@CreationTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "dt_termino")
	private Calendar dataTermino;
	
	@Column
	private String situacao;
	
	@Column
	private String observacao;
	
	@ManyToOne
	@JoinColumn(name = "id_programacao_ferias")
	private ProgramacaoFerias programacao;

	public Ferias(int id, Calendar periodoAquisitivo, Calendar dataInicio, Calendar dataTermino, String situacao,
			String observacao) {
		super();
		this.id = id;
		this.periodoAquisitivo = periodoAquisitivo;
		this.dataInicio = dataInicio;
		this.dataTermino = dataTermino;
		this.situacao = situacao;
		this.observacao = observacao;
	}

	public Ferias() {
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

	public Calendar getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(Calendar dataInicio) {
		this.dataInicio = dataInicio;
	}

	public Calendar getDataTermino() {
		return dataTermino;
	}

	public void setDataTermino(Calendar dataTermino) {
		this.dataTermino = dataTermino;
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

	public ProgramacaoFerias getProgramacao() {
		return programacao;
	}

	public void setProgramacao(ProgramacaoFerias programacao) {
		this.programacao = programacao;
	}
	
	
}

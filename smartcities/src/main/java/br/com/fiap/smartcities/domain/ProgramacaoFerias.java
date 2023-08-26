package br.com.fiap.smartcities.domain;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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

}

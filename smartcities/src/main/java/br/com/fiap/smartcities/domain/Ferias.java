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
	
	
	
}

package com.todoapi.api.model;

import javax.persistence.Table;

import org.springframework.data.annotation.Id;

import java.sql.Time;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Table(name = "0_tasks")
@Entity
@Getter
@Setter
@RequiredArgsConstructor
public class tasks {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Rfrnc", nullable = false)
	private Long Rfrnc;
	
	@Column(name = "Nm")
	private String Nm;
	
	@Column(name = "Dscrptn")
	private String Dscrptn;
	
	@Column(name = "Cndtn")
	private Boolean Cndtn;
	
	@Column(name = "Rmvd")
	private Boolean Rmvd;
	
	@Column(name = "Lckd")
	private Boolean Lckd;
	
	@Column(name = "DtAdmssn")
	private Date DtAdmssn;
	
	@Column(name = "ChckTm")
	private Time ChckTm;
}

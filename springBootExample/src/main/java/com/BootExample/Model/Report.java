package com.BootExample.Model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="REPORTWL")
public class Report implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="PATIENT_ID")
	private String patNo;

	@Column(name="APPROVER_NAME")
	private String patName;

	@Column(name="TRIGGER_DTTM")
	private String examTm;

	@Column(name="REPORT_TEXT")
	private String report;
}

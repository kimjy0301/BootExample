package com.BootExample.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "REPORTWL")
@SequenceGenerator(name = "REPORTWL_SEQ_GENERATOR", sequenceName = "REPORTWL_SEQ", initialValue = 1, allocationSize = 1)
public class Report {

	@Id
	@Column(name = "ROWID")
	private String rowId;

	@Column(name = "PATIENT_ID")
	private String patNo;

	@Column(name = "APPROVER_NAME")
	private String patName;

	@Column(name = "TRIGGER_DTTM")
	private String examTm;

	@Column(name = "REPORT_TEXT")
	private String report;
}

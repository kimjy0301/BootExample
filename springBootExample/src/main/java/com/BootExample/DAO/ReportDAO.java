package com.BootExample.DAO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.BootExample.Model.Report;

public interface ReportDAO extends JpaRepository<Report, Integer>{	
	
	List<Report> findByPatNo(@Param("examTm") String examTm);
	
}

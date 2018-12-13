package com.BootExample.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.BootExample.DAO.ReportDAO;
import com.BootExample.Model.Report;

@RestController
public class ReportController {

	@Autowired
	private ReportDAO reportDAO;

	@RequestMapping("/reportList")
	public List<Report> list(Model model) {

		List<Report> helloList = reportDAO.findAll();
		
		List<Report> reportList222 = reportDAO.findByPatNo("2100215831");
		

		return reportList222;
	}

}

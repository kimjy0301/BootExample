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
	public List<Report> reportList(Model model) {

		List<Report> reportList222 = reportDAO.findByPatNo("2109000111");

		return reportList222;
	}

	@RequestMapping("/reportList2")
	public List<Report> reportList2(Model model) {

		List<Report> reportList222 = reportDAO.findByPatName("배오근");
		return reportList222;
	}
	@RequestMapping("/reportList3")
	public List<Report> reportList3(Model model) {

		List<Report> reportList222 = reportDAO.findByExamTm("20171015103308");
		return reportList222;
	}

}

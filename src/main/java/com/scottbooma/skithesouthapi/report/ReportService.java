package com.scottbooma.skithesouthapi.report;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReportService {
  @Autowired
  private ReportRepository reportRepository;

  public Iterable<Report> list(){
    return reportRepository.findAll();
  }

  public Report create(Report report) {
    return reportRepository.save(report);
  }
}
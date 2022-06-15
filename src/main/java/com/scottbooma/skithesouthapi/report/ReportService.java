package com.scottbooma.skithesouthapi.report;

import java.util.Optional;

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

  public Optional<Report> update(Report report) {
    Optional<Report> foundReport = reportRepository.findById(report.getId());

    if (foundReport.isPresent()) {
        Report updatedReport = foundReport.get();
        updatedReport.setName(report.getName());
        updatedReport.setDate(report.getDate());
        updatedReport.setVibe(report.getVibe());
        updatedReport.setDescription(report.getDescription());
        updatedReport.setLabel(report.getLabel());

        reportRepository.save(updatedReport);
        return Optional.of(updatedReport);
      } else {
        return Optional.empty();
      }
  }

  public void deleteById(Long id) {
    reportRepository.deleteById(id);
  }
}
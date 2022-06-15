package com.scottbooma.skithesouthapi.report;

import java.util.Map;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.scottbooma.skithesouthapi.exception.ResourceNotFoundException;

import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;

@CrossOrigin
@RestController
@RequestMapping("api/reports")
public class ReportController {
  @Autowired
  private ReportService reportService;

  @GetMapping
  @ResponseStatus(HttpStatus.OK)
  public Map<String, Iterable<Report>> list(){
    Iterable<Report> reports = reportService.list();
    return createHashPlural(reports);
  }

  @PostMapping
  @ResponseStatus(HttpStatus.CREATED)
  public Map<String, Report> create(@Validated @RequestBody Report report) {
    Report createdReport = reportService.create(report);
    return createHashSingular(createdReport);
  }

  @PutMapping("/{id}")
  @ResponseStatus(HttpStatus.CREATED)
  public Map<String, Report> update(@RequestBody Report report, @PathVariable Long id) {
    Report updatedReport = reportService
      .update(report)
      .orElseThrow(() -> new ResourceNotFoundException("No report with that ID"));

    return createHashSingular(updatedReport);
  }

  @DeleteMapping("/{id}")
  @ResponseStatus(HttpStatus.NO_CONTENT)
  public void delete(@PathVariable Long id) {
    reportService.deleteById(id);
  }

  private Map<String, Report> createHashSingular(Report report){
    Map<String, Report> response = new HashMap<String, Report>();
    response.put("report", report);

    return response;
  }

  private Map<String, Iterable<Report>> createHashPlural(Iterable<Report> reports){
    Map<String, Iterable<Report>> response = new HashMap<String, Iterable<Report>>();
    response.put("resorts", reports);

    return response;
  }
}
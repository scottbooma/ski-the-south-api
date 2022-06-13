package com.scottbooma.skithesouthapi.report;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.Column;

import lombok.Data;

@Entity
@Data
@Table(name = "reports")
public class Report {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;

  @Column(name = "name")
  private String name;

  @Column(name = "date")
  private String date;

  @Column(name = "vibe")
  private short vibe;

  @Column(name = "description", columnDefinition = "TEXT")
  private String description;

  @Column(name = "label")
  private String label;
}
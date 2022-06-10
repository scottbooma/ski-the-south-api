package com.scottbooma.skithesouthapi.resort;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.Column;

import lombok.Data;

@Entity
@Data
@Table(name = "resort")
public class Resort {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;

  @Column(name = "name")
  private String name;

  @Column(name = "location")
  private String location;

  @Column(name = "image_url")
  private String imageUrl;

  @Column(name = "label")
  private String label;

  @Column(name = "elevation")
  private String elevation;

  @Column(name = "vertical")
  private String vertical;

  @Column(name = "acres")
  private short acres;

  @Column(name = "trails")
  private short trails;

  @Column(name = "lifts")
  private short lifts;

  @Column(name = "snow_report_url")
  private short snowReportUrl;

  @Column(name = "webcams_url")
  private short webcamsUrl;

  @Column(name = "weather_url")
  private short weatherUrl;

  @Column(name = "lift_tickets_url")
  private short liftTicketsUrl;

  @Column(name = "rentals_url")
  private short rentalsUrl;
}
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
}
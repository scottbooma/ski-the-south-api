package com.scottbooma.skithesouthapi.resort;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ResortService {
  @Autowired
  private ResortRepository resortRepository;

  public Iterable<Resort> list(){
    return resortRepository.findAll();
  }
}
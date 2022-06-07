package com.scottbooma.skithesouthapi.resort;

import java.util.Map;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin
@RestController
@RequestMapping("api/resorts")
public class ResortController {
  @Autowired
  private ResortService resortService;

  @GetMapping
  @ResponseStatus(HttpStatus.OK)
  public Map<String, Iterable<Resort>> list(){
    Iterable<Resort> resorts = resortService.list();
    return createHashPlural(resorts);
  }

  private Map<String, Iterable<Resort>> createHashPlural(Iterable<Resort> resorts){
    Map<String, Iterable<Resort>> response = new HashMap<String, Iterable<Resort>>();
    response.put("resorts", resorts);

    return response;
  }
}
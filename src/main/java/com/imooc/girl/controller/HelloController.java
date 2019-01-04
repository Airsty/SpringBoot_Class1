package com.imooc.girl.controller;

import com.imooc.girl.properties.GirlProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

  @Autowired
  private GirlProperties girlProperties;

  //  @RequestMapping(value = "/say", method = RequestMethod.POST)
  @GetMapping("/say/{id}")
  public String say(@PathVariable(value = "id", required = false) Integer id) {
//    return girlProperties.getCupSize();
    return "id = " + id;
  }
}

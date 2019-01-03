package com.imooc.girl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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

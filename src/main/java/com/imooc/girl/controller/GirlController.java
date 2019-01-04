package com.imooc.girl.controller;

import com.imooc.girl.domain.Girl;
import com.imooc.girl.dao.GirlDao;
import com.imooc.girl.service.GirlService;
import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GirlController {

  @Autowired
  private GirlDao girlDao;

  @Autowired
  private GirlService girlService;

  //查询女生列表所有
  @GetMapping(value = "/girls")
  public List<Girl> girlsList() {
    return girlDao.findAll();
  }

  //新增一个女生
  @PostMapping(value = "/girls")
  public Girl girlAdd(@Valid Girl girl, BindingResult bindingResult) {
    if (bindingResult.hasErrors()) {
      System.out.println(bindingResult.getFieldError().getDefaultMessage());
      return null;
    }

    girl.setAge(girl.getAge());
    girl.setCupSize(girl.getCupSize());
    return girlDao.save(girl);
  }

  //通过ID查询一个女生
  @GetMapping("/girls/{id}")
  public Girl findGirl(@PathVariable("id") Integer id) {
    return girlDao.findOne(id);
  }

  //更新
  @PutMapping("/girls/{id}")
  public Girl girlUpdate(@PathVariable("id") Integer id,
      @RequestParam("cupSize") String cupSize,
      @RequestParam("age") Integer age) {
    Girl girl = new Girl();
    girl.setCupSize(cupSize);
    girl.setAge(age);
    girl.setId(id);

    return girlDao.save(girl);

  }

  //删除
  @DeleteMapping("/girls/{id}")
  public void deleteGirl(@PathVariable("id") Integer id) {
    girlDao.delete(id);
  }

  //通过年龄查询女生列表
  @GetMapping("/girls/age/{age}")
  public List<Girl> girlFindListByAge(@PathVariable("age") Integer age) {
    return girlDao.findByAge(age);
  }


  @PostMapping("/girls/two")
  public void girlTwo() {
    girlService.insertTwo();
  }

}

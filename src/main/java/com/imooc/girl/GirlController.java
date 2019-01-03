package com.imooc.girl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
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

  //查询女生列表所有
  @GetMapping(value = "/girls")
  public List<Girl> girlsList() {
    return girlDao.findAll();
  }

  //新增一个女生
  @PostMapping(value = "/girls")
  public Girl girlAdd(@RequestParam("cupSize") String cupSize,
      @RequestParam("age") Integer age) {
    Girl girl = new Girl();
    girl.setAge(age);
    girl.setCupSize(cupSize);
    return girlDao.save(girl);
  }

  //通过ID查询一个女生
  @GetMapping("/girls/{id}")
  public Girl findGirl(@PathVariable("id") Integer id) {
    return girlDao.getOne(id);
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
    girlDao.deleteById(id);
  }

}

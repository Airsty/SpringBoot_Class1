package com.imooc.girl.dao;

import com.imooc.girl.domain.Girl;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GirlDao extends JpaRepository<Girl, Integer> {

  //通过年龄查询
  public List<Girl> findByAge(Integer age);

}

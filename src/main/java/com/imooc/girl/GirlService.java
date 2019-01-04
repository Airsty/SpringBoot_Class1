package com.imooc.girl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class GirlService {

  @Autowired
  private GirlDao girlDao;

  @Transactional
  public void insertTwo() {
    Girl girlA = new Girl();
    girlA.setCupSize("A");
    girlA.setAge(18);
    girlDao.save(girlA);

    Girl girlB = new Girl();
    girlB.setCupSize("B");
    girlB.setAge(20);
    girlDao.save(girlB);


  }

}
package com.imooc.girl.service;

import com.imooc.girl.domain.Girl;
import com.imooc.girl.dao.GirlDao;
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
    girlB.setCupSize("BBBB");
    girlB.setAge(20);
    girlDao.save(girlB);

    Girl girlC = new Girl();
    girlC.setCupSize("cccc");
    girlC.setAge(20);
    girlDao.save(girlC);


  }

}

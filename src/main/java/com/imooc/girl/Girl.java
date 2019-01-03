package com.imooc.girl;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Girl {

  @Id
  @GeneratedValue
  private Integer id;

  private String cupSize;

  private Integer age;

  public Girl() {
  }
}

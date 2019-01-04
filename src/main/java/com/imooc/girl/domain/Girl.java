package com.imooc.girl.domain;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import lombok.Data;

@Data
@Entity
public class Girl {

  @Id
  @GeneratedValue
  private Integer id;

  private String cupSize;

  @Min(value = 18, message = "未成年少女禁止入内")
  private Integer age;

  public Girl() {
  }
}

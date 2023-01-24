package com.kitchen.cloudcommonpostgresqldb.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

// import org.springframework.data.rest.core.annotation.RestResource;

import lombok.Data;

@Data
@Entity
// Todo RestResource
// @RestResource(rel="tacos", path="tacos")
@Table(name = "taco", schema = "taco_sh", catalog = "taco_db")
public class TacoEntity implements Serializable {

  @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
  private Long id;
  
  @NotNull
  @Size(min=5, message="Name must be at least 5 characters long")
  private String name;

  @Column(name = "created_at")
  private Date createdAt;

  @ManyToMany(targetEntity=IngredientEntity.class)
  @Size(min=1, message="You must choose at least 1 ingredient")
  private List<IngredientEntity> ingredients;

  @PrePersist
  void createdAt() {
    this.createdAt = new Date();
  }
}

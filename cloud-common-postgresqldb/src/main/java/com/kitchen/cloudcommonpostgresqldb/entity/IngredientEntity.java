package com.kitchen.cloudcommonpostgresqldb.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.kitchen.cloudcommonpostgresqldb.enums.TypeIngredient;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
@NoArgsConstructor(access=AccessLevel.PRIVATE, force=true)
@Entity
@Table(name = "ingredient", schema = "taco_sh", catalog = "taco_db")
public class IngredientEntity implements Serializable {

  // private final String id;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

  private final String name;

  @Column(name = "type_ingredient")
  private final TypeIngredient typeIngredient;

}

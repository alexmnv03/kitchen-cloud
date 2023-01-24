package com.kitchen.cloudcommonpostgresqldb.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.CreditCardNumber;

import lombok.Data;

@Data
@Entity
@Table(name = "taco_order", schema = "taco_sh", catalog = "taco_db")
public class TacoOrderEntity implements Serializable {

  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
  private Long id;

  @Column(name = "created_at")
  private Date placedAt;

   @ManyToOne
   private UserEntity user;

  @NotBlank(message="Delivery name is required")
  @Column(name = "delivery_name")
  private String deliveryName;

  @NotBlank(message="Street is required")
  @Column(name = "delivery_street")
  private String deliveryStreet;

  @NotBlank(message="City is required")
  @Column(name = "delivery_city")
  private String deliveryCity;

  @NotBlank(message="State is required")
  @Column(name = "delivery_state")
  private String deliveryState;

  @NotBlank(message="Zip code is required")
  @Column(name = "delivery_zip")
  private String deliveryZip;

  @CreditCardNumber(message="Not a valid credit card number")
  @Column(name = "cc_number")
  private String ccNumber;

  @Pattern(regexp="^(0[1-9]|1[0-2])([\\/])([2-9][0-9])$",
           message="Must be formatted MM/YY")
  @Column(name = "cc_expiration")
  private String ccExpiration;

  @Digits(integer=3, fraction=0, message="Invalid CVV")
  @Column(name = "cc_cvv")
  private String ccCVV;

  @ManyToMany(targetEntity=TacoEntity.class)
  private List<TacoEntity> tacos = new ArrayList<>();

  public void addTaco(TacoEntity design) {
    this.tacos.add(design);
  }

  @PrePersist
  void placedAt() {
    this.placedAt = new Date();
  }

}

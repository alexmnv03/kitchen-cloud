package com.kitchen.cloudcommonpostgresqldb.dto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.validation.constraints.NotBlank;

import com.kitchen.cloudcommonpostgresqldb.entity.UserEntity;

import lombok.Data;

@Data
public class TacoOrderDto {

    @NotBlank(message = "The \"id\" attribute must not be null")
    private Long id;

    private Date placedAt;
  
    private UserEntity user;
  
    @NotBlank(message="Delivery name is required")
    private String deliveryName;
  
    @NotBlank(message="Street is required")
    private String deliveryStreet;
  
    @NotBlank(message="City is required")
    private String deliveryCity;
  
    @NotBlank(message="State is required")
    private String deliveryState;
  
    @NotBlank(message="Zip code is required")
    private String deliveryZip;

    private String ccNumber;

    private String ccExpiration;

    private String ccCVV;
  
    private List<TacoDto> tacos = new ArrayList<>();

}

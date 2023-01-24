package com.kitchen.cloudcommonpostgresqldb.dto;

import java.util.Date;
import java.util.List;

import javax.validation.constraints.NotBlank;

import lombok.Data;

@Data
public class TacoDto {
    
    @NotBlank(message = "The \"id\" attribute must not be null")
    private Long id;
  
    @NotBlank(message = "The \"name\" attribute must not be null")
    private String name;
    
    private Date createdAt;
  
    private List<IngredientDto> ingredients;
  
}

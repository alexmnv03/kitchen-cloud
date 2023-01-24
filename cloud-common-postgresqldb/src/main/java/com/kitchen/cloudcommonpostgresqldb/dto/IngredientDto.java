package com.kitchen.cloudcommonpostgresqldb.dto;

import javax.validation.constraints.NotBlank;

import com.kitchen.cloudcommonpostgresqldb.enums.TypeIngredient;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
@NoArgsConstructor(access=AccessLevel.PRIVATE, force=true)
public class IngredientDto {    
    // private final String id;

    @NotBlank(message = "The \"id\" attribute must not be null")
    private Long id;
    @NotBlank(message = "The \"name\" attribute must not be null")
    private final String name;
    @NotBlank(message = "The \"typeIngredient\" attribute must not be null")
    private final TypeIngredient typeIngredient;
  
}

package com.example.dtos;

import com.example.models.WoodenProduct;
import lombok.*;

import javax.persistence.Entity;

@Builder @Getter @Setter @AllArgsConstructor @NoArgsConstructor
public class WoodenProductDto extends ProductDto {
    private Long weight;
    public static WoodenProductDto convertToDto(WoodenProduct woodenProduct){
        WoodenProductDto woodenProductDto=new WoodenProductDto();
        woodenProductDto.setId(woodenProduct.getId());
        woodenProductDto.setP_name(woodenProduct.getP_name());
        woodenProductDto.setPrize(woodenProduct.getPrize());
        woodenProductDto.setProduct_type(woodenProduct.getProductType());
        woodenProductDto.setWeight(woodenProduct.getWeight());
        return woodenProductDto;
    }
}

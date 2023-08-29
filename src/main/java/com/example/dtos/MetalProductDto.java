package com.example.dtos;

import com.example.models.MetalProduct;
import lombok.*;

import javax.persistence.Entity;

@Builder @Getter @Setter @AllArgsConstructor @NoArgsConstructor
public class MetalProductDto extends ProductDto {
    private String metal_name;
    public static MetalProductDto convertToDto(MetalProduct metalProduct){
        MetalProductDto metalProductDto=new MetalProductDto();
        metalProductDto.setId(metalProduct.getId());
        metalProductDto.setP_name(metalProduct.getP_name());
        metalProductDto.setPrize(metalProduct.getPrize());
        metalProductDto.setProduct_type(metalProduct.getProductType());
        metalProductDto.setMetal_name(metalProduct.getMetal_name());
        return metalProductDto;
    }
}

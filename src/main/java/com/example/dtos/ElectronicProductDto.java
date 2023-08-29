package com.example.dtos;

import com.example.models.ElectronicProduct;
import lombok.*;

import javax.persistence.Entity;

@Builder @Getter @Setter @AllArgsConstructor @NoArgsConstructor
public class ElectronicProductDto extends ProductDto {
    private Long power;
    public static ElectronicProductDto convertToDto(ElectronicProduct electronicProduct){
        ElectronicProductDto electronicProductDto=new ElectronicProductDto();
        electronicProductDto.setId(electronicProduct.getId());
        electronicProductDto.setP_name(electronicProduct.getP_name());
        electronicProductDto.setPrize(electronicProduct.getPrize());
        electronicProductDto.setProduct_type(electronicProduct.getProductType());
        electronicProductDto.setPower(electronicProduct.getPower());
        return electronicProductDto;
    }
}

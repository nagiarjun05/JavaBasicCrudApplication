package com.example.dtos;

import com.example.models.ElectronicProduct;
import com.example.models.MetalProduct;
import com.example.models.Product;
import com.example.models.WoodenProduct;
import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@SuperBuilder
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public abstract class ProductDto{
    private long id;
    private String p_name;
    private BigDecimal prize;
    private String product_type;

    public static List<ProductDto> getAllProductDtos(List<Product> list){
        return list.stream().map(l->{
            ProductDto p = null;
            switch (l.getProductType()) {
                case "metal_product":
                    p = MetalProductDto.convertToDto((MetalProduct) l);
                    break;
                case "electronic_product":
                    p = ElectronicProductDto.convertToDto((ElectronicProduct) l);

                    break;
                case "wooden_product":
                    p = WoodenProductDto.convertToDto((WoodenProduct) l);
                    break;
            }
            return p;
        }).collect(Collectors.toList());
    }
}

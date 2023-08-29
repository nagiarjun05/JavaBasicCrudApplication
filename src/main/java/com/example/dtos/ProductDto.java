package com.example.dtos;

import com.example.models.Product;
import lombok.*;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Transient;
import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

@Builder @Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class ProductDto{
    private long id;
    private String p_name;
    private BigDecimal prize;
    private String product_type;

    public static List<ProductDto> getAllProductDtos(List<Product> list){
        System.out.println(list);
        return list.stream().map(l->{
           ProductDto p=new ProductDto();
           return convertToDto(l);
        }).collect(Collectors.toList());
    }


    private static ProductDto convertToDto(Product product){
        ProductDto productDto=new ProductDto();
        productDto.setId(product.getId());
        productDto.setP_name(product.getP_name());
        productDto.setPrize(product.getPrize());
        productDto.setProduct_type(product.getProductType());
        return productDto;
    }
}

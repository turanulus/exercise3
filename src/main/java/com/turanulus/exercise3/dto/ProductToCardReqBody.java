package com.turanulus.exercise3.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.turanulus.exercise3.model.Product;
import lombok.Data;

import java.util.List;

@Data
public class ProductToCardReqBody {
  @JsonProperty("productList")
  private List<Product> productList;
}

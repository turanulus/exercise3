package com.turanulus.exercise3.dto;

import com.turanulus.exercise3.model.Product;
import lombok.Data;

import java.util.List;

@Data
public class CardReqBody {
  List<Product> productList;
}

package edu.whpu.service;

import edu.whpu.entity.Product;

import java.util.List;

/**
 * @author bin_wen
 * @date 2023/4/9 12:36
 */
public interface ProductService {

    Product getById(Long id);

    Boolean saveProduct(Product product);

    List<Product> getList();

}

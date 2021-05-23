package com.sha.springbootmicroservice1product.service;
import java.util.List;
import com.sha.springbootmicroservice1product.model.Product;
public interface IProductService
{
    Product saveProduct(Product product);
    void deleteProduct(long productId);
    List<Product> findAllProducts();
}

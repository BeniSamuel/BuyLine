package com.buyline.buyline.repository;

import com.buyline.buyline.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository {
    public Product findProductByProductName (String name);
}

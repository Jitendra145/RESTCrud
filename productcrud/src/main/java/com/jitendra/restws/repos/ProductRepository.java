package com.jitendra.restws.repos;
import org.springframework.data.jpa.repository.JpaRepository;

import  com.jitendra.restws.entities.Product;

public interface ProductRepository extends JpaRepository<Product,Integer> {

}

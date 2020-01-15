package com.javatechie.springdatajpamapping.repository;

import com.javatechie.springdatajpamapping.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}

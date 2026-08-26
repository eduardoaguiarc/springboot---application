package com.projetospring.demo.repositories;

import com.projetospring.demo.entities.Product;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}

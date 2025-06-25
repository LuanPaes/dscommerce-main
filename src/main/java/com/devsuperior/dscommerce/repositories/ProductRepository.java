package com.devsuperior.dscommerce.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.GetMapping;

import com.devsuperior.dscommerce.entities.Product;

public interface ProductRepository extends JpaRepository<Product,Long> {
	
}

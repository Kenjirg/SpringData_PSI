package com.spring.mvc.psi.repository;

import com.spring.mvc.psi.entities.Product;
import java.io.Serializable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}

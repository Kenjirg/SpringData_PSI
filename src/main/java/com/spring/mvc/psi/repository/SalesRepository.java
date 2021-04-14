package com.spring.mvc.psi.repository;

import com.spring.mvc.psi.entities.Product;
import com.spring.mvc.psi.entities.Sales;
import java.io.Serializable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SalesRepository extends JpaRepository<Sales, Integer> {

}

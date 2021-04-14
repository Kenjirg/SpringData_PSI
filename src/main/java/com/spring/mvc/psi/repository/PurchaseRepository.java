package com.spring.mvc.psi.repository;

import com.spring.mvc.psi.entities.Product;
import com.spring.mvc.psi.entities.Purchase;
import java.io.Serializable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PurchaseRepository extends JpaRepository<Purchase, Integer> {

}

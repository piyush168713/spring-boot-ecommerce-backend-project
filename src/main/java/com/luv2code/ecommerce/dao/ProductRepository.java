package com.luv2code.ecommerce.dao;

import com.luv2code.ecommerce.entity.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestParam;

// @CrossOrigin("http://localhost:4200")
@RepositoryRestResource
public interface ProductRepository extends JpaRepository<Product, Long> {

    Page<Product> findByCategoryId(@RequestParam("id") Long id, Pageable pageable);
    // Behind the scene: SELECT * from product where category_id=?
    // Spring Data REST automatically exposes endpoint: http://localhost:8080/api/products/search/findByCategoryId?id=1

    // Its a query like in SQL
    Page<Product> findByNameContaining(@RequestParam("name") String name, Pageable pageable);

}

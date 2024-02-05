package com.coffee.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.coffee.models.productModel;

@Repository
public interface productRepository extends JpaRepository<productModel, String>{

}

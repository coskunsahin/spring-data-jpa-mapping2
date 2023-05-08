package com.javatechie.jpa.repository;

import com.javatechie.jpa.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Collection;
import java.util.List;

public interface ProductRepository extends JpaRepository<Product,Integer> {
    @Query(value = "SELECT u.price ,u.productName FROM Product u WHERE u.price = 5")
    List<Product> gettallProduct();




    default List<Product> findByName(String productName) {
        return null;
    }

    default void add(Product product) {

    }

default void delete(int pid){
    }
}
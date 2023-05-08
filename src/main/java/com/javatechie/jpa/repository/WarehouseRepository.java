package com.javatechie.jpa.repository;


import com.javatechie.jpa.dto.StocTransferResponse;

import com.javatechie.jpa.entity.Warehouse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;


public interface WarehouseRepository extends JpaRepository<Warehouse,Integer> {

    @Query("SELECT new com.javatechie.jpa.dto.StocTransferResponse(c.WarehouseName, p.productName) FROM Warehouse c JOIN c.products p")
    public List<StocTransferResponse> getJoinInformation();

    List<Warehouse> findAll();



}



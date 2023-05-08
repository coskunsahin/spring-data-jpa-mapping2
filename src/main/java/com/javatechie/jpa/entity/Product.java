package com.javatechie.jpa.entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import org.hibernate.boot.MetadataBuilder;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity


public class Product {
    @Id
    private int pid;
    private String productName;
    private int cid;
    private int qty;
    private int price;
    private  double out;
    private  double inq;
    private double general;



}


package com.javatechie.jpa.entity;

import com.zaxxer.hikari.util.ConcurrentBag;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;



@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class  Warehouse {

    @Id
    @GeneratedValue
    private int wid;
    private String WarehouseName;
    private int  pid;


    private  String zipcode;
    @ManyToMany(targetEntity = Product.class,cascade = CascadeType.ALL)
    @JoinColumn(name ="cp_fk",referencedColumnName = "id")


    //@ManyToMany(mappedBy = "projects", cascade = { CascadeType.ALL })
    //private Set<Employee> employees = new HashSet<Employee>();
    private List<Product> products;



}
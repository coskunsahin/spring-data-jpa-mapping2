package com.javatechie.jpa.controller;

import com.javatechie.jpa.dto. StocTransferRequest;
import com.javatechie.jpa.entity.Product;
import com.javatechie.jpa.entity.Warehouse;
import com.javatechie.jpa.repository.WarehouseRepository;
import com.javatechie.jpa.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class WarehouseController {
    @Autowired
    private WarehouseRepository warehouseRepository;
    @Autowired
    private ProductRepository productRepository;

    @PostMapping("/placeW")
    public Warehouse placeOrder(@RequestBody StocTransferRequest request){
        return warehouseRepository.save(request.getWarehouse());
    }
    @GetMapping("/findAll")
    public List<Warehouse> findAllStock(){
        List<Warehouse> all = warehouseRepository.findAll();
        return all;
    }

    @GetMapping("/product/getall")
    public List<Product> gettallProduct(){
        List<Product> all = productRepository.gettallProduct();
        return  all;
    }
    @GetMapping("/{productName}")
    public List<Product> findByName(@PathVariable("productName")
                                     String productName) {
        return productRepository.findByName(productName);

    }

    @PutMapping("/{wid}/product/{pid}")
    Warehouse addWarehouseToProduct(
            @PathVariable int wid,
            @PathVariable int pid
    ) {
        Warehouse warehouse=warehouseRepository.findById(wid).get();
        Product  product=productRepository.findById(pid).get();
        productRepository.add(product);
        productRepository.save(product);
        //subject.enrolledStudents.add(student)
        return warehouseRepository.save(warehouse);
    }

    @DeleteMapping("/{pid}")
    public String deleteProduct(@PathVariable("pid") Integer pid) {
        try {
            productRepository.deleteById(pid);
            return "Deleted successfully";
        } catch (Exception e) {
            return "Failed to delete";
        }
    }
    }



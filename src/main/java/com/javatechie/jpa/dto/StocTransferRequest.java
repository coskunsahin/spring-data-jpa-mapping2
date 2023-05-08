package com.javatechie.jpa.dto;
import com.javatechie.jpa.entity.Customer;
import com.javatechie.jpa.entity.Warehouse;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class StocTransferRequest {

    private Warehouse warehouse;

}

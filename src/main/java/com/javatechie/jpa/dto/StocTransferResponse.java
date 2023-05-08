package com.javatechie.jpa.dto;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
public class StocTransferResponse {

    private String WarehouseName;
    private String productName;

    public StocTransferResponse(String WarehouseName, String productName) {
        this.WarehouseName = WarehouseName;
        this.productName = productName;
    }

    private int price;
}

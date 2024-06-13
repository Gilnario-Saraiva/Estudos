package com.devsuperior.desafio01.entities;

import lombok.Data;

@Data
public class Order {

    private Integer code;
    private Double basic;
    private Double discount;

    public Order(Integer code, Double basic, Double discount) {
        this.code = code;
        this.basic = basic;
        this.discount = discount;
    }

}

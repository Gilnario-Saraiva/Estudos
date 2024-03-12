package com.abutua.productbackend.resources;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.abutua.productbackend.models.Product;

import java.time.LocalDateTime;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
public class ProductController {

    private List<Product> products = Arrays.asList(new Product(1, "Televisão", 5999.99),
                                                   new Product(2, "Celular", 2999.99),
                                                   new Product(3, "Tablet", 4999.99));

    @GetMapping("products/{id}")
    public ResponseEntity<Product> getProduct(@PathVariable int id) {

        Product product = products.stream()
                                    .filter(prod -> prod.getId() == id)
                                    .findFirst()
                                    .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Product not found"));

        return ResponseEntity.ok(product);

    }

    @GetMapping("products")
    public List<Product> getProducts() {

        return products;
    }

    @Scheduled(cron = "0 38 13 6 * ?")
    public void Agendamento() {
        System.out.println("Agendado e executado em " + LocalDateTime.now());
    }

}

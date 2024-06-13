package com.devsuperior.desafio01.services;

import com.devsuperior.desafio01.entities.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.DecimalFormat;

@Service
public class OrderService {
    @Autowired
    private ShippingService shippingService;

    private double total(Order order){
        return order.getBasic() - (order.getBasic() * (order.getDiscount()/100)) + shippingService.shipment(order);
    }

    public String imprimePedido(Order order){
         double valorTotal = total(order);
         DecimalFormat df = new DecimalFormat("#.00");
         return "Pedido código " + order.getCode() +
                 "\nValor tota: R$ " + df.format(valorTotal);
    }
}

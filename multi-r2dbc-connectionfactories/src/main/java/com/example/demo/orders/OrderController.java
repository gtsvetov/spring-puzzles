package com.example.demo.orders;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

import static org.springframework.http.ResponseEntity.ok;


@RestController
@RequestMapping("orders")
@RequiredArgsConstructor
public class OrderController {

    private final OrderRepository orders;

    @GetMapping("")
    public ResponseEntity<Flux<Order>> all() {
        return ok().body(this.orders.findAll());
    }

}

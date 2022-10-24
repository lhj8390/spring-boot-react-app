package com.lhj8390.dashboard.model;

import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @JoinColumn
    @ManyToOne
    private Product product;

    @Enumerated(EnumType.STRING)
    private OrderType state;

    private Integer amount;

    private Integer price;

    @CreationTimestamp
    private Date orderDt;

    public void update(String state, Integer amount, Integer price) {
        this.state = OrderType.valueOf(state);
        this.amount = amount;
        this.price = price;
    }
}

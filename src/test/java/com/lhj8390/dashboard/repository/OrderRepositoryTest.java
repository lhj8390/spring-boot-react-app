package com.lhj8390.dashboard.repository;

import com.lhj8390.dashboard.model.entity.Order;
import com.lhj8390.dashboard.model.OrderType;
import com.lhj8390.dashboard.model.entity.Product;
import com.lhj8390.dashboard.model.ProductCategory;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.Date;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
public class OrderRepositoryTest {

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private ProductRepository productRepository;
    private Order order = null;
    private Product product = null;

    @BeforeEach
    public void setup() {
        product = Product.builder()
                .id(1L)
                .name("test")
                .thumnail("pic")
                .amount(1)
                .price(1000)
                .category(ProductCategory.ELECTRONIC)
                .build();
         order = Order.builder()
                .product(product)
                .orderDt(new Date())
                .amount(1)
                .price(1000)
                .state(OrderType.COMPLETED)
                .build();
    }

    @Test
    public void create_order() {

        final Order result = orderRepository.save(order);

        assertThat(result.getId()).isNotNull();
        assertThat(result.getProduct().getName()).isEqualTo("test");
        assertThat(result.getOrderDt()).isCloseTo(new Date(), 10000);
        assertThat(result.getAmount()).isEqualTo(1);
        assertThat(result.getPrice()).isEqualTo(1000);
        assertThat(result.getState().getValue()).isEqualTo("주문완료");
    }

    @Test
    public void find_order_by_Id() {
        productRepository.save(product);
        orderRepository.save(order);
        Order result = orderRepository.findById(order.getId()).orElse(null);

        assertThat(result).isNotNull();
        assertThat(result.getProduct().getName()).isEqualTo("test");
        assertThat(result.getOrderDt()).isCloseTo(new Date(), 10000);
        assertThat(result.getAmount()).isEqualTo(1);
        assertThat(result.getPrice()).isEqualTo(1000);
        assertThat(result.getState().getValue()).isEqualTo("주문완료");
    }
}

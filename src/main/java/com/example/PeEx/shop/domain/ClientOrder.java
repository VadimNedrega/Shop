package com.example.PeEx.shop.domain;

import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "clientOrder")
public class ClientOrder extends AbstractEntity {
    @CreationTimestamp
    private LocalDateTime created;
    @UpdateTimestamp
    private LocalDateTime updated;
    private String orderDetails;
    private String deliveryDetails;

    @ManyToOne
    private Client client;

    @Enumerated(EnumType.STRING)
    private OrderStatus status;

    @OneToMany
    private List<Product> productList;
}


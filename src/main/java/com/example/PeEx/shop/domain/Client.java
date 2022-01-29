package com.example.PeEx.shop.domain;

import lombok.*;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "client")
public class Client extends AbstractEntity {
    private String firstName;
    private String lastName;
    private String phone;
    private String email;
}

package com.dutta.lazyEx.entity;

import lombok.*;

import javax.persistence.*;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
@Table(name = "ITEM")
@Entity
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @NonNull
    private int id;
    private String name;
    private double price;

    @NonNull
    @ManyToOne(optional = false)
    @JoinColumn(name = "cusId",nullable = false)
    private Customer customer;

}

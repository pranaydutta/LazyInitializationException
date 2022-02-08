package com.dutta.lazyEx.entity;

import lombok.*;

import javax.persistence.*;
import java.util.Set;


@ToString
@Setter
@Getter
@AllArgsConstructor
@RequiredArgsConstructor
@NoArgsConstructor
@Table(name = "CUSTOMER")
@Entity
@NamedEntityGraph(name = "Customer.items",attributeNodes = @NamedAttributeNode("items"))
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @NonNull
    private int cusId;
    @NonNull
    private String name;
    @NonNull
    private long mobile;
    private int age;

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "customer")
    private Set<Item> items;

}

package com.dutta.lazyEx.repo;

import com.dutta.lazyEx.entity.Customer;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface CustomerRepository extends JpaRepository<Customer,Integer> {

//JPQL Query instaed of FinsAll jpa method
    //@Query("select distinct c from Customer c left join fetch c.items")
    //List<Customer> findAllCustomers();

    /*
        Entity Graph approach
     */
    @EntityGraph(value = "Customer.items")
    List<Customer> findByName(String name);
}

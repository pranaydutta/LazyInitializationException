package com.dutta.lazyEx.service;

import com.dutta.lazyEx.entity.Customer;
import com.dutta.lazyEx.entity.Item;
import com.dutta.lazyEx.repo.CustomerRepository;
import com.dutta.lazyEx.repo.ItemRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class CommonService {

    private CustomerRepository customerRepository;

    private ItemRepository itemRepository;

    //Constructor Injection
    public CommonService(CustomerRepository customerRepository, ItemRepository itemRepository) {
        this.customerRepository = customerRepository;
        this.itemRepository = itemRepository;
    }

    public void save()
    {
        Customer customer=new Customer(1,"Pranay",9888665L);
        customerRepository.save(customer);

        itemRepository.save(new Item(101,customer));
        itemRepository.save(new Item(102,customer));
    }

    public void find()
    {
        for (Customer c:customerRepository.findByName("dutta")) {
            log.info(c.toString());
        }
    }
}

package com.lambdaschool.ordersapp.repositories;

import com.lambdaschool.ordersapp.models.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Long> {
}

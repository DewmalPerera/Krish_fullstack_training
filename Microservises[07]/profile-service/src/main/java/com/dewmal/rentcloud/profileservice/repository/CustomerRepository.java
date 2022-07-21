package com.dewmal.rentcloud.profileservice.repository;

import com.dewmal.rentcloud.commons.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}

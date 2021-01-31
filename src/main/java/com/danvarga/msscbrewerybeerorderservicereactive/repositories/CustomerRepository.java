package com.danvarga.msscbrewerybeerorderservicereactive.repositories;

import com.danvarga.msscbrewerybeerorderservicereactive.domain.Customer;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import java.util.UUID;

public interface CustomerRepository extends ReactiveMongoRepository<Customer, UUID> {
}

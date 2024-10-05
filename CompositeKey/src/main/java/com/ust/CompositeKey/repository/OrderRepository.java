package com.ust.CompositeKey.repository;


import com.ust.CompositeKey.model.CustOrder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<CustOrder, Long> {}


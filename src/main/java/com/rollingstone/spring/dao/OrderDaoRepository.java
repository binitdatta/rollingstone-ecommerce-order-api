package com.rollingstone.spring.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.rollingstone.spring.model.Order;

public interface OrderDaoRepository extends PagingAndSortingRepository<Order, Long> {

	Page<Order> findAll(Pageable pageable);
}

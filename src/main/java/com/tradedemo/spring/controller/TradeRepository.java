package com.tradedemo.spring.controller;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface TradeRepository extends CrudRepository<Trade, Long> {
	
	@Query(value = "SELECT t FROM Trade t WHERE t.tradeId LIKE '%' || :keyword || '%'"
			+ " OR t.counterPartyId LIKE '%' || :keyword || '%'"
			+ " OR c.bookId LIKE '%' || :keyword || '%'")
	public List<Trade> search(@Param("keyword") String keyword);
}

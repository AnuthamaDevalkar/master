package com.tradedemo.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tradedemo.spring.model.Trade;

@Service
@Transactional
public class TradeService {
	@Autowired TradeRepository repo;
	
	public void save(Trade trade) {
		repo.save(trade);
	}
	
}

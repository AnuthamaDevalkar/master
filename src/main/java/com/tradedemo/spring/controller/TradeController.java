package com.tradedemo.spring.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.validation.BindingResult;

import com.tradedemo.spring.model.Trade;

@Controller
public class TradeController {

	@Autowired
	private TradeService tradeService;	
	
	@InitBinder
    public void initBinder(WebDataBinder binder) {
        SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy");
        sdf.setLenient(true);
        binder.registerCustomEditor(Date.class, new CustomDateEditor(sdf, true));
    }
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveTrade(@Valid @ModelAttribute("trade") Trade trade, BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {
			return "tradestore";
		}
		tradeService.save(trade);
		return "redirect:/result";
	}
	
}

package com.src.main.currencyexchangeserver;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyExchangeResource {

    @GetMapping("/currency-exchange/from/{from}/to/{to}")
    public CurrencyExchange currencyExchange(@PathVariable String from, @PathVariable String to) {
        return new CurrencyExchange(from,to,10,String.valueOf(10000));
    }
}

package com.src.main.currencyexchangeserver;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyExchangeResource {

    @GetMapping("/currency-exchange")
    public String currencyExchange() {
        return "Currency Exchange Server";
    }
}

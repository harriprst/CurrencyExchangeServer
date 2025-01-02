package com.src.main.currencyexchangeserver;

public class CurrencyExchange {

    String from;
    String to;
    double amount;
    String portNo;

    public CurrencyExchange() {
    }

    public CurrencyExchange(String from, String to, double amount, String portNo) {
        this.from = from;
        this.to = to;
        this.amount = amount;
        this.portNo = portNo;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getPortNo() {
        return portNo;
    }

    public void setPortNo(String portNo) {
        this.portNo = portNo;
    }
}


package org.araujo;

public class Equity {
    private String ticker;
    private String exchange;

    public Equity(String ticker, String exchange) {
        this.ticker = ticker;
        this.exchange = exchange;
    }

    public String getTicker() {
        return ticker;
    }

    public String getExchange() {
        return exchange;
    }
}

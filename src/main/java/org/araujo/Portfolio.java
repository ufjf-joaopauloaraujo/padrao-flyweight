package org.araujo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Portfolio {

    private List<Trade> trades = new ArrayList<>();

    public void addTrade(String ticker, String exchange, BigDecimal value, BigDecimal amount) {
        Equity equity = EquityFactory.getEquity(ticker, exchange);
        Trade trade = new Trade(equity, value, amount);
        trades.add(trade);
    }

    public List<String> getTrades() {
        List<String> list = new ArrayList<>();
        for (Trade trade : this.trades) {
            list.add(trade.getTrade());
        }
        return list;
    }
}

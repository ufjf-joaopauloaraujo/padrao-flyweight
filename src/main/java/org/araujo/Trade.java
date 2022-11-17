package org.araujo;

import java.math.BigDecimal;

public class Trade {
    private Equity equity;
    private BigDecimal value;
    private BigDecimal amount;

    public Trade(Equity equity, BigDecimal value, BigDecimal amount) {
        this.equity = equity;
        this.value = value;
        this.amount = amount;
    }

    public String getTrade() {
        return "Trade{" +
                "ticker='" + equity.getTicker() + '\'' +
                ", exchange='" + equity.getExchange() + '\'' +
                ", value='" + this.value + '\'' +
                ", amount='" + this.amount + '\'' +
                '}';
    }
}

package org.araujo;

import java.util.HashMap;
import java.util.Map;

public class EquityFactory {
    private static Map<String, Equity> equities = new HashMap<>();

    public static Equity getEquity(String ticker, String exchange) {
        Equity equity = equities.get(ticker);
        if (equity == null) {
            equity = new Equity(ticker, exchange);
            equities.put(ticker, equity);
        }
        return equity;
    }

    public static int getEquitiesAmount() {
        return equities.size();
    }
}

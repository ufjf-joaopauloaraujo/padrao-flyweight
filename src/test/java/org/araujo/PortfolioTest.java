package org.araujo;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PortfolioTest {
    @Test
    void mustReturnTrades() {
        Portfolio portfolio = new Portfolio();

        portfolio.addTrade(
            "MSFT", "NASDAQ", new BigDecimal("24000.00"), new BigDecimal("100"));
        portfolio.addTrade(
            "AAPL", "NASDAQ", new BigDecimal("30000.00"), new BigDecimal("200"));
        portfolio.addTrade(
            "BTC", "Binance", new BigDecimal("1000.0"), new BigDecimal("0.06"));
        portfolio.addTrade(
            "BRK.B", "NYSE", new BigDecimal("30700.00"), new BigDecimal("100"));

        List<String> output = Arrays.asList(
                "Trade{ticker='MSFT', exchange='NASDAQ', value='24000.00', amount='100'}",
                "Trade{ticker='AAPL', exchange='NASDAQ', value='30000.00', amount='200'}",
                "Trade{ticker='BTC', exchange='Binance', value='1000.0', amount='0.06'}",
                "Trade{ticker='BRK.B', exchange='NYSE', value='30700.00', amount='100'}"
        );

        assertEquals(output, portfolio.getTrades());
    }

   @Test
    void mustReturnEquitiesAmount() {
       Portfolio portfolio = new Portfolio();
       portfolio.addTrade(
               "MSFT", "NASDAQ", new BigDecimal("24000.00"), new BigDecimal("100"));
       portfolio.addTrade(
               "AAPL", "NASDAQ", new BigDecimal("30000.00"), new BigDecimal("200"));
       portfolio.addTrade(
               "MSFT", "NASDAQ", new BigDecimal("36000.00"), new BigDecimal("150"));
       portfolio.addTrade(
               "AAPL", "NASDAQ", new BigDecimal("15000.00"), new BigDecimal("-100"));

        assertEquals(2, EquityFactory.getEquitiesAmount());
    }
}
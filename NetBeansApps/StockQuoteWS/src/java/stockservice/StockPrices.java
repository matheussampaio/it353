/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stockservice;

import java.util.HashMap;

/**
 *
 * @author matheussampaio
 */
public class StockPrices {
    
    private static StockPrices instance;
    
    HashMap<String, Double> stockPrices;
    
    private StockPrices() {
        stockPrices = new HashMap<>();
        
        initPrices();
    }
    
    private void initPrices() {
        stockPrices.put("MMM", 166.63);
        stockPrices.put("AXP", 59.50);
        stockPrices.put("AAPL", 108.66);
        stockPrices.put("BA", 127.88);
        stockPrices.put("CAT", 74.35);
        stockPrices.put("CVX", 96.33);
        stockPrices.put("CSCO", 27.69);
        stockPrices.put("KO", 46.87);
        stockPrices.put("DIS", 96.42);
        stockPrices.put("DD", 63.20);
        stockPrices.put("XOM", 83.21);
        stockPrices.put("GE", 30.79);
        stockPrices.put("GS", 150.28);
        stockPrices.put("HD", 133.62);
        stockPrices.put("IBM", 149.35);
        stockPrices.put("INTC", 31.63);
        stockPrices.put("JNJ", 109.10);
        stockPrices.put("JPM", 57.74);
        stockPrices.put("MCD", 127.96);
        stockPrices.put("MRK", 55.36);
        stockPrices.put("MSFT", 54.42);
        stockPrices.put("NKE", 59.42);
        stockPrices.put("PFE", 32.50);
        stockPrices.put("PG", 83.20);
        stockPrices.put("TRV", 115.23);
        stockPrices.put("UTX", 101.32);
        stockPrices.put("UNH", 125.68);
        stockPrices.put("VZ", 52.18);
        stockPrices.put("V", 78.03);
        stockPrices.put("WMT", 68.06);
    }
    
    public static StockPrices getInstance() {
        if (instance == null) {
            instance = new StockPrices();
        }
        
        return instance;
    }
    
    public double getPrice(String symbol) {
        Double price = stockPrices.get(symbol);
        
        return price != null ? price : -1;
    }
}

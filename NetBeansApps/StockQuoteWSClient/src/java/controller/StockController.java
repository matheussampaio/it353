/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.time.Instant;
import java.util.Date;
import model.PriceBean;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.xml.ws.WebServiceRef;
import stockservice.StockWS_Service;

/**
 *
 * @author matheussampaio
 */
@ManagedBean
@RequestScoped
public class StockController {
    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/StockQuoteWS/StockWS.wsdl")
    private StockWS_Service service;
    
    private PriceBean priceModel;
    /**
     * Creates a new instance of StockController
     */
    public StockController() {
        priceModel = new PriceBean();
    }
    
    
    public void fetchPrice() {
        String symbol = getPriceModel().getSymbol();
        
        if (symbol.length() > 0) {
            stockservice.StockWS port = service.getStockWSPort();
            
            Double price = port.price(symbol);

            if (price != -1) {
                
                getPriceModel().setDatetime(Date.from(Instant.now()));
                getPriceModel().setPrice(price);
            
            }
        }
    }

    /**
     * @return the priceModel
     */
    public PriceBean getPriceModel() {
        return priceModel;
    }

    /**
     * @param priceModel the priceModel to set
     */
    public void setPriceModel(PriceBean priceModel) {
        this.priceModel = priceModel;
    }

}

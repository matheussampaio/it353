/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stockservice;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author matheussampaio
 */
@WebService(serviceName = "StockWS")
public class StockWS {
    
    
    /**
     * This is a sample web service operation
     * @return price
     */
    @WebMethod(operationName = "price")
    public Double price(@WebParam(name = "symbol") String symbol) {
        return StockPrices.getInstance().getPrice(symbol);
    }
}

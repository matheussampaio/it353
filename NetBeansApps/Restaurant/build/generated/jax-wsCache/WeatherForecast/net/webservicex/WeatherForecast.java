
package net.webservicex;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * Get one week weather forecast for valid zip code or Place name in USA
 * 
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2-hudson-752-
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "WeatherForecast", targetNamespace = "http://www.webservicex.net", wsdlLocation = "http://www.webservicex.net/WeatherForecast.asmx?wsdl")
public class WeatherForecast
    extends Service
{

    private final static URL WEATHERFORECAST_WSDL_LOCATION;
    private final static WebServiceException WEATHERFORECAST_EXCEPTION;
    private final static QName WEATHERFORECAST_QNAME = new QName("http://www.webservicex.net", "WeatherForecast");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://www.webservicex.net/WeatherForecast.asmx?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        WEATHERFORECAST_WSDL_LOCATION = url;
        WEATHERFORECAST_EXCEPTION = e;
    }

    public WeatherForecast() {
        super(__getWsdlLocation(), WEATHERFORECAST_QNAME);
    }

    public WeatherForecast(WebServiceFeature... features) {
        super(__getWsdlLocation(), WEATHERFORECAST_QNAME, features);
    }

    public WeatherForecast(URL wsdlLocation) {
        super(wsdlLocation, WEATHERFORECAST_QNAME);
    }

    public WeatherForecast(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, WEATHERFORECAST_QNAME, features);
    }

    public WeatherForecast(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public WeatherForecast(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns WeatherForecastSoap
     */
    @WebEndpoint(name = "WeatherForecastSoap")
    public WeatherForecastSoap getWeatherForecastSoap() {
        return super.getPort(new QName("http://www.webservicex.net", "WeatherForecastSoap"), WeatherForecastSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns WeatherForecastSoap
     */
    @WebEndpoint(name = "WeatherForecastSoap")
    public WeatherForecastSoap getWeatherForecastSoap(WebServiceFeature... features) {
        return super.getPort(new QName("http://www.webservicex.net", "WeatherForecastSoap"), WeatherForecastSoap.class, features);
    }

    /**
     * 
     * @return
     *     returns WeatherForecastSoap
     */
    @WebEndpoint(name = "WeatherForecastSoap12")
    public WeatherForecastSoap getWeatherForecastSoap12() {
        return super.getPort(new QName("http://www.webservicex.net", "WeatherForecastSoap12"), WeatherForecastSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns WeatherForecastSoap
     */
    @WebEndpoint(name = "WeatherForecastSoap12")
    public WeatherForecastSoap getWeatherForecastSoap12(WebServiceFeature... features) {
        return super.getPort(new QName("http://www.webservicex.net", "WeatherForecastSoap12"), WeatherForecastSoap.class, features);
    }

    /**
     * 
     * @return
     *     returns WeatherForecastHttpGet
     */
    @WebEndpoint(name = "WeatherForecastHttpGet")
    public WeatherForecastHttpGet getWeatherForecastHttpGet() {
        return super.getPort(new QName("http://www.webservicex.net", "WeatherForecastHttpGet"), WeatherForecastHttpGet.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns WeatherForecastHttpGet
     */
    @WebEndpoint(name = "WeatherForecastHttpGet")
    public WeatherForecastHttpGet getWeatherForecastHttpGet(WebServiceFeature... features) {
        return super.getPort(new QName("http://www.webservicex.net", "WeatherForecastHttpGet"), WeatherForecastHttpGet.class, features);
    }

    /**
     * 
     * @return
     *     returns WeatherForecastHttpPost
     */
    @WebEndpoint(name = "WeatherForecastHttpPost")
    public WeatherForecastHttpPost getWeatherForecastHttpPost() {
        return super.getPort(new QName("http://www.webservicex.net", "WeatherForecastHttpPost"), WeatherForecastHttpPost.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns WeatherForecastHttpPost
     */
    @WebEndpoint(name = "WeatherForecastHttpPost")
    public WeatherForecastHttpPost getWeatherForecastHttpPost(WebServiceFeature... features) {
        return super.getPort(new QName("http://www.webservicex.net", "WeatherForecastHttpPost"), WeatherForecastHttpPost.class, features);
    }

    private static URL __getWsdlLocation() {
        if (WEATHERFORECAST_EXCEPTION!= null) {
            throw WEATHERFORECAST_EXCEPTION;
        }
        return WEATHERFORECAST_WSDL_LOCATION;
    }

}

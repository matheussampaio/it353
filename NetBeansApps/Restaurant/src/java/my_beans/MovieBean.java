/*
 * MovieBean.java
 * Handles Movie web service operations
 */

/*
 * Clint Riley and Chris Olson
 */
package my_beans;

import com.ignyte.whatsshowing.MovieInformation;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.xml.ws.WebServiceRef;
import net.webservicex.WeatherForecast;

/**
 *
 * @author Chris
 */
@ManagedBean(name = "MovieBean")
@SessionScoped
public class MovieBean {
    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/www.webservicex.net/WeatherForecast.asmx.wsdl")
    private WeatherForecast service_1;

    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/www.ignyte.com/webservices/ignyte.whatsshowing.webservice/moviefunctions.asmx.wsdl")
    private MovieInformation service;
    String zipCode = "61761";
    String response = null;
    int radius = 10;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public String getResponse() {
        response = "";
        response +=getTheaters();
        response +="Call in for showtimes! (309)555-1337<br/><br/>"+getWeather();

        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    //get the theaters and listings for the zipcode and radius
    private String getTheaters() {
        String theaterOut = "";

        try { // Call Web Service Operation
            com.ignyte.whatsshowing.MovieInformationSoap port = service.getMovieInformationSoap();

            com.ignyte.whatsshowing.ArrayOfTheater result = port.getTheatersAndMovies(zipCode, radius);
            List<com.ignyte.whatsshowing.Theater> theaters = result.getTheater();

            int size = theaters.size();
            int i = (size>=3)?2:0;
                com.ignyte.whatsshowing.Theater t = theaters.get(i);
                List<com.ignyte.whatsshowing.Movie> movies = (t.getMovies()).getMovie();
                int numMov = movies.size();
                for (int j = 0; j < numMov; j++) {
                    com.ignyte.whatsshowing.Movie m = movies.get(j);
                    theaterOut+="<strong>"+m.getName() + "</strong>:<br/> " + (m.getShowTimes()==null ?"":m.getShowTimes() +"<br/>\n")+"<br/>";
                }
               theaterOut+="<br/>";
            
        } catch (Exception ex) {
            // TODO handle custom exceptions here
        }
        
        return theaterOut;

    }

    private String getWeather() {
        String weather = "<strong>Weather for Bloomington/Normal:</strong><hr>";

        try { // Call Web Service Operation
            net.webservicex.WeatherForecastSoap port = service_1.getWeatherForecastSoap();
            // TODO initialize WS operation arguments here

            // TODO process result here
            net.webservicex.WeatherForecasts result = port.getWeatherByZipCode(zipCode);
            net.webservicex.ArrayOfWeatherData data = result.getDetails();
            List<net.webservicex.WeatherData> dataList = data.getWeatherData();
            int size = dataList.size();
            for (int i = 0; i <1; i++) {
                net.webservicex.WeatherData wd = dataList.get(i);
                weather += "Max: "+wd.getMaxTemperatureF()+"&deg;F&nbsp;&nbsp;&nbsp;Min: "+wd.getMinTemperatureF()+"&deg;F<br>";
                weather += "Max: "+wd.getMaxTemperatureC()+"&deg;C&nbsp;&nbsp;&nbsp;Min: "+wd.getMinTemperatureC()+"&deg;C<br>";
            }

        } catch (Exception ex) {
            // TODO handle custom exceptions here
        }
        
        return weather;
    }

    public String persist() {

        return "response.xhtml";
    }
}

/*
 * ReviewBean.java
 * Clint Riley Chris Olson
 *
 * Handles leaving feedback for restaurants
 */
package my_beans;

import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.xml.ws.WebServiceRef;
import com.cdyne.ws.profanityws.profanity.Profanity;
import com.cdyne.ws.profanityws.profanity.ProfanitySoap;
import com.cdyne.ws.profanityws.profanity.FilterReturn;
/**
 *
 * @author Chris
 */
@ManagedBean(name = "ReviewBean")
@SessionScoped
public class ReviewBean {

    private String listReviews = "";
    private String chicagoReviews = "";
    private String champaignReviews = "";
    private String peoriaReviews = "";
    private String normalReviews = "";
    private String stlouisReviews = "";
    private String author = "";
    private String text = "";
    private String rating = "";
    private String store = "";

    public String getListReviews() {
        return ReviewBeanDA.getAllReviews();
    }

    public void setListReviews(String listReviews) {
        this.listReviews = listReviews;
    }

    public String getListReviews(String storeName) {
        return ReviewBeanDA.getReviewsByLocation(storeName);
    }

    public String getChicagoReviews() {
        return getListReviews("chicago");
    }

    public void setChicagoReviews(String chicagoReviews) {
        this.chicagoReviews = chicagoReviews;
    }

    public String getChampaignReviews() {
        return getListReviews("champaign");
    }

    public void setChampaignReviews(String champaignReviews) {
        this.champaignReviews = champaignReviews;
    }

    public String getNormalReviews() {
        return getListReviews("normal");
    }

    public void setNormalReviews(String normalReviews) {
        this.normalReviews = normalReviews;
    }

    public String getPeoriaReviews() {
        return getListReviews("peoria");
    }

    public void setPeoriaReviews(String peoriaReviews) {
        this.peoriaReviews = peoriaReviews;
    }

    public String getStlouisReviews() {
        return getListReviews("stlouis");
    }

    public void setStlouisReviews(String stlouisReviews) {
        this.stlouisReviews = stlouisReviews;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getStore() {
        return store;
    }

    public void setStore(String store) {
        this.store = store;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String submitReview() {
        author = (author.equals("") ? "Anonymous" : author);
        ReviewBeanDA.submitReview(author, store, cleanText(), Integer.parseInt(rating));
        author = "";
        store = "";
        text = "";
        rating = "";
        return "review";
    }

    public String cleanText() {
       
        try { // Call Web Service Operation

            com.cdyne.ws.profanityws.profanity.Profanity service = new com.cdyne.ws.profanityws.profanity.Profanity();

            com.cdyne.ws.profanityws.profanity.ProfanitySoap port = service.getProfanitySoap();


            com.cdyne.ws.profanityws.profanity.FilterReturn result = port.simpleProfanityFilter(text);

            return result.getCleanText();

        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
        return text;
    }
}

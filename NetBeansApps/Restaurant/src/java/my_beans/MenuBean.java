/*
 * MenuBean.java
 *
 * Clint Riley Chris Olson
 * Menu access.
 */
package my_beans;

import java.text.NumberFormat;
import java.util.Vector;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author Clint
 */
@ManagedBean(name="MenuBean")
@SessionScoped
public class MenuBean {
    private Vector<MenuItem> subMenuListing = new Vector<MenuItem>();
    private String displaySection = "";
    private String fdback;
    private String feedbackname;
    private String feedbackrating;
    private String customerRatingString;
    private String ratingCount;
    private Vector<MenuItem> menuListing;
    private int detailItem;

    private MenuItem currentMenuItem;

    /** Creates a new instance of MenuBean */
    public MenuBean() {
        displaySection = "";
    }

    public Vector<String> comments(int id) {
        return MenuDA.getFeedback(id);
    }

    public String details(int id) {
        setDetailItem(id);
        CartBean cb = (CartBean)FacesContext.getCurrentInstance()
			.getExternalContext().getSessionMap().get("CartBean");

        cb.setToAdd(new Integer(id).toString());
        setCurrentMenuItem(MenuDA.getMenuData(id));
        return "fooddetails.xhtml";
    }

    public String leaveFeedback() {
        MenuDA.feedback(currentMenuItem.getId(), feedbackrating, feedbackname, cleanText());
        
        return "fooddetails";
    }

     public String cleanText() {

        try { // Call Web Service Operation

            com.cdyne.ws.profanityws.profanity.Profanity service = new com.cdyne.ws.profanityws.profanity.Profanity();

            com.cdyne.ws.profanityws.profanity.ProfanitySoap port = service.getProfanitySoap();


            com.cdyne.ws.profanityws.profanity.FilterReturn result = port.simpleProfanityFilter(fdback);

            return result.getCleanText();

        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
        return fdback;
    }

    public String filterNone() {
        displaySection = "";

        return "#";
    }

    public String filterSalad() {
        displaySection = "salad";
        return "#";
    }

    public String filterAppetizer() {
        displaySection = "appetizer";
        return "#";
    }

    public String filterEntree() {
        displaySection = "entree";
        this.setMenuListing(getMenuListing());
        return "#";
    }

    /**
     * @return the menuListing
     */
    public Vector<MenuItem> getMenuListing() {
        Vector<MenuItem> m = MenuDA.subMenuList(displaySection);
        return m;
    }

    /**
     * @param menuListing the menuListing to set
     */
    public void setMenuListing(Vector<MenuItem> menuListing) {
        this.menuListing = menuListing;
    }

    /**
     * @return the detailItem
     */
    public int getDetailItem() {
        return detailItem;
    }

    /**
     * @param detailItem the detailItem to set
     */
    public void setDetailItem(int detailItem) {
        this.detailItem = detailItem;
    }

    /**
     * @return the currentMenuItem
     */
    public MenuItem getCurrentMenuItem() {
        return currentMenuItem;
    }

    /**
     * @param currentMenuItem the currentMenuItem to set
     */
    public void setCurrentMenuItem(MenuItem currentMenuItem) {
        this.currentMenuItem = currentMenuItem;
    }

    /**
     * @return the feedback
     */
    public String getFdback() {
        return fdback;
    }

    /**
     * @param feedback the feedback to set
     */
    public void setFdback(String feedback) {
        this.fdback = feedback;
    }

    /**
     * @return the feedbackname
     */
    public String getFeedbackname() {
        return feedbackname;
    }

    /**
     * @param feedbackname the feedbackname to set
     */
    public void setFeedbackname(String feedbackname) {
        this.feedbackname = feedbackname;
    }

    /**
     * @return the feedbackrating
     */
    public String getFeedbackrating() {
        return feedbackrating;
    }

    /**
     * @param feedbackrating the feedbackrating to set
     */
    public void setFeedbackrating(String feedbackrating) {
        this.feedbackrating = feedbackrating;
    }

    /**
     * @return the customerRatingString
     */
    public String getCustomerRatingString() {
        double d = MenuDA.getAverage(this.currentMenuItem.getId());
        NumberFormat nf = NumberFormat.getInstance();
        nf.setMaximumFractionDigits(2);
        return nf.format(d);
    }

    /**
     * @param customerRatingString the customerRatingString to set
     */
    public void setCustomerRatingString(String customerRatingString) {
        this.customerRatingString = customerRatingString;
    }

    /**
     * @return the displaySection
     */
    public String getDisplaySection() {
        return displaySection;
    }

    /**
     * @param displaySection the displaySection to set
     */
    public void setDisplaySection(String displaySection) {

        this.displaySection = displaySection;
    }

    /**
     * @return the subMenuListing
     */
    public Vector<MenuItem> getSubMenuListing() {
        Vector<MenuItem> rVal = null;
        switch(Integer.parseInt(this.displaySection)) {
            case 1:
                //appetizers
                rVal = MenuDA.subMenuList("appetizer");
                break;
            case 2:
                //entrees
                rVal = MenuDA.subMenuList("entree");
                break;
            case 3:
                //salads
                rVal = MenuDA.subMenuList("salad");
                break;
            default:
                rVal = MenuDA.subMenuList("*");
        }
        return rVal;
    }

    public String entView() {
        this.displaySection = "1";
        return "menu.xhtml";
    }

    /**
     * @param subMenuListing the subMenuListing to set
     */
    public void setSubMenuListing(Vector<MenuItem> subMenuListing) {
        this.subMenuListing = subMenuListing;
    }

    /**
     * @return the ratingCount
     */
    public String getRatingCount() {
        int ct = MenuDA.getCount(this.currentMenuItem.getId());
        ratingCount = new Integer(ct).toString();
        return ratingCount;
    }

    /**
     * @param ratingCount the ratingCount to set
     */
    public void setRatingCount(String ratingCount) {
        this.ratingCount = ratingCount;
    }

}

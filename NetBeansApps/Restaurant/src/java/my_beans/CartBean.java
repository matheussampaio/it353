/*
 * CartBean.java
 * Clint Riley Chris Olson
 *
 * Handles cart operations
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
@ManagedBean(name="CartBean")
@SessionScoped
public class CartBean {
    private String addNewItem;
    private Vector<MenuItem> itemsInCart;
    private String toAdd;
    private int item_id;
    private String quantity ="0";
    private String addItem;
    private String currentTotal;
    private double tot;
    private String showItems;


    public String requestCheckout() {

        LoginBean lb = (LoginBean)FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("LoginBean");
        if(lb.isLogin().equals("true")) {
            return "checkout";
        }
        return "signup";
    }
    /** Creates a new instance of CartBean */
    public CartBean() {
        itemsInCart = new Vector<MenuItem>();
    }

    public void removeItem(int id) {
        for(int i = 0; i < itemsInCart.size(); i++) {
            if(itemsInCart.elementAt(i).getId() == id) {
                itemsInCart.removeElementAt(i);
                calculateTotal();
                return;
            }
        }
        return;
    }

    private void calculateTotal() {
        double tmp = 0;
        for(MenuItem m : itemsInCart) {
            tmp += m.getPrice();
        }
        tot = tmp;
    }

    public String addCurrentItem() {
        addItem(Integer.parseInt(toAdd));
        return "cart";
    }
    public void setAddNewItem(String s) {
        this.addNewItem = s;
    }
    public String addNewItem() {
        String s = FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap().get("something");
        MenuItem m = MenuDA.getMenuData(Integer.parseInt(s));
        
        getItemsInCart().add(m);
        
        calculateTotal();
        return "cart";
    }

    public String addItem(int item_id) {
        String s = FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap().get("something");
        
        //int itoadd = Integer.parseInt(itemsToAdd);
        MenuItem m = MenuDA.getMenuData(item_id);
        if(m != null) {
            //for(int i = 0; i < itoadd; i++) {
                getItemsInCart().add(m);
                calculateTotal();
            //}
        }
        return "cart";
    }

    /**
     * @return the item_id
     */
    public int getItem_id() {
        return item_id;
    }

    /**
     * @param item_id the item_id to set
     */
    public void setItem_id(int item_id) {
        this.item_id = item_id;
    }

    /**
     * @return the itemsToAdd
     */
    public String getQuantity() {
        return quantity;
    }

    /**
     * @param itemsToAdd the itemsToAdd to set
     */
    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    /**
     * @return the addItem
     */
    public String getAddItem() {
        MenuItem m = MenuDA.getMenuData(getItem_id());
        if(m != null) {
            for(int i = 0; i < Integer.parseInt(getQuantity()); i++) {
                getItemsInCart().add(m);
            }
        }
        return "cart";
    }

    /**
     * @param addItem the addItem to set
     */
    public void setAddItem(String addItem) {
        this.addItem = addItem;
    }

    /**
     * @return the itemsInCart
     */
    public Vector<MenuItem> getItemsInCart() {
        return itemsInCart;
    }

    /**
     * @param itemsInCart the itemsInCart to set
     */
    public void setItemsInCart(Vector<MenuItem> itemsInCart) {
        this.itemsInCart = itemsInCart;
    }

    /**
     * @return the showItems
     */
    public String getShowItems() {
        String s = "";
        s += "<ul>";
        for(MenuItem m : itemsInCart) {
            s += "<li>" + m.name + "</li>";
        }
        s += "</ul>";
        showItems = s;
        return showItems;
    }

    /**
     * @param showItems the showItems to set
     */
    public void setShowItems(String showItems) {
        this.showItems = showItems;
    }

    /**
     * @return the currentTotal
     */
    public String getCurrentTotal() {
        NumberFormat ci = NumberFormat.getCurrencyInstance();
        currentTotal = ci.format(tot);

        return currentTotal;
    }

    /**
     * @param currentTotal the currentTotal to set
     */
    public void setCurrentTotal(String currentTotal) {
        this.currentTotal = currentTotal;
    }

    /**
     * @return the toAdd
     */
    public String getToAdd() {
        return toAdd;
    }

    /**
     * @param toAdd the toAdd to set
     */
    public void setToAdd(String toAdd) {
        this.toAdd = toAdd;
    }

}

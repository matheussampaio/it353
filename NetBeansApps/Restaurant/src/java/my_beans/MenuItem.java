/*
 * MenuItem.java
 * Clint Riley Chris Olson
 *
 * Represents a single menu item
 */


package my_beans;

import java.text.NumberFormat;

/**
 *
 * @author Clint
 */
public class MenuItem {
    private int id;
    String name;
    private String description;
    private double price;
    private String priceString;
    private String category;
    private String img_path;

    public MenuItem() {}

    public MenuItem(int id, String name, String description, double price, String category, String img_path) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.category = category;
        this.img_path = img_path;
    }

    public String getPriceString() {
        NumberFormat ci = NumberFormat.getCurrencyInstance();
        return ci.format(price);
    }

    public void setName(String s) {
        this.name = s;
    }
    public String getName() {
        return name;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the price
     */
    public double getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * @return the category
     */
    public String getCategory() {
        return category;
    }

    /**
     * @param category the category to set
     */
    public void setCategory(String category) {
        this.category = category;
    }

    /**
     * @return the img_path
     */
    public String getImg_path() {
        return img_path;
    }

    /**
     * @param img_path the img_path to set
     */
    public void setImg_path(String img_path) {
        this.img_path = img_path;
    }
}

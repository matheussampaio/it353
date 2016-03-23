
package com.cdyne.ws.profanityws.profanity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Text" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LevelToClean" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UseNumberFilter" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "text",
    "levelToClean",
    "useNumberFilter"
})
@XmlRootElement(name = "ProfanityFilter")
public class ProfanityFilter {

    @XmlElement(name = "Text")
    protected String text;
    @XmlElement(name = "LevelToClean")
    protected int levelToClean;
    @XmlElement(name = "UseNumberFilter")
    protected boolean useNumberFilter;

    /**
     * Gets the value of the text property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getText() {
        return text;
    }

    /**
     * Sets the value of the text property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setText(String value) {
        this.text = value;
    }

    /**
     * Gets the value of the levelToClean property.
     * 
     */
    public int getLevelToClean() {
        return levelToClean;
    }

    /**
     * Sets the value of the levelToClean property.
     * 
     */
    public void setLevelToClean(int value) {
        this.levelToClean = value;
    }

    /**
     * Gets the value of the useNumberFilter property.
     * 
     */
    public boolean isUseNumberFilter() {
        return useNumberFilter;
    }

    /**
     * Sets the value of the useNumberFilter property.
     * 
     */
    public void setUseNumberFilter(boolean value) {
        this.useNumberFilter = value;
    }

}

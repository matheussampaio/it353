
package com.cdyne.ws.profanityws.profanity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FilterRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FilterRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UseCharacterFilter" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="UsePhonetics" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="LevelToClean" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ReplaceProfanityType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UserDefinedLevelsID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Text" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReplaceProfanityText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LicenseKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FilterRequest", propOrder = {
    "useCharacterFilter",
    "usePhonetics",
    "levelToClean",
    "replaceProfanityType",
    "userDefinedLevelsID",
    "text",
    "replaceProfanityText",
    "licenseKey"
})
public class FilterRequest {

    @XmlElement(name = "UseCharacterFilter")
    protected boolean useCharacterFilter;
    @XmlElement(name = "UsePhonetics")
    protected boolean usePhonetics;
    @XmlElement(name = "LevelToClean")
    protected int levelToClean;
    @XmlElement(name = "ReplaceProfanityType")
    protected int replaceProfanityType;
    @XmlElement(name = "UserDefinedLevelsID")
    protected int userDefinedLevelsID;
    @XmlElement(name = "Text")
    protected String text;
    @XmlElement(name = "ReplaceProfanityText")
    protected String replaceProfanityText;
    @XmlElement(name = "LicenseKey")
    protected String licenseKey;

    /**
     * Gets the value of the useCharacterFilter property.
     * 
     */
    public boolean isUseCharacterFilter() {
        return useCharacterFilter;
    }

    /**
     * Sets the value of the useCharacterFilter property.
     * 
     */
    public void setUseCharacterFilter(boolean value) {
        this.useCharacterFilter = value;
    }

    /**
     * Gets the value of the usePhonetics property.
     * 
     */
    public boolean isUsePhonetics() {
        return usePhonetics;
    }

    /**
     * Sets the value of the usePhonetics property.
     * 
     */
    public void setUsePhonetics(boolean value) {
        this.usePhonetics = value;
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
     * Gets the value of the replaceProfanityType property.
     * 
     */
    public int getReplaceProfanityType() {
        return replaceProfanityType;
    }

    /**
     * Sets the value of the replaceProfanityType property.
     * 
     */
    public void setReplaceProfanityType(int value) {
        this.replaceProfanityType = value;
    }

    /**
     * Gets the value of the userDefinedLevelsID property.
     * 
     */
    public int getUserDefinedLevelsID() {
        return userDefinedLevelsID;
    }

    /**
     * Sets the value of the userDefinedLevelsID property.
     * 
     */
    public void setUserDefinedLevelsID(int value) {
        this.userDefinedLevelsID = value;
    }

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
     * Gets the value of the replaceProfanityText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReplaceProfanityText() {
        return replaceProfanityText;
    }

    /**
     * Sets the value of the replaceProfanityText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReplaceProfanityText(String value) {
        this.replaceProfanityText = value;
    }

    /**
     * Gets the value of the licenseKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLicenseKey() {
        return licenseKey;
    }

    /**
     * Sets the value of the licenseKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLicenseKey(String value) {
        this.licenseKey = value;
    }

}

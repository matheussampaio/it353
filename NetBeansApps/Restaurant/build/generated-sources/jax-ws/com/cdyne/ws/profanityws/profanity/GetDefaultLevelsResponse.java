
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
 *         &lt;element name="GetDefaultLevelsResult" type="{http://ws.cdyne.com/ProfanityWS/Profanity.asmx}ArrayOfProfanityLevel" minOccurs="0"/>
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
    "getDefaultLevelsResult"
})
@XmlRootElement(name = "GetDefaultLevelsResponse")
public class GetDefaultLevelsResponse {

    @XmlElement(name = "GetDefaultLevelsResult")
    protected ArrayOfProfanityLevel getDefaultLevelsResult;

    /**
     * Gets the value of the getDefaultLevelsResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfProfanityLevel }
     *     
     */
    public ArrayOfProfanityLevel getGetDefaultLevelsResult() {
        return getDefaultLevelsResult;
    }

    /**
     * Sets the value of the getDefaultLevelsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfProfanityLevel }
     *     
     */
    public void setGetDefaultLevelsResult(ArrayOfProfanityLevel value) {
        this.getDefaultLevelsResult = value;
    }

}

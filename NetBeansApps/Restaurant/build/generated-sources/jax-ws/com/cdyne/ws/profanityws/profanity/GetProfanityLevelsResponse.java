
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
 *         &lt;element name="GetProfanityLevelsResult" type="{http://ws.cdyne.com/ProfanityWS/Profanity.asmx}ArrayOfProfanityLevel" minOccurs="0"/>
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
    "getProfanityLevelsResult"
})
@XmlRootElement(name = "GetProfanityLevelsResponse")
public class GetProfanityLevelsResponse {

    @XmlElement(name = "GetProfanityLevelsResult")
    protected ArrayOfProfanityLevel getProfanityLevelsResult;

    /**
     * Gets the value of the getProfanityLevelsResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfProfanityLevel }
     *     
     */
    public ArrayOfProfanityLevel getGetProfanityLevelsResult() {
        return getProfanityLevelsResult;
    }

    /**
     * Sets the value of the getProfanityLevelsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfProfanityLevel }
     *     
     */
    public void setGetProfanityLevelsResult(ArrayOfProfanityLevel value) {
        this.getProfanityLevelsResult = value;
    }

}

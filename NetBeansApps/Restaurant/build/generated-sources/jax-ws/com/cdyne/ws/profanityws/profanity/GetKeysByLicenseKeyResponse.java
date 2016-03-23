
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
 *         &lt;element name="GetKeysByLicenseKeyResult" type="{http://ws.cdyne.com/ProfanityWS/Profanity.asmx}ArrayOfProfanityKey" minOccurs="0"/>
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
    "getKeysByLicenseKeyResult"
})
@XmlRootElement(name = "GetKeysByLicenseKeyResponse")
public class GetKeysByLicenseKeyResponse {

    @XmlElement(name = "GetKeysByLicenseKeyResult")
    protected ArrayOfProfanityKey getKeysByLicenseKeyResult;

    /**
     * Gets the value of the getKeysByLicenseKeyResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfProfanityKey }
     *     
     */
    public ArrayOfProfanityKey getGetKeysByLicenseKeyResult() {
        return getKeysByLicenseKeyResult;
    }

    /**
     * Sets the value of the getKeysByLicenseKeyResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfProfanityKey }
     *     
     */
    public void setGetKeysByLicenseKeyResult(ArrayOfProfanityKey value) {
        this.getKeysByLicenseKeyResult = value;
    }

}

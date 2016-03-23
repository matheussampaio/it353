
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
 *         &lt;element name="AdvancedProfanityFilterResult" type="{http://ws.cdyne.com/ProfanityWS/Profanity.asmx}FilterReturn"/>
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
    "advancedProfanityFilterResult"
})
@XmlRootElement(name = "AdvancedProfanityFilterResponse")
public class AdvancedProfanityFilterResponse {

    @XmlElement(name = "AdvancedProfanityFilterResult", required = true)
    protected FilterReturn advancedProfanityFilterResult;

    /**
     * Gets the value of the advancedProfanityFilterResult property.
     * 
     * @return
     *     possible object is
     *     {@link FilterReturn }
     *     
     */
    public FilterReturn getAdvancedProfanityFilterResult() {
        return advancedProfanityFilterResult;
    }

    /**
     * Sets the value of the advancedProfanityFilterResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link FilterReturn }
     *     
     */
    public void setAdvancedProfanityFilterResult(FilterReturn value) {
        this.advancedProfanityFilterResult = value;
    }

}

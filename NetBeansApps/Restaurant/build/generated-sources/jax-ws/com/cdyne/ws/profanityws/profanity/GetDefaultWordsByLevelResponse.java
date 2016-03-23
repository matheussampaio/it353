
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
 *         &lt;element name="GetDefaultWordsByLevelResult" type="{http://ws.cdyne.com/ProfanityWS/Profanity.asmx}ArrayOfString" minOccurs="0"/>
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
    "getDefaultWordsByLevelResult"
})
@XmlRootElement(name = "GetDefaultWordsByLevelResponse")
public class GetDefaultWordsByLevelResponse {

    @XmlElement(name = "GetDefaultWordsByLevelResult")
    protected ArrayOfString getDefaultWordsByLevelResult;

    /**
     * Gets the value of the getDefaultWordsByLevelResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getGetDefaultWordsByLevelResult() {
        return getDefaultWordsByLevelResult;
    }

    /**
     * Sets the value of the getDefaultWordsByLevelResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setGetDefaultWordsByLevelResult(ArrayOfString value) {
        this.getDefaultWordsByLevelResult = value;
    }

}

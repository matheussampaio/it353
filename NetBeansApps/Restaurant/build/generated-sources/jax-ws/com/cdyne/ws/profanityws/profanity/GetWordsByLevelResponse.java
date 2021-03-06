
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
 *         &lt;element name="GetWordsByLevelResult" type="{http://ws.cdyne.com/ProfanityWS/Profanity.asmx}ArrayOfString" minOccurs="0"/>
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
    "getWordsByLevelResult"
})
@XmlRootElement(name = "GetWordsByLevelResponse")
public class GetWordsByLevelResponse {

    @XmlElement(name = "GetWordsByLevelResult")
    protected ArrayOfString getWordsByLevelResult;

    /**
     * Gets the value of the getWordsByLevelResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getGetWordsByLevelResult() {
        return getWordsByLevelResult;
    }

    /**
     * Sets the value of the getWordsByLevelResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setGetWordsByLevelResult(ArrayOfString value) {
        this.getWordsByLevelResult = value;
    }

}

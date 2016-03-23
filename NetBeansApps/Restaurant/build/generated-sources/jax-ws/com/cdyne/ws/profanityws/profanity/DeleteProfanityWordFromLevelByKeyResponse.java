
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
 *         &lt;element name="DeleteProfanityWordFromLevelByKeyResult" type="{http://ws.cdyne.com/ProfanityWS/Profanity.asmx}UserDefinedResult"/>
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
    "deleteProfanityWordFromLevelByKeyResult"
})
@XmlRootElement(name = "DeleteProfanityWordFromLevelByKeyResponse")
public class DeleteProfanityWordFromLevelByKeyResponse {

    @XmlElement(name = "DeleteProfanityWordFromLevelByKeyResult", required = true)
    protected UserDefinedResult deleteProfanityWordFromLevelByKeyResult;

    /**
     * Gets the value of the deleteProfanityWordFromLevelByKeyResult property.
     * 
     * @return
     *     possible object is
     *     {@link UserDefinedResult }
     *     
     */
    public UserDefinedResult getDeleteProfanityWordFromLevelByKeyResult() {
        return deleteProfanityWordFromLevelByKeyResult;
    }

    /**
     * Sets the value of the deleteProfanityWordFromLevelByKeyResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserDefinedResult }
     *     
     */
    public void setDeleteProfanityWordFromLevelByKeyResult(UserDefinedResult value) {
        this.deleteProfanityWordFromLevelByKeyResult = value;
    }

}

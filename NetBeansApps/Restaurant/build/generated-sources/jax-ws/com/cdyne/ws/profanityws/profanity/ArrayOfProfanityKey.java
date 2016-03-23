
package com.cdyne.ws.profanityws.profanity;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfProfanityKey complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfProfanityKey">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ProfanityKey" type="{http://ws.cdyne.com/ProfanityWS/Profanity.asmx}ProfanityKey" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfProfanityKey", propOrder = {
    "profanityKey"
})
public class ArrayOfProfanityKey {

    @XmlElement(name = "ProfanityKey")
    protected List<ProfanityKey> profanityKey;

    /**
     * Gets the value of the profanityKey property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the profanityKey property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProfanityKey().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProfanityKey }
     * 
     * 
     */
    public List<ProfanityKey> getProfanityKey() {
        if (profanityKey == null) {
            profanityKey = new ArrayList<ProfanityKey>();
        }
        return this.profanityKey;
    }

}

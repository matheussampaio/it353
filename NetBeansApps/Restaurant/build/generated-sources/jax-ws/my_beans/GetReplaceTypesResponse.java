
package my_beans;

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
 *         &lt;element name="GetReplaceTypesResult" type="{http://ws.cdyne.com/ProfanityWS/Profanity.asmx}ArrayOfReplaceType" minOccurs="0"/>
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
    "getReplaceTypesResult"
})
@XmlRootElement(name = "GetReplaceTypesResponse")
public class GetReplaceTypesResponse {

    @XmlElement(name = "GetReplaceTypesResult")
    protected ArrayOfReplaceType getReplaceTypesResult;

    /**
     * Gets the value of the getReplaceTypesResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfReplaceType }
     *     
     */
    public ArrayOfReplaceType getGetReplaceTypesResult() {
        return getReplaceTypesResult;
    }

    /**
     * Sets the value of the getReplaceTypesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfReplaceType }
     *     
     */
    public void setGetReplaceTypesResult(ArrayOfReplaceType value) {
        this.getReplaceTypesResult = value;
    }

}

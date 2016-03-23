
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
 *         &lt;element name="DeleteProfanityLevelByKeyResult" type="{http://ws.cdyne.com/ProfanityWS/Profanity.asmx}UserDefinedResult"/>
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
    "deleteProfanityLevelByKeyResult"
})
@XmlRootElement(name = "DeleteProfanityLevelByKeyResponse")
public class DeleteProfanityLevelByKeyResponse {

    @XmlElement(name = "DeleteProfanityLevelByKeyResult", required = true)
    protected UserDefinedResult deleteProfanityLevelByKeyResult;

    /**
     * Gets the value of the deleteProfanityLevelByKeyResult property.
     * 
     * @return
     *     possible object is
     *     {@link UserDefinedResult }
     *     
     */
    public UserDefinedResult getDeleteProfanityLevelByKeyResult() {
        return deleteProfanityLevelByKeyResult;
    }

    /**
     * Sets the value of the deleteProfanityLevelByKeyResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserDefinedResult }
     *     
     */
    public void setDeleteProfanityLevelByKeyResult(UserDefinedResult value) {
        this.deleteProfanityLevelByKeyResult = value;
    }

}

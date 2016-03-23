
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
 *         &lt;element name="AddWordToNonProfanityListByKeyResult" type="{http://ws.cdyne.com/ProfanityWS/Profanity.asmx}UserDefinedResult"/>
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
    "addWordToNonProfanityListByKeyResult"
})
@XmlRootElement(name = "AddWordToNonProfanityListByKeyResponse")
public class AddWordToNonProfanityListByKeyResponse {

    @XmlElement(name = "AddWordToNonProfanityListByKeyResult", required = true)
    protected UserDefinedResult addWordToNonProfanityListByKeyResult;

    /**
     * Gets the value of the addWordToNonProfanityListByKeyResult property.
     * 
     * @return
     *     possible object is
     *     {@link UserDefinedResult }
     *     
     */
    public UserDefinedResult getAddWordToNonProfanityListByKeyResult() {
        return addWordToNonProfanityListByKeyResult;
    }

    /**
     * Sets the value of the addWordToNonProfanityListByKeyResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserDefinedResult }
     *     
     */
    public void setAddWordToNonProfanityListByKeyResult(UserDefinedResult value) {
        this.addWordToNonProfanityListByKeyResult = value;
    }

}

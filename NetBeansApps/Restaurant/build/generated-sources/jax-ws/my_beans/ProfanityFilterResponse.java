
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
 *         &lt;element name="ProfanityFilterResult" type="{http://ws.cdyne.com/ProfanityWS/Profanity.asmx}FilterReturn"/>
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
    "profanityFilterResult"
})
@XmlRootElement(name = "ProfanityFilterResponse")
public class ProfanityFilterResponse {

    @XmlElement(name = "ProfanityFilterResult", required = true)
    protected FilterReturn profanityFilterResult;

    /**
     * Gets the value of the profanityFilterResult property.
     * 
     * @return
     *     possible object is
     *     {@link FilterReturn }
     *     
     */
    public FilterReturn getProfanityFilterResult() {
        return profanityFilterResult;
    }

    /**
     * Sets the value of the profanityFilterResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link FilterReturn }
     *     
     */
    public void setProfanityFilterResult(FilterReturn value) {
        this.profanityFilterResult = value;
    }

}

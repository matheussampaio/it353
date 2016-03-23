
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
 *         &lt;element name="SimpleProfanityFilterResult" type="{http://ws.cdyne.com/ProfanityWS/Profanity.asmx}FilterReturn"/>
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
    "simpleProfanityFilterResult"
})
@XmlRootElement(name = "SimpleProfanityFilterResponse")
public class SimpleProfanityFilterResponse {

    @XmlElement(name = "SimpleProfanityFilterResult", required = true)
    protected FilterReturn simpleProfanityFilterResult;

    /**
     * Gets the value of the simpleProfanityFilterResult property.
     * 
     * @return
     *     possible object is
     *     {@link FilterReturn }
     *     
     */
    public FilterReturn getSimpleProfanityFilterResult() {
        return simpleProfanityFilterResult;
    }

    /**
     * Sets the value of the simpleProfanityFilterResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link FilterReturn }
     *     
     */
    public void setSimpleProfanityFilterResult(FilterReturn value) {
        this.simpleProfanityFilterResult = value;
    }

}

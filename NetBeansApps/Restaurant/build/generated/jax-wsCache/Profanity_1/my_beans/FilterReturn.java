
package my_beans;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FilterReturn complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FilterReturn">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FoundProfanity" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="ProfanityCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="CleanText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FilterReturn", propOrder = {
    "foundProfanity",
    "profanityCount",
    "cleanText"
})
public class FilterReturn {

    @XmlElement(name = "FoundProfanity")
    protected boolean foundProfanity;
    @XmlElement(name = "ProfanityCount")
    protected int profanityCount;
    @XmlElement(name = "CleanText")
    protected String cleanText;

    /**
     * Gets the value of the foundProfanity property.
     * 
     */
    public boolean isFoundProfanity() {
        return foundProfanity;
    }

    /**
     * Sets the value of the foundProfanity property.
     * 
     */
    public void setFoundProfanity(boolean value) {
        this.foundProfanity = value;
    }

    /**
     * Gets the value of the profanityCount property.
     * 
     */
    public int getProfanityCount() {
        return profanityCount;
    }

    /**
     * Sets the value of the profanityCount property.
     * 
     */
    public void setProfanityCount(int value) {
        this.profanityCount = value;
    }

    /**
     * Gets the value of the cleanText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCleanText() {
        return cleanText;
    }

    /**
     * Sets the value of the cleanText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCleanText(String value) {
        this.cleanText = value;
    }

}

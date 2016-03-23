
package my_beans;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfProfanityLevel complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfProfanityLevel">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ProfanityLevel" type="{http://ws.cdyne.com/ProfanityWS/Profanity.asmx}ProfanityLevel" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfProfanityLevel", propOrder = {
    "profanityLevel"
})
public class ArrayOfProfanityLevel {

    @XmlElement(name = "ProfanityLevel")
    protected List<ProfanityLevel> profanityLevel;

    /**
     * Gets the value of the profanityLevel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the profanityLevel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProfanityLevel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProfanityLevel }
     * 
     * 
     */
    public List<ProfanityLevel> getProfanityLevel() {
        if (profanityLevel == null) {
            profanityLevel = new ArrayList<ProfanityLevel>();
        }
        return this.profanityLevel;
    }

}

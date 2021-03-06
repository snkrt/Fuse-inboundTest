//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.06.19 at 08:57:55 PM CST 
//


package com.customer.app;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * A specialization of Code which additionally contains a property to hold a reason why the value of the code is empty.
 * 
 * <p>Java class for NullableCode complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NullableCode"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.app.customer.com}CodeWithOriginalText"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="nullflavor" type="{http://www.app.customer.com}NullFlavors" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NullableCode", propOrder = {
    "nullflavor"
})
@XmlSeeAlso({
    LonicAnswerCode.class
})
public class NullableCode
    extends CodeWithOriginalText
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlSchemaType(name = "string")
    protected NullFlavors nullflavor;

    /**
     * Gets the value of the nullflavor property.
     * 
     * @return
     *     possible object is
     *     {@link NullFlavors }
     *     
     */
    public NullFlavors getNullflavor() {
        return nullflavor;
    }

    /**
     * Sets the value of the nullflavor property.
     * 
     * @param value
     *     allowed object is
     *     {@link NullFlavors }
     *     
     */
    public void setNullflavor(NullFlavors value) {
        this.nullflavor = value;
    }

}

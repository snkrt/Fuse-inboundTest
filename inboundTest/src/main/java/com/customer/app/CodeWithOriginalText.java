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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * A specialization of Code which additionally contains a property to hold the original text as seen and/or selected by the user who entered the data
 * 
 * <p>Java class for CodeWithOriginalText complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CodeWithOriginalText"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.app.customer.com}Code"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="originaltext" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CodeWithOriginalText", propOrder = {
    "originaltext"
})
@XmlSeeAlso({
    NullableCode.class
})
public class CodeWithOriginalText
    extends Code
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    protected String originaltext;

    /**
     * Gets the value of the originaltext property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginaltext() {
        return originaltext;
    }

    /**
     * Sets the value of the originaltext property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginaltext(String value) {
        this.originaltext = value;
    }

}

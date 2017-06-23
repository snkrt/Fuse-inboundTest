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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * An identifier that uniquely identifies a thing or object. This *abstract* data type represents a "identifier" - some series of letters or numbers which uniquely identifies something. In practice, this data type will be substituted with specific "flavors" of the Id data type for use in particular standards-based payloads.
 * 
 * <p>Java class for ID complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ID"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="identifier" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="idtype" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="assigningauthority" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ID", propOrder = {
    "identifier",
    "idtype",
    "assigningauthority"
})
@XmlRootElement(name = "ID")
public class ID
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(required = true)
    protected String identifier;
    protected String idtype;
    protected String assigningauthority;

    /**
     * Gets the value of the identifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentifier() {
        return identifier;
    }

    /**
     * Sets the value of the identifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentifier(String value) {
        this.identifier = value;
    }

    /**
     * Gets the value of the idtype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdtype() {
        return idtype;
    }

    /**
     * Sets the value of the idtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdtype(String value) {
        this.idtype = value;
    }

    /**
     * Gets the value of the assigningauthority property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssigningauthority() {
        return assigningauthority;
    }

    /**
     * Sets the value of the assigningauthority property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssigningauthority(String value) {
        this.assigningauthority = value;
    }

}

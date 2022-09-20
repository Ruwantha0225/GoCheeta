
package com.icbt.taxi.services.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for customer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="customer">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cusEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cusId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cusName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "customer", propOrder = {
    "cusEmail",
    "cusId",
    "cusName"
})
public class Customer {

    protected String cusEmail;
    protected String cusId;
    protected String cusName;

    /**
     * Gets the value of the cusEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCusEmail() {
        return cusEmail;
    }

    /**
     * Sets the value of the cusEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCusEmail(String value) {
        this.cusEmail = value;
    }

    /**
     * Gets the value of the cusId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCusId() {
        return cusId;
    }

    /**
     * Sets the value of the cusId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCusId(String value) {
        this.cusId = value;
    }

    /**
     * Gets the value of the cusName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCusName() {
        return cusName;
    }

    /**
     * Sets the value of the cusName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCusName(String value) {
        this.cusName = value;
    }

}


package com.icbt.taxi.services.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getCustomer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getCustomer">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cus_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getCustomer", propOrder = {
    "cusId"
})
public class GetCustomer {

    @XmlElement(name = "cus_id")
    protected String cusId;

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

}

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.08.27 at 09:45:12 AM CEST 
//


package org.apache.batchee.jaxb;

import org.apache.batchee.container.jsl.TransitionElement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * Java class for Fail complex type.
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="Fail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attGroup ref="{http://xmlns.jcp.org/xml/ns/javaee}TerminatingAttributes"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Fail")
public class Fail implements TransitionElement {

    @XmlAttribute(name = "on", required = true)
    protected String on;
    @XmlAttribute(name = "exit-status")
    protected String exitStatus;

    /**
     * Gets the value of the on property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getOn() {
        return on;
    }

    /**
     * Sets the value of the on property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setOn(String value) {
        this.on = value;
    }

    /**
     * Gets the value of the exitStatus property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getExitStatus() {
        return exitStatus;
    }

    /**
     * Sets the value of the exitStatus property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setExitStatus(String value) {
        this.exitStatus = value;
    }

}
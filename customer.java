package com.java4s;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
 
@XmlRootElement(name = "customer")
public class Customer {
 
    String custName;
    String custCountry;
    String custCon;
    int custId;

    @XmlElement
    public String getCustName() {
        return custName;
    }
    public void setCustName(String custName) {
        this.custName = custName;
    }
    
    @XmlElement    
    public String getCustCountry() {
        return custCountry;
    }
    public void setCustCountry(String custCountry) {
        this.custCountry = custCountry;
    }
    
    @XmlAttribute
    public int getCustId() {
        return custId;
    }
    public void setCustId(int custId) {
        this.custId = custId;
    }
    @XmlElement
    public String getCustCon()
    {
     return custCon;
    }
    public void setCustCon(String custCon)
    {
     this.custCon = custCon;
    }
}

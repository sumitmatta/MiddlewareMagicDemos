
package ws.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * This class was generated by Apache CXF 2.4.4
 * Sat Jan 28 10:59:11 IST 2012
 * Generated source version: 2.4.4
 */

@XmlRootElement(name = "getProperty", namespace = "http://test.org")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getProperty", namespace = "http://test.org")

public class GetProperty {

    @XmlElement(name = "arg0")
    private java.lang.String arg0;

    public java.lang.String getArg0() {
        return this.arg0;
    }

    public void setArg0(java.lang.String newArg0)  {
        this.arg0 = newArg0;
    }

}

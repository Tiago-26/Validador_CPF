
package control.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "isCPF", namespace = "http://control/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "isCPF", namespace = "http://control/")
public class IsCPF {

    @XmlElement(name = "cpf", namespace = "")
    private String cpf;

    /**
     * 
     * @return
     *     returns String
     */
    public String getCpf() {
        return this.cpf;
    }

    /**
     * 
     * @param cpf
     *     the value for the cpf property
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

}

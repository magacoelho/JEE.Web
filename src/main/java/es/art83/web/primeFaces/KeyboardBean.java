package es.art83.web.primeFaces;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class KeyboardBean {
    private String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
    
}

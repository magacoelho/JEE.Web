package jsf;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class HelloJSF {
    private String name="Hola, desde Bean. OK!!!";

    public String getName() {
        return name;
    }
}

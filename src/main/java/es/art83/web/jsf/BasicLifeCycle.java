package es.art83.web.jsf;

import javax.faces.bean.ManagedBean;

@ManagedBean(name = "blc")
public class BasicLifeCycle {
    private int i = 3;

    public int getI() {
        System.out.println("---> getI(" + i + ")");
        return i;
    }

    public void setI(int i) {
        System.out.println("---> setI(" + i + ")");
        this.i = i;
    }

    public String process() {
        System.out.println("---> process");
        this.i = -1;
        return null;
    }
}

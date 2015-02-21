package es.art83.web.jsf;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class LifeCycle {

    private int i;

    private int i2;

    private boolean b;

    public int getI() {
        System.out.println(":::: getI: " + i);
        return i;
    }

    public void setI(int i) {
        System.out.println(":::: setI: " + i);
        this.i = i;
    }

    public int getI2() {
        System.out.println(":::: getI2: " + i2);
        return i2;
    }

    public void setI2(int i2) {
        System.out.println(":::: setI2: " + i2);
        this.i2 = i2;
    }

    public boolean isB() {
        System.out.println(":::: isB: " + b);
        return b;
    }

    public void setB(boolean b) {
        System.out.println(":::: isB: " + b);
        this.b = b;
    }

    public void postAddToView() {
        System.out.println("==== postAddToView");
    }

    public void preValidate() {
        System.out.println("==== preValidate");
    }

    public void postValidate() {
        System.out.println("==== postValidate");
    }

    public void valueChangeListener() {
        System.out.println("==== Change Listener");
    }

    public void actionListener() {
        System.out.println("==== Action Listener");
    }

    public String process() {
        System.out.println(">>>> process");
        return null;
    }

    public void preRenderComponent() {
        System.out.println("==== preRenderComponent");
    }

}

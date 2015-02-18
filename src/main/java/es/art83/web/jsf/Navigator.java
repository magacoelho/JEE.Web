package es.art83.web.jsf;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class Navigator {

    private String rule;

    private boolean value;

    public String getRule() {
        return rule;
    }

    public void setRule(String rule) {
        this.rule = rule;
    }

    public boolean isValue() {
        return value;
    }

    public void setValue(boolean value) {
        this.value = value;
    }

    public String process() {
        if (rule == null || rule.trim().isEmpty())
            return "navigator";
        else
            return rule;
    }

}

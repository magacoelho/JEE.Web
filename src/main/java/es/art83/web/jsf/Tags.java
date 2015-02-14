package es.art83.web.jsf;

import java.util.Arrays;
import java.util.List;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class Tags {
    private String text;

    private String secret;

    private String hidden;

    private String area;

    private boolean checkbox;

    private String[] mapValue = {"cero", "uno", "dos"};

    private List<String> manyCheckbox;

    private String[] manyCheckboxMap;

    private String oneListbox;

    private List<String> manyListbox;

    private String oneMenu;

    private List<String> manyMenu;

    private Entity entity = new Entity();

    public Tags() {
        this.hidden = "oculto";
    }

    // Getters & setters
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getSecret() {
        return secret;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }

    public String getHidden() {
        return hidden;
    }

    public void setHidden(String hidden) {
        this.hidden = hidden;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public boolean isCheckbox() {
        return checkbox;
    }

    public void setCheckbox(boolean checkbox) {
        this.checkbox = checkbox;
    }

    public List<String> getManyCheckbox() {
        return manyCheckbox;
    }

    public void setManyCheckbox(List<String> manyCheckbox) {
        this.manyCheckbox = manyCheckbox;
    }

    public String[] getManyCheckboxMap() {
        return manyCheckboxMap;
    }

    public void setManyCheckboxMap(String[] manyCheckboxMap) {
        this.manyCheckboxMap = manyCheckboxMap;
    }

    public String getOneListbox() {
        return oneListbox;
    }

    public void setOneListbox(String oneListBox) {
        this.oneListbox = oneListBox;
    }

    public List<String> getManyListbox() {
        return manyListbox;
    }

    public void setManyListbox(List<String> manyListBox) {
        this.manyListbox = manyListBox;
    }

    public String getOneMenu() {
        return oneMenu;
    }

    public void setOneMenu(String oneMenu) {
        this.oneMenu = oneMenu;
    }

    public List<String> getManyMenu() {
        return manyMenu;
    }

    public void setManyMenu(List<String> manyMenu) {
        this.manyMenu = manyMenu;
    }

    public String[] getMapValue() {
        return mapValue;
    }

    public Entity getEntity() {
        return entity;
    }

    public void setEntity(Entity entity) {
        this.entity = entity;
    }

    public String process() {
        System.out.println("Se procesa...");
        System.out.println("text: " + this.text);
        System.out.println("secret: " + this.secret);
        System.out.println("hidden: " + this.hidden);
        System.out.println("area: " + this.area);
        System.out.println("checkbox: " + this.checkbox);
        System.out.println("manyCheckbox: " + this.manyCheckbox);
        System.out.println("manyCheckboxMap: " + Arrays.toString(this.manyCheckboxMap));
        System.out.println("oneListbox: " + this.oneListbox);
        System.out.println("manyListbox: " + this.manyListbox);
        System.out.println("oneMenu: " + this.oneMenu);
        System.out.println("manyMenu: " + this.manyMenu);
        System.out.println("entity: " + this.entity.toString());
        return null;
    }
}

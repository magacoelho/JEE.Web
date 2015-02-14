package es.art83.web.jsf;

public class Entity {
    private String property;

    public Entity() {
        this.property = "Soy entidad";
    }

    public String getProperty() {
        return property;
    }

    public void setProperty(String property) {
        this.property = property;
    }

    @Override
    public String toString() {
        return "Entity[property=" + property + "]";
    }
   
}

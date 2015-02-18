package es.art83.web.jsf;

import java.util.Map;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.context.FacesContext;

@ManagedBean
public class Injection {
    @ManagedProperty(value = "#{facesContext}")
    private FacesContext facesContext;

    @ManagedProperty(value = "#{sessionScope}")
    private Map<String, Object> sessionMap;

    @ManagedProperty(value = "#{injectableObject}")
    private InjectableObject io;

    @ManagedProperty(value = "#{injectableObject.getName()}")
    private String name;

    @PostConstruct
    public void update() {
        // Aqui las inyecciones ya estan realizadas
    }

    // Getters $ setters
    public FacesContext getFacesContext() {
        return facesContext;
    }

    public void setFacesContext(FacesContext facesContext) {
        this.facesContext = facesContext;
    }

    public Map<String, Object> getSessionMap() {
        return sessionMap;
    }

    public void setSessionMap(Map<String, Object> sessionMap) {
        this.sessionMap = sessionMap;
    }

    public InjectableObject getIo() {
        return io;
    }

    public void setIo(InjectableObject io) {
        this.io = io;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

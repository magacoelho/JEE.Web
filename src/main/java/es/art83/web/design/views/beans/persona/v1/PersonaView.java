package es.art83.web.design.views.beans.persona.v1;

import org.apache.logging.log4j.LogManager;

import es.art83.web.design.models.entities.persona.v1.Persona;

public class PersonaView {
    private String errorMsg;

    private Persona persona;

    private String[] roles;

    public PersonaView() {
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public String[] getRoles() {
        return roles;
    }

    public void setRoles(String[] roles) {
        this.roles = roles;
    }

    public void update() {
        LogManager.getLogger(PersonaView.class).debug(
                "Se accede a la capa de negocio para recuperar roles");
        this.roles = new String[] {"uno", "dos", "tres"}; // estos dastos son iinventados.. pero pueden ser los q devuelve la
        												// la capa de negocio
    }

    public String process() {
    	
        if (this.persona.getId() == 666 && !this.persona.getNombre().equals("Demonio")) {
            this.errorMsg = "Sólo se acepta el nombre 'Demonio'";
            return "persona";
        } else {
            LogManager.getLogger(PersonaView.class).debug(
                    "Se accede a la capa de negocio para registrar persona: " + persona);
            // aqui se invocaria a la capa de Negocio...... osea 
            return "home"; // el string q devuelve es la siguiente vista a mostrar
        }
    }

}

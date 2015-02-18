package es.art83.web.jsf;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

@ManagedBean
@ApplicationScoped
public class InjectableObject {
	private String name = "Factoria";

	public String getName() {
		return name;
	}

}

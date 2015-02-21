package es.art83.web.jsf;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class Composite {
	private String[] list={"uno","dos","tres","cuatro"};

	public String[] getList() {
		return list;
	}
	

}

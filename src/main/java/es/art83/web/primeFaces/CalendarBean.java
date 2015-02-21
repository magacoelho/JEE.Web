package es.art83.web.primeFaces;

import java.util.Date;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class CalendarBean {
    private Date date;
    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }
}

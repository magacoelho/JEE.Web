package es.art83.web.jsf;

import java.util.HashSet;
import java.util.Set;

import javax.faces.bean.ManagedBean;

@ManagedBean(name = "collectionBean")
public class CollectionBean {
    private Set<Row> list = new HashSet<Row>();

    public CollectionBean() {
        this.list.add(new Row(0, "Cero", 0));
        this.list.add(new Row(1, "Uno", 1));
        this.list.add(new Row(2, "Dos", 2));
        this.list.add(new Row(3, "Tres", 3));
        this.list.add(new Row(4, "Cuatro", 4));
        this.list.add(new Row(5, "Cinco", 5));
    }

    public Row[] getList() {
        return list.toArray(new Row[0]);
    }

}

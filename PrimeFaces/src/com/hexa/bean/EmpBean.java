package com.hexa.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.ViewScoped;

@ManagedBean(name = "ebean")
@ViewScoped
public class EmpBean implements Serializable {

	private List<Emp> elist;

	public List<Emp> getElist() {
		if (elist == null) {
			elist = new ArrayList<Emp>();
			elist.add(new Emp(1001, "ram", 9000));
			elist.add(new Emp(1003, "tom", 8000));
			elist.add(new Emp(1005, "shyam", 15000));
			elist.add(new Emp(1007, "ram", 9000));
			elist.add(new Emp(1009, "ravi", 8000));
			elist.add(new Emp(1011, "gokul", 15000));
			elist.add(new Emp(1002, "john", 9000));
			elist.add(new Emp(1004, "harsha", 8000));
			elist.add(new Emp(1006, "giri", 15000));
			elist.add(new Emp(1008, "asha", 9000));
			elist.add(new Emp(10010, "peter", 8000));
			elist.add(new Emp(10013, "banu", 15000));
		}
		return elist;
	}

}

package com.hexa.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean(name = "pbean")
@ViewScoped
public class AccordBean implements Serializable{
	public List<String> brands;
	public List<String> colors;
	public List<String> sizes;
	
	public List<String> getBrands(){
		brands = new ArrayList<String>();
		brands.add("cheroky");
		brands.add("peter England");
		brands.add("van heusen");
		return brands;
	}
	
	public List<String> getColors(){
		colors= new ArrayList<String>();
		colors.add("blue");
		colors.add("white");
		colors.add("black");
		return colors;
	}
	
	public List<String> getSizes(){
		sizes = new ArrayList<String>();
		sizes.add("small");
		sizes.add("medium");
		sizes.add("Luxury");
		return sizes;
	}

}

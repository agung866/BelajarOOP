package com.adl.newsapp.view;

import com.adl.newsapp.interfaces.ActionListener;

public class Component {

	private String nama;
	private String label;
	
	public Component() {
		
	}
	
	
	public Component(String nama, String label) {
		this.nama=nama;
		this.label=label;
	}
	
	
	
	public void show() {
		
		System.out.println("nama +" +nama);
		System.out.println("label "+label);
		

	}
	

	public String getNama() {
		return nama;
	}
	
	

	public void setNama(String nama) {
		this.nama = nama;
	}

	

	public String getLabel() {
		return label;
	}

	

	public void setLabel(String label) {
		this.label = label;
	}

	
	


	
	public void setAction(ActionListener action,Component component) {
		action.onAction(component);
		
		
	}


	
	

	
	

}

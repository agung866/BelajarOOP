package com.adl.newsapp.view;

import com.adl.newsapp.interfaces.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class Component {

	private String nama;
	private String label;
	private List<Component> componentListener = new ArrayList<Component>();
	
	public Component() {
		
	}
	
	
	public Component(String nama, String label) {
		this.nama=nama;
		this.label=label;
	}
	
	
	
	public void show() {
		
		System.out.println(label);
		
		

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

	public void addActionListener(Component component) {
		this.componentListener.add(component);
	}
	public void onAction(ActionListener action) {
		action.onAction(this.componentListener);
	}


	
	

	
	

}

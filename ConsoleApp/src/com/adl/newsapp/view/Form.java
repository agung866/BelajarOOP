package com.adl.newsapp.view;
import java.util.ArrayList;
import java.util.List;

public class Form {
	
	public Form(){
		
	}
	public Form(Component component) {
		addComponent(component);
	}

		private List<Component>lstComponent=new ArrayList<Component>();
		public void addComponent(Component component) {
		lstComponent.add(component);
		}
		
		
		public void showComponents() {
			for (int i = 0; i < lstComponent.size(); i++) {
				lstComponent.get(i).show();
			}
				
			
		}
	}

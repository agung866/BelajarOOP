package com.adl.newsapp;

import com.adl.newsapp.interfaces.ActionListener;
import com.adl.newsapp.view.Component;
import com.adl.newsapp.view.ContentComponent;
import com.adl.newsapp.view.FooterComponent;
import com.adl.newsapp.view.Form;
import com.adl.newsapp.view.HeaderComponent;
import com.adl.newsapp.view.InputComponent;

public class NewsApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Form form =new Form();
		
		Component component = new Component("txtNama","Nama Saya agung");
		Component component1 = new Component("txtNama2","Nama Saya agung setiawan");
		Component component2= new Component("txtNama3","Nama Saya agung setiawan");
		HeaderComponent headerComponent1=new HeaderComponent("txtNama","ini Header");
		FooterComponent footerComponent1=new FooterComponent("txtNama","ini footer");
		ContentComponent contentComponent1=new ContentComponent("txtNama","ini Content");
		InputComponent inputComponent=new InputComponent("txtNama","Masukan Nama Anda ?");
		
		
		
		form.addComponent(headerComponent1);
		form.addComponent(contentComponent1);
		form.addComponent(component);
		form.addComponent(component1);
		form.addComponent(footerComponent1);
		form.addComponent(inputComponent);
		form.showComponents();
		
		
		inputComponent.setAction(new ActionListener() {
			
			@Override
			public void onAction(Component component ) {
				// TODO Auto-generated method stub
				component.setLabel(inputComponent.getValue());
				form.showComponents();
			}
		},headerComponent1);
	}

}

package com.adl.newsapp.view;

import java.util.Scanner;

public class InputComponent extends Component{
	private String value="";
	private Scanner scan = new Scanner(System.in);
	
	public InputComponent(String nama, String label) {
		super(nama,label);
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.print(this.getLabel()+">");
		this.value=scan.nextLine();
		}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}	
	
	
}

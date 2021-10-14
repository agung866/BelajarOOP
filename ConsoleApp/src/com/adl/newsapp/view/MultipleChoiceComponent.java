package com.adl.newsapp.view;

import java.lang.Iterable;

public class MultipleChoiceComponent extends Component{
	
	private String [] pilihan;
	
	public MultipleChoiceComponent(String nama,String pertanyaan, String[] pilihan) {
		super(nama,pertanyaan);
		this.pilihan=pilihan;
	}


	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println(this.getLabel());
		for(String string : pilihan) {
			
			System.out.println(string);
		}
	}
	

}

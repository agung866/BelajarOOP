package com.adl.newsapp.view;

public class ContentComponent extends Component{
	public ContentComponent() {
		super();
	}
	public ContentComponent(String nama, String label) {
		super(nama,label);
	}
	@Override
	public void show() {
		
		// TODO Auto-generated method stub
		String content =getLabel();
		System.out.println(content);
	}
}

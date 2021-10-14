package com.adl.newsapp.view;

public class HeaderComponent extends Component{
	
	public HeaderComponent(){
		super();
	}
	
	public HeaderComponent(String nama, String label){
		super(nama,label);
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		String header =this.getLabel();
				   
			System.out.println(header);
	}
	
}

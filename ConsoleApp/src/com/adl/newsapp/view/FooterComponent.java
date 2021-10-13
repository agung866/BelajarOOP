package com.adl.newsapp.view;

public class FooterComponent extends Component {

	public FooterComponent() {
		super();
	}
	public FooterComponent(String nama, String label) {
		super(nama,label);
	}
	@Override
	public void show() {
		
		// TODO Auto-generated method stub
		String footer ="===================== \n" +
					   "      "+"iniFooter    \n"+
					   "===================== \n";
		System.out.println(footer);
	}
	
}


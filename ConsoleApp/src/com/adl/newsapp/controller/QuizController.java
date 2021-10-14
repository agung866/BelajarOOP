package com.adl.newsapp.controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.adl.newsapp.model.ModelQuiz;
import com.adl.newsapp.view.Component;
import com.adl.newsapp.view.ContentComponent;
import com.adl.newsapp.view.Form;
import com.adl.newsapp.view.HeaderComponent;
import com.adl.newsapp.view.InputComponent;
import com.adl.newsapp.view.MultipleChoiceComponent;


public class QuizController {
	
	//5 form
	ModelQuiz model;
	List<Form> lstForm= new ArrayList<Form>();
	
	private int benar=0;
	private int salah=0;
		
	public QuizController(ModelQuiz model) {
		// TODO Auto-generated constructor stub
		this.model=model;
		generateForm(model);
		
	}


	public void  generateForm(ModelQuiz model){
		
		for (String modelData : model.getLstSoal()) {
			Form form =new Form();
			String [] soal = modelData.split(";");
			
			switch (soal[0]) {
			case "multiplechoice": 
				MultipleChoiceComponent choice =new MultipleChoiceComponent("", soal[1], soal[2].split("#"));
				form.addComponent(choice);
				
				InputComponent txtComponent = new InputComponent("inputan","jawaban >");
				form.addComponent(txtComponent);
						
				break;
			
			case "esay" : 
				ContentComponent content = new ContentComponent("",soal[1]);
				InputComponent txtComponent2 = new InputComponent("inputan", "jawaban >");
				form.addComponent(content);
				form.addComponent(txtComponent2);
				break;
				
				default:
					break;
			}
			this.lstForm.add(form);
		}
		
		
	}
	
	public void generateNilai() {
		int nilai=0;
		
		for (int i = 0; i <this.lstForm.size(); i++) {	
			
			for (Component component : this.lstForm.get(i).getLstComponent()) {
				
				if (component.getNama().equalsIgnoreCase("inputan")) {
					
					if(component instanceof InputComponent) {
						
						String jawaban=((InputComponent)component).getValue();
						
						String[] soal = this.model.getLstSoal().get(i).split(";");
						String kunciJawaban="";
						int score=0;
						switch (soal[0]) {
						case "multiplechoice":

							kunciJawaban = soal[3];
							score=Integer.parseInt(soal[4]);
							
							break;
						case "esay":
							
							kunciJawaban=soal[2];
							score=Integer.parseInt(soal[3]);
						}
						
						nilai += hitungNilai(jawaban,kunciJawaban,score);
					}
				}
				
			}
		}
		Form formNilai =new Form();
		
		HeaderComponent header = new HeaderComponent("","nilai anda :");
		
		formNilai.addComponent(header);
		
		String resultNilai="score : "+nilai+" benar anda : "+this.benar +" salah anda : "+this.salah;
		ContentComponent content = new ContentComponent("",resultNilai);
		
		formNilai.addComponent(content);
		
		formNilai.showComponents();
	}
	
	public int hitungNilai(String jawaban,String kunciJawaban,int score) {
		int nilai=0;
		if(jawaban.equalsIgnoreCase(kunciJawaban)) {
			nilai+=score;
			this.benar++;
		}else {
			this.salah++;
		}
		
		return nilai;
	}
	
	public void showForm() {
		// TODO Auto-generated method stub
		for(Form form :lstForm ) {
			form.showComponents();
		}
	}
}




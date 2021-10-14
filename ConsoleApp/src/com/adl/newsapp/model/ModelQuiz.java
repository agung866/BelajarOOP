package com.adl.newsapp.model;

import java.util.ArrayList;
import java.util.List;

public class ModelQuiz {
	
	List<String> lstSoal = new ArrayList<String>();
	
	
	
	public void addSoal(String soal) {
		this.lstSoal.add(soal);
	}

	public List<String> getLstSoal() {
		return lstSoal;
	}

	public void setLstSoal(List<String> lstSoal) {
		this.lstSoal = lstSoal;
	}
	
		
}

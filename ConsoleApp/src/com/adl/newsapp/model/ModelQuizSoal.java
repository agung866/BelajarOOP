package com.adl.newsapp.model;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ModelQuizSoal extends ModelQuiz{

	private String url ="";
	
	public ModelQuizSoal(String url) {
		this.url=url;
	openFile(url);
}
	public void openFile(String url) {
	File file =new File(url);
		try {
			Scanner scan =new Scanner(file);
			while(scan.hasNextLine()){
				this.addSoal(scan.nextLine());
				
			}
	
		} catch (FileNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
}

public String getUrl() {
	return url;
}

public void setUrl(String url) {
	this.url = url;
}

	


}

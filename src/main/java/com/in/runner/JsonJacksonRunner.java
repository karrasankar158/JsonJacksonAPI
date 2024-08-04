package com.in.runner;

import java.io.File;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.in.model.Student;
import com.in.service.JsonJacksonService;

@Component
public class JsonJacksonRunner implements CommandLineRunner {
	
	@Autowired
	private JsonJacksonService jsonJacksonService;

	@Override
	public void run(String... args) throws Exception {
		
		//String response=jsonJacksonService.getStudentAsString(new Student(1001L, "Sankar", "B.Tech"));
	    //System.out.println(response);
	    
	    //Student response=jsonJacksonService.getStudentObjectByUsingString("{\"sId\" : 1001,\"sName\" : \"Sankar\",\"sCourseName\" : \"B.Tech\"}");
	    //System.out.println(response);
		
		//String response=jsonJacksonService.convertStudentObjectIntoFile(new File("src/main/resources/studentjson.json"),new Student(1001L, "Sankar", "B.Tech"));
	    //System.out.println(response);
		
		Student response=jsonJacksonService.readingStudentObjectByUsingJSONFile(new File("src/main/resources/studentjson.json"));
	    System.out.println(response);
	}

}

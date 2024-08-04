package com.in.service;

import java.io.File;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.in.model.Student;

@Service
public class JsonJacksonService {

	@Autowired
	private ObjectMapper mapper; // HAS-A

	public String getStudentAsString(Student student) throws JsonProcessingException {
		return mapper.writeValueAsString(student);
	}

	public Student getStudentObjectByUsingString(String json) throws JsonMappingException, JsonProcessingException {
		Student response = mapper.readValue(json, Student.class);
		return response;
	}

	public String convertStudentObjectIntoFile(File file, Student student)
			throws StreamWriteException, DatabindException, IOException {
		mapper.writeValue(file, student);
		return "Student Object JSON successfully stored into file";
	}
	
	public Student readingStudentObjectByUsingJSONFile(File file) throws StreamReadException, DatabindException, IOException {
		return mapper.readValue(file, Student.class);
	}
}

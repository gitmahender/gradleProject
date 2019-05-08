package com.country.america.jackson.example;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import com.country.america.jackson.model.Collage;
import com.country.america.jackson.model.Department;
import com.country.america.jackson.model.University;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ObjectToJsonToObject {

	public static void main(String[] args) {
		
		University uni = new University();
		uni.setName("jntu");
		
		Collage collage = new Collage();
		collage.setCollageName("cmr");
		Department dept = new Department();
		dept.setDepartmentName("ECE");
		dept.setDeptNo("101");
		collage.setDepartment(dept);
		
		List<Collage> collages = Arrays.asList(collage);
		uni.setCollages(collages);
		
		//You need objectMapper for JSON
		//You need XMLMapper for XML
		ObjectMapper objectMapper = new ObjectMapper();
		try {
			
			//WriteValue() is used to serialize
			String json = objectMapper.writeValueAsString(uni);
			System.out.println(json);
			
			//readValue is used to de-serialize
			University universityFromJson = objectMapper.readValue(json, University.class);
			System.out.println(universityFromJson);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

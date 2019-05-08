package com.country.america.jackson.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JsonRootName(value="University")
@JsonIgnoreProperties(value= {"ignoreField1","ignoreField2"})
@JsonPropertyOrder(value= {"collages","name"})
@JsonInclude(Include.NON_NULL)
@JacksonXmlRootElement(localName="UniversityXml")
public class University {
	
	@JsonProperty(value="universityName")
	@JacksonXmlProperty(localName="universityName")
	private String name;
	
	@JsonProperty(value="ignoreField1")
	private String ignoreField1;
	
	@JsonProperty(value="ignoreField2")
	private String ignoreField2;
	
	@JsonIgnore
	@JsonProperty(value="ignoreField3")
	private String ignoreField3;
	
	@JsonProperty(value="collages")
	private List<Collage> collages;
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Collage> getCollages() {
		return collages;
	}

	public void setCollages(List<Collage> collages) {
		this.collages = collages;
	}

	

	@Override
	public String toString() {
		return "University [name=" + name + ", ignoreField1=" + ignoreField1 + ", ignoreField2=" + ignoreField2
				+ ", ignoreField3=" + ignoreField3 + ", collages=" + collages + "]";
	}

	public String getIgnoreField3() {
		return ignoreField3;
	}

	public void setIgnoreField3(String ignoreField3) {
		this.ignoreField3 = ignoreField3;
	}
	
	

}

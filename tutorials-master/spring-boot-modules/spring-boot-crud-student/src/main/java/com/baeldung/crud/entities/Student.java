package com.baeldung.crud.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Entity
public class Student {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
	
	
    
    private String name;    
    private String standard;
    private String section;
    private String term1;
    private String term2;
    private String term3;
    
    
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStandard() {
		return standard;
	}
	public void setStandard(String standard) {
		this.standard = standard;
	}
	public String getSection() {
		return section;
	}
	public void setSection(String section) {
		this.section = section;
	}
	public String getTerm1() {
		return term1;
	}
	public void setTerm1(String term1) {
		this.term1 = term1;
	}
	public String getTerm2() {
		return term2;
	}
	public void setTerm2(String term2) {
		this.term2 = term2;
	}
	public String getTerm3() {
		return term3;
	}
	public void setTerm3(String term3) {
		this.term3 = term3;
	}
    
    
    
    

}

package com.JexlBoot.app.entity;

import javax.persistence.Entity;
import javax.persistence.Id;



 @Entity
public class StudentResult {
	 
	 @Id
	 private int id;
	 private String Firstname;
	 private String Lastname;
	 private int Percentage;
	 private int Math;
	 private int Science;
	 private int Physics;
	 private String Result;
	 
	public StudentResult() {
		super();
	}

	public StudentResult(int id, String firstname, String lastname, int percentage, int math, int science, int physics,
			String result) {
		super();
		this.id = id;
		Firstname = firstname;
		Lastname = lastname;
		Percentage = percentage;
		Math = math;
		Science = science;
		Physics = physics;
		Result = result;
	}


	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstname() {
		return Firstname;
	}

	public void setFirstname(String firstname) {
		Firstname = firstname;
	}

	public String getLastname() {
		return Lastname;
	}

	public void setLastname(String lastname) {
		Lastname = lastname;
	}

	public int getPercentage() {
		return Percentage;
	}

	public void setPercentage(int percentage) {
		Percentage = percentage;
	}

	public int getMath() {
		return Math;
	}

	public void setMath(int math) {
		Math = math;
	}

	public int getScience() {
		return Science;
	}

	public void setScience(int science) {
		Science = science;
	}

	public int getPhysics() {
		return Physics;
	}

	public void setPhysics(int physics) {
		Physics = physics;
	}

	public String getResult() {
		return Result;
	}

	public void setResult(String result) {
		Result = result;
	}

	@Override
	public String toString() {
		return "StudentResult [id=" + id + ", Firstname=" + Firstname + ", Lastname=" + Lastname + ", Percentage="
				+ Percentage + ", Math=" + Math + ", Science=" + Science + ", Physics=" + Physics + ", Result=" + Result
				+ "]";
	}
	
	
	
	
	 
	 
	 
	 
	
}

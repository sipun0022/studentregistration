package com.sr.form.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Student")
public class StudentModel {
 
	@Id
	int sid;
	String sname;
	String password;
	String suname;

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getSuname() {
		return suname;
	}

	public void setSuname(String suname) {
		this.suname = suname;
	}

	@Override
	public String toString() {
		return "StudentModel [sid=" + sid + ", sname=" + sname + ", password=" + password + ", suname=" + suname + "]";
	}

}

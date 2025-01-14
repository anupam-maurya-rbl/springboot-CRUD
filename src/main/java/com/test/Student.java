package com.test;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {
	@Id
   private int id;
   private String name;
   private String city;
   private double fee;
   private String image;
public Student() {
	super();
	// TODO Auto-generated constructor stub
}
public Student(int id, String name, String city, double fee, String image) {
	super();
	this.id = id;
	this.name = name;
	this.city = city;
	this.fee = fee;
	this.image = image;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public double getFee() {
	return fee;
}
public void setFee(double fee) {
	this.fee = fee;
}
public String getImage() {
	return image;
}
public void setImage(String image) {
	this.image = image;
}
@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + ", city=" + city + ", fee=" + fee + ", image=" + image + "]";
}
   
   
}

package com.mappingtest.MappingTest.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "CGSTUDENT")
public class Students {
	
	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "stud_rollno")
	private int studRollNo;
	@Column(name = "stud_name")
	private String studName;
	@Column(name = "stud_marks")
	private double marks;
	
//	@OneToOne
//	private Laptop laptop;
	
	public Students() {
		// TODO Auto-generated constructor stub
	}
	
	public Students(String studName, double marks) {
		super();
		this.studName = studName;
		this.marks = marks;
	}



//	public int getStudRollNo() {
//		return studRollNo;
//	}
//
//	public void setStudRollNo(int studRollNo) {
//		this.studRollNo = studRollNo;
//	}

	public String getStudName() {
		return studName;
	}

	public void setStudName(String studName) {
		this.studName = studName;
	}

	public double getMarks() {
		return marks;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}

//	public Laptop getLaptop() {
//		return laptop;
//	}
//
//	public void setLaptop(Laptop laptop) {
//		this.laptop = laptop;
//	}
	
	

}

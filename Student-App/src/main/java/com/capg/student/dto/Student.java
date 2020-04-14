package com.capg.student.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="GL_Bajaj_Students")

public class Student implements Serializable
{
		@Id
		@GeneratedValue(strategy = GenerationType.SEQUENCE)
	
		@Column(name="Student_Id")
		private int sId;
	
		@Column(name="Student_Name")
		private String sName;
	
		@Column(name="Student_PhoneNo")
		private int phoneNo;
	
		public Student()
		{
			super();
		
		}
		
		public Student(int sId, String sName, int phoneNo) {
			super();
			this.sId = sId;
			this.sName = sName;
			this.phoneNo = phoneNo;
		}



		public int getsId() {
			return sId;
		}

		public void setsId(int sId) {
			this.sId = sId;
		}

		public String getsName() {
			return sName;
		}

		public void setsName(String sName) {
			this.sName = sName;
		}

		public int getPhoneNo() {
			return phoneNo;
		}

		public void setPhoneNo(int phoneNo) {
			this.phoneNo = phoneNo;
		}
		
		
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return super.toString();
		}
	
	

}

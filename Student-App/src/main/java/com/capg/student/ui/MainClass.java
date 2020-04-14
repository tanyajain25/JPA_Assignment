package com.capg.student.ui;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.capg.student.service.StudentService;

public class MainClass
{
//	 static EntityManagerFactory emf;
	
	public static void main(String[] args) 
	{
	     try {
	    	 StudentService s =new StudentService();
//	    	 s.insertData();
	    	 s.findData();
//	    	 s.updataData();
//	    	 s.removeData();
	 		
	      } finally {
//	          emf.close();
	      }		
	}
	
}

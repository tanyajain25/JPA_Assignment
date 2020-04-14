package com.capg.student.service;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.capg.student.dto.Student;

public class StudentService
{
	
private static EntityManagerFactory emf=  Persistence.createEntityManagerFactory("pu");

	
	public void insertData()
	{
		
		EntityManager em= emf.createEntityManager();
		
		  Student studentObj =new Student();
		
		  studentObj.setsName("Akansha");
		  studentObj.setPhoneNo(967676733);
		  
	      System.out.println("Transaction started");
	      em.getTransaction().begin();
	      
	      em.persist(studentObj);
		  System.out.println("Persist");
		 
	      em.getTransaction().commit();
	      em.close();
	      System.out.println("--------------------");
      
		
	}
	
	public void findData()
	{
		EntityManager em= emf.createEntityManager();
	
		  Student obj =em.find(Student.class, 141);
		  
		  System.out.println("Name-"+" "+obj.getsName()); 
		  
		  Student obj1 =em.find(Student.class, 201);     // find(classname, primarykey)
		  
		  System.out.println("Name-"+" "+obj1.getsName()); 
		  
	}
	
	public void updataData()
	{
		EntityManager em= emf.createEntityManager();
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("For Updations in Databse");
		
		System.out.println("Enter Student_Id");
		String s = sc.next();
		int id= Integer.parseInt(s);
		
		System.out.println("Enter Column Name for the updation");
		String columnName= sc.next();
		
		Student obj = em.find(Student.class, id);
		
		em.getTransaction().begin();
		System.out.println("Transaction Started");
		
		if(columnName.equalsIgnoreCase("sName"))
		{
			System.out.println("Enter Student Name");
			String name= sc.next();
			obj.setsName(name);
			
		}
		
		if(columnName.equalsIgnoreCase("phoneNo"))
		{
			System.out.println("Enter Student PhoneNo");
			int no= sc.nextInt();
			obj.setPhoneNo(no);
			
		}
		
		em.getTransaction().commit();
		
		em.close();
		System.out.println("Updation Done----");
				
	}
	
	public void removeData()
	{
		
        EntityManager em= emf.createEntityManager();
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("For Deletion from Databse");
		
		System.out.println("Enter Student_Id");
		String s = sc.next();
		int id= Integer.parseInt(s);

		Student obj = em.find(Student.class, id);
		
		em.getTransaction().begin();
		System.out.println("Transaction Started");
		
		if(id==obj.getsId())
		{
			em.remove(obj);
			
		}
	
		em.getTransaction().commit();
		
		em.close();
		System.out.println("Deletion Done----");
	}
	
}

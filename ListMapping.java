package com.java.collection;

import java.util.List;

import javax.persistence.*;

import com.secondassessment.Employeedetails;

public class ListMapping{

  public static void main(String[] args) {

    EntityManagerFactory emf=Persistence.createEntityManagerFactory("Employee_details");

    EntityManager em=emf.createEntityManager();

    em.getTransaction().begin();

  Employeedetails e1=new Employeedetails();

  e1.setEmpno(1);

  e1.setName("Vijay");
  
  e1.setDesignation("SoftwareEngineer");
  
  e1.setSalary(35000.00);


  em.persist(e1);

  em.getTransaction().commit();

  Query q1 = em.createNamedQuery("from employeedetails");
  List<Employeedetails> list = q1.getResultList();
  for(Employeedetails e : list) {
	  System.out.println(e.getEmpno()+ " " + e.getName()+ " " + e.getDesignation()+ " " + e.getSalary());
  }

  }

}












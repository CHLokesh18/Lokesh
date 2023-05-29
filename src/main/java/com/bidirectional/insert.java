package com.bidirectional;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class insert extends Scan_Class {
	static boolean flag;
	static int id;
	static long adhar;
	public static void insert1(dto_Persion_Details a)
	{
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("shiva");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		Dto_AdharNumber b=new Dto_AdharNumber();
	
//		do {
			flag=false;
			System.out.println("enter the id");
			id=sc.nextInt();
			a.setId(id);
			
			System.out.println("enter the name");
			String name=sc.next();
			a.setName(name);
			System.out.println("enter the age");
			
			int age=sc.nextInt();
			a.setAge(age);
//			method calling
			insert2(b);
			
			a.setD(b);
			
			et.begin();
			em.persist(a);
			em.persist(b);
			
			et.commit();
			
//			System.out.println("if u want to insert another row enter the yes");
//			String option=sc.next();
//			if(option.equalsIgnoreCase("yes"))
//			{
//				flag=true;
//			}
			
//		}
	
		
//		while(flag);
		
	    
	
		
	}
	private static void insert2(Dto_AdharNumber b) {
		// TODO Auto-generated method stub
		System.out.println("enter the adhar number");
		 adhar=sc.nextLong();
		b.setId(id);
		b.setAdhar(adhar);
		
	}

}

package com.bidirectional;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class delete extends Scan_Class {
	static int i=0;
	static int i1=0;
	public static void delete1(dto_Persion_Details ref)
	{

		EntityManagerFactory emf=Persistence.createEntityManagerFactory("shiva");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
	
		
		et.begin();
		Query q=em.createQuery("select e from dto_Persion_Details e");
		List<dto_Persion_Details>l=q.getResultList();
		for(dto_Persion_Details r:l)
		{
			System.out.println(r.getId()+"\t"+r.getAge()+"\t"+r.getName());
		}
		Query q1=em.createQuery("select e1 from Dto_AdharNumber e1");
		List<Dto_AdharNumber>l1=q1.getResultList();
		for(Dto_AdharNumber r1:l1)
		{
			System.out.println(r1.getId()+"\t"+r1.getAdhar());
		}
		et.commit();
	
		
	System.out.println("enter the id");
		int id=sc.nextInt();
		et.begin();
		Query e1 =em.createQuery("delete from dto_Persion_Details e where e.id='"+id+"'");
		i=e1.executeUpdate();
		et.commit();

		et.begin();
		Query e2=em.createQuery("delete from Dto_AdharNumber e1 where e1.id='"+id+"'");
//		e2.setParameter(id, id);
		i1=e2.executeUpdate();
		et.commit();
		if(i>0 && i1>0)
		{
			System.out.println("sucesfully deleted record from the table");
			main.main(new String[0]);

		}
		else if(i==0 && i1==0)
		{
			System.out.println("select valid id");
			delete1(ref);
		}
		else
		{
			System.out.println("records r not match");
		}
		
		
	}

}

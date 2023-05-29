package com.bidirectional;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Read {
	public static void read(dto_Persion_Details ref)
	{
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("shiva");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
	
		
		et.begin();
		Query q=em.createQuery("select e from dto_Persion_Details e");
		List<dto_Persion_Details>l=q.getResultList();
		for(dto_Persion_Details r:l)
		{
			System.out.println(r.getId()+"\t"+r.getAge()+"\t"+r.getName()+"\t"+r.getD().getId()+"\t"+r.getD().getAdhar());
		}
		
		et.commit();
	}

}

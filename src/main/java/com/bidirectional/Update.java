package com.bidirectional;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Update extends Scan_Class {
	 static int w=0;

	public void update(dto_Persion_Details ref) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("shiva");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
	
		
		et.begin();
		Query q=em.createQuery("select e from dto_Persion_Details e");
		List<dto_Persion_Details>l=q.getResultList();
		for(dto_Persion_Details r:l)
		{
			
			System.out.println(r.getId()+"\t"+r.getAge()+"\t"+r.getName()+"\t"+r.getD().getAdhar());
		}
		
		//if u want to update child record use below query
//		String Query="update dto_Persion_Details e set adhar=e.getid().getName() where id=e.getid() "
		
		
		 String last=" where a.id=";
		System.out.println("enter the id");
		int id1=sc.nextInt();
		String query=query(id1);
		
		
		
    String out1=query+last+"'"+id1+"'";
		
		StringBuilder sb = new StringBuilder(out1);
		//int i = out1.lastIndexOf(",");
		char ch=',';
		int i = out1.lastIndexOf(ch);
		sb.deleteCharAt(i);
//		System.out.println(sb);
	String res=""+sb;
		Query q1=em.createQuery(res);
		w+=q1.executeUpdate();
		
		et.commit();
		if(i>0)
		{
			System.out.println("update succesfully");
		}
		else
		{
			System.out.println("no records updated");
		}

		
		
		
		
		
		
		
		
	}
	static String s="update dto_Persion_Details  a set ";
//	static String last=" where a.id=";
	static String c1="',";
	private String query(int id) {
		// TODO Auto-generated method stub
		System.out.println("which details u want to update 1.for name 2.for age 3.update records");
		int op=sc.nextInt();
		switch (op) {
		case 1:
			System.out.println("enter the name");
			String name=sc.next();
			s+="a.name='"+name+c1;
			query(id);
			
			break;
		case 2:
			System.out.println("enter the age");
			String age=sc.next();
			s+="a.age='"+age+c1;
			query(id);
		case 3:
		break;

		default:
			System.out.println("no records update");
			query(id);
		}
		
		return s;
	}

}

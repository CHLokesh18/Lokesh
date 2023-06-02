package ManyToMany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class insert_Many {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("shiva");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		
		Customer c1=new  Customer();
		c1.setId(1);
		c1.setMobile("9398335129");
		c1.setName("shiva");
		
		
		
		
		Customer c2=new Customer();
		c2.setId(2);
		c2.setMobile("991203313");
		c2.setName("prasad");
		
		
		Customer c3=new Customer();
		c3.setId(3);
		c3.setMobile("9542143582");
		c3.setName("lukky");
		
		
		
		Product p1=new Product();
		p1.setP_id(111);
		p1.setP_name("bmw");
		p1.setP_price(4578135);
		
		
		Product p2=new Product();
		p2.setP_id(112);
		p2.setP_name("farari");
		p2.setP_price(45798986);
		
		Product p3=new Product();
		p3.setP_id(14552);
		p3.setP_name("benz");
		p3.setP_price(78945);
		
		List<Customer>li1 = new ArrayList<Customer>();
		li1.add(c1);
		li1.add(c2);
		
		p1.setC(li1);
		
		
		List<Customer>l2 = new ArrayList<Customer>();
		l2.add(c1);
		l2.add(c3);
		l2.add(c3);
		
		p2.setC(l2);
		
		List<Product>l5 =new ArrayList<Product>();
		l5.add(p1);
		l5.add(p3);
		
		c1.setP(l5);
	
		List<Product>l6=new ArrayList<Product>();
		l6.add(p1);
		l6.add(p3);
		l6.add(p2);
		
		c3.setP(l6);
		
	et.begin();
	em.persist(c1);
	em.persist(c2);
	em.persist(c3);
	em.persist(p1);
	em.persist(p2);
	em.persist(p3);
	
	et.commit();
		
		

	}

}

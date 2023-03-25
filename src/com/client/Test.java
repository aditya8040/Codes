package com.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.config.HibernateUtil;
import com.model.Product;

public class Test {
	public static void main(String[] args) {
		SessionFactory sf = HibernateUtil.getSessionFactory();
		
		Session ss = sf.openSession();
		
		Transaction tx = ss.beginTransaction();
		
		Product p1 = new Product();
		p1.setpId(101);
		p1.setpName("SportCars");
		p1.setPQuantity(3);
		
		Product p2 = new Product();
		p2.setpId(201);
		p2.setpName("GenralCars");
		p2.setPQuantity(2);
		
		Product p3 = new Product();
		p3.setpId(301);
		p3.setpName("LuxuryCars");
		p3.setPQuantity(2);
		
		ss.save(p1);
		ss.save(p2);
		ss.save(p3);
		
		tx.commit();
		
//			System.out.println(p1.getpId());
//			System.out.println(p1.getpName());
//			System.out.println(p1.getPQuantity());
//			
//			System.out.println(p2.getpId());
//			System.out.println(p2.getpName());
//			System.out.println(p2.getPQuantity());
//			
//			System.out.println(p3.getpId());
//			System.out.println(p3.getpName());
//			System.out.println(p3.getPQuantity());
			
		
		
		

		
	}

}

package com.client;


import com.model.*;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import com.config.HibernateUtil;

public class RetriveData {
	public static void main(String[] args) {
		SessionFactory sf = HibernateUtil.getSessionFactory();
		
		Session ss = sf.openSession();
		
		String Retrive_Data = "from Product";
		
		Query<Product> q = ss.createQuery(Retrive_Data);
		
		List<Product> l = q.getResultList();
		
		for(Product p :l) {
			System.out.print(p.getpId()+" "+p.getpName()+" "+p.getPQuantity());
			System.out.println();
		}
		
		
		
		
}
}

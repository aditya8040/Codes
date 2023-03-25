package com.client;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.config.HibernateUtil;
import com.model.Product;

public class UpdateData {
	public static void main(String[] args) {
		
		RetriveData r = new RetriveData();
		
		
		SessionFactory sf = HibernateUtil.getSessionFactory();
		
		Session ss = sf.openSession();
		
		Transaction tx = ss.beginTransaction();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter pid of car: ");
		int id = sc.nextInt();
		
		Product p1 = ss.get(Product.class, id);
		System.out.println(p1.getpId());
		System.out.println(p1.getpName());
		System.out.println(p1.getPQuantity());
		
		System.out.println("Enter Quantity: ");
		int quan = sc.nextInt();
		
		int cngquan = p1.getPQuantity()-quan;
	

		
		String Update_Data = "update Product set pQuantity="+cngquan+" where pId=101";
		
	    Query<Product> q = ss.createQuery(Update_Data);
  
		
		  System.out.println(q.executeUpdate());
			
			tx.commit();
			}
	
	}

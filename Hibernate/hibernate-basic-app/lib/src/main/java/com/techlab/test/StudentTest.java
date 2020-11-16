package com.techlab.test;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.techlab.entity.Student;

public class StudentTest {

	public static void main(String[] args) {
		Configuration config = new Configuration();
		SessionFactory factory = config.configure("hibernate.cfg.xml").buildSessionFactory();
		System.out.println(factory.getClass());
		Student s1 = new Student();
		s1.setId();
		s1.setName("rohit");
		s1.setCgpa(8.2f);

		Session session = factory.openSession();
		Transaction transaction = null;

		try {
			transaction = session.beginTransaction();
			session.save(s1);
			transaction.commit();
		} catch (HibernateException ex) {
			transaction.rollback();
		} finally {
			session.close();
		}
		System.out.println("End");
	}
}

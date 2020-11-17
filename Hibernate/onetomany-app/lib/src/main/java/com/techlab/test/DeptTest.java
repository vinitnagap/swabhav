package com.techlab.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.techlab.entity.Department;

public class DeptTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg = new Configuration();
		SessionFactory sessionFactory = cfg.configure().buildSessionFactory();
		Session session = null;
		Transaction transaction = null;

		try {
			session = sessionFactory.openSession();
			Department dept1 = new Department();
//			dept1.setId(101);
//			dept1.setName("Computer");
//			Department dept2 = new Department();
//			dept2.setId(102);
//			dept2.setName("Electronics");
//
//			Employee emp1 = new Employee();
//			emp1.setId(1);
//			emp1.setName("Sachin");
//			emp1.setDept(dept1);
//			Employee emp2 = new Employee();
//			emp2.setId(2);
//			emp2.setName("Rohit");
//			emp2.setDept(dept2);
//
//			dept1.getEmployees().add(emp1);
//			dept2.getEmployees().add(emp2);
//
//			dept1.setEmployees(dept1.getEmployees());
//			dept2.setEmployees(dept2.getEmployees());
			transaction = session.beginTransaction();
//			Department dept = (Department) session.get(Department.class, 101);
//			System.out.println(dept.getName());
			// session.save(dept1);
//			session.save(dept2);
			Department dept = (Department) session.load(Department.class, 101);
			session.delete(dept);
			transaction.commit();
		} catch (Exception ex) {
			if (transaction != null) {
				transaction.rollback();
			}

		} finally {
			if (session.isOpen())
				session.close();
		}
	}

}

package com.techlab.test;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.techlab.entity.Student;

public class StudentCRUDTest {

	public static void main(String[] args) {
		Configuration config = new Configuration();
		SessionFactory factory = config.configure("hibernate.cfg.xml").buildSessionFactory();
		System.out.println(factory.getClass());

		Session session = factory.openSession();
		Transaction transaction = null;

		try {
			transaction = session.beginTransaction();
			add(session, "gopal", 6.2f);
			// add(session, "vinit", 10f);
			// delete(session, "78821649-607c-4e56-8b18-7888afc33be8");
			// update(session, "78821649-607c-4e56-8b18-7888afc33be8", "vinit", 10f);
			printInfo(read(session));

			transaction.commit();
		} catch (HibernateException ex) {
			transaction.rollback();
		} finally {
			session.close();
		}
		System.out.println("End");
	}

	private static void add(Session session, String name, float cgpa) {
		Student s1 = new Student();
		s1.setId();
		s1.setName(name);
		s1.setCgpa(cgpa);
		session.save(s1);
	}

	private static List<Student> read(Session session) {
		List<Student> students = new ArrayList<Student>();
		students = session.createQuery("from Student").list();
		return students;
	}

	private static void delete(Session session, String id) {
		Student student = (Student) session.load(Student.class, id);
		session.delete(student);
	}

	public static void update(Session session, String id, String name, float cgpa) {
		Student student = (Student) session.load(Student.class, id);
		student.setName(name);
		student.setCgpa(cgpa);
		session.update(student);

	}

	private static void printInfo(List<Student> students) {
		for (Student student : students) {
			System.out
					.println("Id: " + student.getId() + " Name: " + student.getName() + " Cgpa: " + student.getCgpa());
		}
	}

}

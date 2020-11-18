package com.techlabs.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.techlabs.entity.Student;

@Repository
@Transactional
public class StudentRepository {

	private List<Student> students = null;
	@Autowired
	private SessionFactory factory;

	public List<Student> getStudents() {
		students = factory.getCurrentSession().createQuery("from Student").list();
		return students;
	}

	public void addStudent(Student s) {
		factory.getCurrentSession().save(s);
	}

	public void updateStudent(Student student) {
		Student s = getStudentById(student.getId());
		s.setName(student.getName());
		s.setAge(student.getAge());
		s.setRollno(student.getRollno());
		factory.getCurrentSession().update(s);
	}

	public void deleteStudent(String id) {
		Student s = getStudentById(id);
		factory.getCurrentSession().delete(s);
	}

	public Student getStudentById(String id) {
		getStudents();
		for (Student s : students) {
			if (s.getId().equals(id)) {
				return s;
			}
		}
		return null;
	}
}
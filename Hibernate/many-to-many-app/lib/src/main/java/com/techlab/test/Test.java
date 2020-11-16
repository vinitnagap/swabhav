package com.techlab.test;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.techlab.entity.Actor;
import com.techlab.entity.Movie;

public class Test {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		SessionFactory sessionFactory = cfg.configure().buildSessionFactory();
		Session session = null;
		Transaction transaction = null;

		try {
			session = sessionFactory.openSession();
			Actor ranveer = new Actor();
			ranveer.setId(1);
			ranveer.setName("Ranveer");
			Actor deepika = new Actor();
			deepika.setId(2);
			deepika.setName("Deepika");

			Movie m1 = new Movie();
			m1.setId(101);
			m1.setName("abc");
			Movie m2 = new Movie();
			m2.setId(102);
			m2.setName("xyz");

			Set<Movie> ranveerMovie = new HashSet<Movie>();
			ranveerMovie.add(m1);
			ranveerMovie.add(m2);
			ranveer.setMovies(ranveerMovie);

			Set<Movie> deepikaMovie = new HashSet<Movie>();
			deepikaMovie.add(m1);
			deepikaMovie.add(m2);
			deepika.setMovies(deepikaMovie);
			Set<Actor> movieActors = new HashSet<Actor>();
			movieActors.add(ranveer);
			movieActors.add(deepika);
			m1.setActors(movieActors);
			m2.setActors(movieActors);
			transaction = session.beginTransaction();
			session.save(ranveer);
			session.save(deepika);
			session.save(m1);
			session.save(m2);
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

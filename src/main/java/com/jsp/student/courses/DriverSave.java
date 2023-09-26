package com.jsp.student.courses;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DriverSave {
	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vedant");

		EntityManager entityManager = entityManagerFactory.createEntityManager();

		EntityTransaction entityTransaction = entityManager.getTransaction();

		Course c1 = new Course();
		c1.setCourse_name("Core Java");
		c1.setDuration(2);

		Course c2 = new Course();
		c2.setCourse_name("WebTech");
		c2.setDuration(1);

		Course c3 = new Course();
		c3.setCourse_name("SQL");
		c3.setDuration(3);

		List<Course> courses = new ArrayList<Course>();
		courses.add(c1);
		courses.add(c2);
		courses.add(c3);

		
		Student s1 = new Student();
		s1.setName("vedant");
		s1.setEmail("ved@gmail.com");

		Student s2 = new Student();
		s2.setName("sam");
		s2.setEmail("sam@gmail.com");

		Student s3 = new Student();
		s3.setName("vipul");
		s3.setEmail("vips@gmail.com");

		Student s4 = new Student();
		s4.setName("hamza");
		s4.setEmail("hams@gmail.com");

		List<Student> students = new ArrayList<Student>();
		students.add(s1);
		students.add(s2);
		students.add(s3);
		students.add(s4);

		s1.setCourses(courses);
		s2.setCourses(courses);
		s3.setCourses(courses);
		s4.setCourses(courses);

		c1.setStudents(students);
		c2.setStudents(students);
		c3.setStudents(students);

		entityTransaction.begin();
		entityManager.persist(s1);
		entityManager.persist(s2);
		entityManager.persist(s3);
		entityManager.persist(s4);
		entityTransaction.commit();
	}

}

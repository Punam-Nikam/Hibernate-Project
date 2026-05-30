package com.hibernateLearning;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
//import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class FetchData {

    public static void main(String[] args) {

        SessionFactory factory = new Configuration()
                .addAnnotatedClass(Student.class)
                .configure()
                .buildSessionFactory();

        Session session = factory.openSession();

        Student a1 = session.find(Student.class,104);

        System.out.println(a1);

        factory.close();
    }
}
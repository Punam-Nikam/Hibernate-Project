package com.hibernateLearning;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {

        Student a1 = new Student();
        a1.setAid(106);
        a1.setAname("Bhuvneshwar kumar");
        a1.setTech("Flutter");

        // hey hibernate save data with a1 object

      /*  Configuration config = new Configuration();
        config.configure();
        config.addAnnotatedClass(com.hibernateLearning.Alien.class);
       */   //instead of these 3 line we can write one line as ;-

//Here -- >
        //SessionFactory factory = config.buildSessionFactory();
        SessionFactory factory = new Configuration()
                .addAnnotatedClass(Student.class)
                .configure()
                .buildSessionFactory();

        Session session = factory.openSession();

        Transaction transaction = session.beginTransaction();

        session.persist(a1);

        transaction.commit();
        factory.close();
    }
}
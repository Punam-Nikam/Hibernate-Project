package com.hibernateLearning;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class UpdateData {

        public static void main(String[] args) {

            Student a1 = new Student();
            a1.setAid(103);
            a1.setAname("DevDutt padikal");
            a1.setTech("Spring Boot");

            SessionFactory factory = new Configuration()
                    .addAnnotatedClass(Student.class)
                    .configure()
                    .buildSessionFactory();

            Session session = factory.openSession();

            Transaction transaction = session.beginTransaction();

            session.merge(a1);

            transaction.commit();

            session.close();
            factory.close();
        }
    }
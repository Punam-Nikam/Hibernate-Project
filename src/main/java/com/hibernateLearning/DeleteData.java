package com.hibernateLearning;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DeleteData {
    public static void main(String[] args) {

//        Alien a1= new Alien();
//        a1.setAid(102);
//        a1.setAname("Dev");
//        a1.setTech("Python");

        SessionFactory fact = new Configuration()
                .addAnnotatedClass(Student.class)
                .configure()
                .buildSessionFactory();

        Session ss = fact.openSession();

        Transaction ts = ss.beginTransaction();

        Student a1 = ss.find(Student.class,106);
        ss.remove(a1);

        ts.commit();
        ss.close();
        fact.close();
    }
}

package com.harsh;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setsName("Dhoni");
        s1.setRollNo(104);
        s1.setsAge(30);

        // save(s1);
        Configuration cfg = new Configuration();
        cfg.addAnnotatedClass(com.harsh.Student.class);
        //cfg.configure(); Error : Could not locate cfg.xml resource [hibernate.cfg.xml]
        cfg.configure();
        SessionFactory sf = cfg.buildSessionFactory();
        Session session = sf.openSession();

        Transaction transaction = session.beginTransaction();

        session.persist(s1);

        transaction.commit();

        System.out.println(s1);
    }
}

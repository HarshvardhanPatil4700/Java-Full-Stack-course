package com.harsh;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setsName("Sachin");
        s1.setRollNo(105);
        s1.setsAge(35);

        Student s2 = null;
        Student s3 = null;

        // save(s1);
//        Configuration cfg = new Configuration();
//        cfg.addAnnotatedClass(com.harsh.Student.class);
//        //cfg.configure(); Error : Could not locate cfg.xml resource [hibernate.cfg.xml] So make a new file in resources folder as hibernate.cfg.xml and then run
//        cfg.configure();

//        SessionFactory sf = cfg.buildSessionFactory();// Sessionfactory is heavy weight object which consumes many resources so either close the SessionFactory object or use tryWithResource

        // Also above line can be refactored as :
        SessionFactory sf = new Configuration()
                .addAnnotatedClass(com.harsh.Student.class)
                .configure().buildSessionFactory();

        Session session = sf.openSession();

        // To Fetch the data : session.find(); is used in Hibernate / JPA to fetch a record from the database by its primary key. Explanation: session → database interaction object, Student.class → entity (table mapping)i.e Fetch data from the table mapped to the Student class(Class reference and no object created), 102 → primary key (ID)

        // session.get(); This method used to fetch data but it is now deprecated instead we use:
        // session.find(102); returns error as no data type is mentioned
        s2 = session.find(Student.class, 102); // returns object of Student class so reference of s2
        s3 = session.find(Student.class, 110); // if we try to get the object that is not present (eg:110 is not present in DB) then it returns null

//        Transaction transaction = session.beginTransaction(); // used in Hibernate to start a database transaction (manipulation in DB)
//
//        session.persist(s1);


//        transaction.commit();
        session.close();
        sf.close();
        System.out.println(s2);
        System.out.println(s3);
        // System.out.println(s3.getsName()); Gives EXCEPTION that can be handled as :
        try {
            System.out.println(s3.getsName());
        } catch (NullPointerException e) {
            System.out.println("Student not found (Null value)");
        }
    }
}

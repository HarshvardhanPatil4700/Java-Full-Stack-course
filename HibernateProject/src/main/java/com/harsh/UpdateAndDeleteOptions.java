package com.harsh;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class UpdateAndDeleteOptions {
    public static void main(String[] args) {
        // Updating data :
        Student s1 = new Student();
        s1.setsName("Harshvardhan");
        s1.setRollNo(106);
        s1.setsAge(23);

        // when we try to update the data that is not present in DB then the merge() function works as if present then update and if not present then create it. Hence, it will create new entry in DB using insert into command
        Student s2 = new Student();
        s2.setsName("Amit");
        s2.setRollNo(109);
        s2.setsAge(30);

        Student s3 = null;
        // when we try to delete the data that is not present in DB then it gives an EXCEPTION

        SessionFactory sf = new Configuration()
                .addAnnotatedClass(com.harsh.Student.class)
                .configure().buildSessionFactory();

        Session session = sf.openSession();

        Transaction transaction = session.beginTransaction();

        // To update the age of Student: session.update(); this method is deprecated
        session.merge(s1); // this does not change the data in DB for that we need to create Transaction object(as done above)
        session.merge(s2);

        // To delete the data : session.delete() is deprecated.We have 2 options : 1)Fetch and delete 2) directly pass the object. Deleting of object is done by Hibernate using delete command
        s3 = session.find(Student.class,109); // fetching data to delete
        session.remove(s3); // deleting the fetched data

        transaction.commit();
        session.close();
        sf.close();
        System.out.println(s1);
    }
}


package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class App
{
    public static void main( String[] args )
    {
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();
        Transaction tr = session.beginTransaction();
        Student student = new Student();
        student.setName("Marry");
        student.setCity("Texas");
        student.setState("Los Vegas");
        SchoolDetails schoolDetails = new SchoolDetails();
        schoolDetails.setSchoolAddress("12th street, Andrew wade,Texas,USA");
        schoolDetails.setSchoolName("Brington School of Education");
        schoolDetails.setPinCode(100256);
        student.setSchoolDetails(schoolDetails);
        session.save(student);
        //session.save(schoolDetails);
        tr.commit();
        session.close();
        factory.close();


    }
}

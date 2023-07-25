package com.hibernate;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;
import org.hibernate.engine.spi.ExecuteUpdateResultCheckStyle;
import org.hibernate.query.NativeQuery;
import org.hibernate.query.Query;
import org.hibernate.service.ServiceRegistry;


import javax.accessibility.AccessibleRelation;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.Arrays;
import java.util.Date;

public class App
{
    public static void main( String[] args )
    {
        StandardServiceRegistry registry =
                new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
        Metadata metadata= new MetadataSources(registry).getMetadataBuilder().build();
        SessionFactory sessionFactory = metadata.getSessionFactoryBuilder().build();
        Session session = sessionFactory.openSession();
        Query q = session.createQuery("from Student");
        q.setFirstResult(2);
        q.setMaxResults(15);
        List<Student> studentList = (List<Student>) q.getResultList();

        for(Student s : studentList)
        {
            System.out.println(s.getName());

        }
        //Using Criteria to add some filters
        Criteria criteria = session.createCriteria(Student.class,"from Student");
        criteria.add(Restrictions.eq("name","raja"));

        List<Student> studentList1 = criteria.list();
        for(Student s : studentList1)
        {
            System.out.println(s.getName());
        }
        session.close();
        sessionFactory.close();


    }
}

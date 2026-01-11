package com.chhavi;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
   public static void main(String[] args) throws HibernateException {
//        Allen a1=new Allen();
//        a1.setAid(101);
//        a1.setAname("Chhavi");
//        a1.setTech("Java");

        Configuration config=new Configuration();
        config.addAnnotatedClass(com.chhavi.Allen.class);

        config.configure("hibernate.cfg.xml");

        SessionFactory factory= config.buildSessionFactory();

        Session session=factory.openSession();
//        Transaction transcation=session.beginTransaction();
        Allen a1=session.find(Allen.class , 101);
        System.out.println(a1);
//        session.persist(a1);
//        transcation.commit();
    }
}
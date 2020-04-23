package com.bmc.chatbot.database;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;



public class CheckDb {
    public void Connectivity()
    {
    context context=new context();
    context.setUsername("Rishav");
    context.setContextid("123");
    context.setSessionid("111");
    
    
    
   Configuration con= new Configuration().configure("cfg.xml").addAnnotatedClass(context.class);
   ServiceRegistry sr = new StandardServiceRegistryBuilder().applySettings(con.getProperties()).build();
 //  ServiceRegistry reg= new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
    SessionFactory sf = con.buildSessionFactory();
    Session session =sf.openSession();
    Transaction tx = session.beginTransaction();
    session.save(context);
    //session.save(transcript);
    //session.save(feedback);   
    tx.commit();
    }
}

package com.robby.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil{
  /**
   * sessionFactory是单例的
   */
  private static SessionFactory factory = null;
  static {
    factory = new Configuration().configure().buildSessionFactory();
  }
  public static Session openSession(){
    return factory.openSession();
  }
  
}

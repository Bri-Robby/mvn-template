package com.robby.test;

import junit.framework.Assert;

import org.hibernate.Session;
import org.junit.Test;

import com.robby.util.HibernateUtil;
import com.robby.vo.User;

public class TestUser {
  @Test
  public void testAdd(){
//    Session session = HibernateUtil.openSession();
//    session.beginTransaction();
//    User user = new User();
//    user.setUsername("admin");
//    user.setPassword("123");
//    user.setNickname("超级管理员");
//    user.setEmail("admin@admin.com");
//    session.save(user);
//    Assert.assertTrue(user.getId()>0);
//    session.getTransaction().commit();
  }
  @Test
  public void testLoad(){
    Session session = HibernateUtil.openSession();
    session.beginTransaction();
    User user = (User)session.load(User.class, 1);
    Assert.assertEquals(1, user.getId());
    Assert.assertTrue(user.getId()>0);
    session.getTransaction().commit();
  }
}

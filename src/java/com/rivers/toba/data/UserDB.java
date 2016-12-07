/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rivers.toba.data;

import com.rivers.toba.user.User;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;

/**
 *
 * @author jpriv
 */
public class UserDB {
    public static void insert(User user){
        EntityManager em = DBUtil.getEmFactory().createEntityManager();
        EntityTransaction trans = em.getTransaction();
        
        try{
            trans.begin();
            em.persist(user);
            trans.commit();
        }catch(Exception ex){
            System.out.println(ex);
            trans.rollback();
        }finally{
            em.close();
        }
    }
    
    public static void update(User user){
        EntityManager em = DBUtil.getEmFactory().createEntityManager();
        EntityTransaction trans = em.getTransaction();
        
        try{
            trans.begin();
            em.merge(user);
            trans.commit();
        }catch(Exception ex){
            System.out.println(ex);
            trans.rollback();
        }finally{
            em.close();
        }
    }
    
    public static User selectUser(String username){
         EntityManager em = DBUtil.getEmFactory().createEntityManager();
         String qString = "select u from user u " + "where u.username = :username";
         TypedQuery<User> q = em.createQuery(qString, User.class);
         q.setParameter("username", username);
         
         try{
             User user = q.getSingleResult();
             return user;
         }catch(NoResultException e){
             return null;
         }finally{
             em.close();
         }
    }
    
    public static List<User> selectUsers(){
        
         EntityManager em = DBUtil.getEmFactory().createEntityManager();
         String qString = "select u from Users u";
         TypedQuery<User> q = em.createQuery(qString, User.class);
         
         
         List<User> users;
         try{
             users = q.getResultList();
             if(users == null || users.isEmpty()){
                 users = null;
             }
             
         }catch(NoResultException e){
             return null;
         }finally{
             em.close();
         }
         return users;
    }
    
    public static boolean usernameExists(String username){
        User u = selectUser(username);
        return u != null;
    }
}


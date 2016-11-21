/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rivers.toba.data;

import com.rivers.toba.user.Account;
import com.rivers.toba.user.User;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;

/**
 *
 * @author jpriv
 */
public class AccountDB {
    public static void insert(Account account){
        EntityManager em = DBUtil.getEmFactory().createEntityManager();
        EntityTransaction trans = em.getTransaction();
        
        try{
            trans.begin();
            em.persist(account);
            trans.commit();
        }catch(Exception ex){
            System.out.println(ex);
            trans.rollback();
        }finally{
            em.close();
        }
    }
    
     public static void update(Account account){
        EntityManager em = DBUtil.getEmFactory().createEntityManager();
        EntityTransaction trans = em.getTransaction();
        
        try{
            trans.begin();
            em.merge(account);
            trans.commit();
        }catch(Exception ex){
            System.out.println(ex);
            trans.rollback();
        }finally{
            em.close();
        }
    }
    
    public static List<Account> selectAccts(int userId){
        
         EntityManager em = DBUtil.getEmFactory().createEntityManager();
         String qString = "select a from Account a where a.user.userId = " + userId;
         TypedQuery<Account> q = em.createQuery(qString, Account.class);
         
         
         List<Account> accounts;
         try{
             accounts = q.getResultList();
             if(accounts == null || accounts.isEmpty()){
                 accounts = null;
             }
             
         }catch(NoResultException e){
             return null;
         }finally{
             em.close();
         }
         return accounts;
    }
}

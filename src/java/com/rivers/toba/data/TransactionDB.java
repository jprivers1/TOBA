/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rivers.toba.data;

import com.rivers.toba.user.Account;
import com.rivers.toba.user.Transactions;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;
import static org.eclipse.persistence.sessions.SessionProfiler.Transaction;

/**
 *
 * @author jpriv
 */
public class TransactionDB {
    public static void insert(Transactions transaction){
        EntityManager em = DBUtil.getEmFactory().createEntityManager();
        EntityTransaction trans = em.getTransaction();
        
        try{
            trans.begin();
            em.persist(transaction);
            trans.commit();
        }catch(Exception ex){
            System.out.println(ex);
            trans.rollback();
        }finally{
            em.close();
        }
    }
    
     public static void update(Transactions transaction){
        EntityManager em = DBUtil.getEmFactory().createEntityManager();
        EntityTransaction trans = em.getTransaction();
        
        try{
            trans.begin();
            em.merge(transaction);
            trans.commit();
        }catch(Exception ex){
            System.out.println(ex);
            trans.rollback();
        }finally{
            em.close();
        }
    }
    
    public static List<Transactions> selectTransactions(int accountId){
        
         EntityManager em = DBUtil.getEmFactory().createEntityManager();
         String qString = "select t from Transactions t where t.accountId = " + accountId;
         TypedQuery<Transactions> q = em.createQuery(qString, Transactions.class);
         
         
         List<Transactions> transactions;
         try{
             transactions = q.getResultList();
             if(transactions == null || transactions.isEmpty()){
                 transactions = null;
             }
             
         }catch(NoResultException e){
             return null;
         }finally{
             em.close();
         }
         return transactions;
    }
    
}

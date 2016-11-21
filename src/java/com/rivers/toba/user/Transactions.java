/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rivers.toba.user;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author jpriv
 */

@Entity
@Table(name = "transactions")
public class Transactions implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int TransactionId;
    int accountId;
    float amount;

    public Transactions(){
        
    }
    
    public Transactions(int accountId, float amount) {
        this.accountId = accountId;
        this.amount = amount;
    }

    
    
    public int getTransactionId() {
        return TransactionId;
    }

    public void setTransactionId(int TransactionId) {
        this.TransactionId = TransactionId;
    }

    

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    
    
    
    
    
}

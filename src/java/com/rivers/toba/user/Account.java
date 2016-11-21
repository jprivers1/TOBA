/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rivers.toba.user;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author jpriv
 */
@Entity
@Table(name = "account")
public class Account implements Serializable {

    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int accountId;
    private String accountType;
    private float balance;
    
    @ManyToOne
    private User user;
    
    @OneToMany(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
    private List<Transactions> transactions;
   
    
   
    
    
    public Account(){
        this.accountType = "";
        this.balance = 0.0f;
        this.user = null;
    }
    
    public Account(String acctType, float balance, User user){
        this.accountType = acctType;
        this.balance = balance;
        this.user = user;
        
    }
    
    public List<Transactions> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<Transactions> transactions) {
        this.transactions = transactions;
    }

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
    
    
    public void credit(float amount){
        balance += amount;
    }
    
    public void debit(float amount){
        balance -= amount;
    }
    
    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }
    
    
}

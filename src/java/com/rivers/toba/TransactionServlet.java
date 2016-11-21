/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rivers.toba;

import com.rivers.toba.data.AccountDB;
import com.rivers.toba.data.TransactionDB;
import com.rivers.toba.user.Account;
import com.rivers.toba.user.Transactions;
import com.rivers.toba.user.User;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author jpriv
 */
public class TransactionServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String url;
        
        //Pull data from form
        String action = request.getParameter("action");
        String fromAcct = request.getParameter("fromAcct");
        String toAcct = request.getParameter("toAcct");
        float transferAmt = Float.parseFloat(request.getParameter("transferAmt"));
        
        HttpSession session = request.getSession();           
        User user = (User)session.getAttribute("user");
        
        //Pull accounts from DB
        List<Account> accounts = AccountDB.selectAccts(user.getUserId());
        
        Account savings = accounts.get(0);
        Account checking = accounts.get(1);
        
        //credit or debit accounts accordingly
        if(fromAcct.equals("checking")){
            checking.debit(transferAmt);
            savings.credit(transferAmt);
            Transactions transaction = new Transactions(checking.getAccountId(), transferAmt);
            TransactionDB.insert(transaction);
        }else{
            checking.credit(transferAmt);
            savings.debit(transferAmt);
            Transactions transaction = new Transactions(savings.getAccountId(), transferAmt);
            TransactionDB.insert(transaction);
        }
        
//TODO: update account activity page to display all transactions
        List<Transactions> trans = checking.getTransactions();
        List<Transactions> trans2 = savings.getTransactions();
        
        
        AccountDB.update(checking);
        AccountDB.update(savings);
        
        session.setAttribute("checking", checking);
        session.setAttribute("savings", savings);
        
        url = "/account_activity.jsp";
       
         //Send user to appropriate page
        getServletContext()
                    .getRequestDispatcher(url)
                    .forward(request, response);
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

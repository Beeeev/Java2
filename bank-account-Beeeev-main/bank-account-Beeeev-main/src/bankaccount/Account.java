/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bankaccount;
import java.util.Date;
/**
 *
 * @author Levi
 */
public class Account {
    
    //vars
    private int ID = 0;
    private double balance = 0;
    private double annualInterestRate = 0;
    private double monthlyInterestRate;
    Date dateCreated = new Date();
    
    //default constructor
    public Account()
    {
        
    }
    //constructor with params
    public Account(int ID, double balance, double annualInterestRate)
    {
        this.ID = ID;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }
    //get and set ID
    public int getID()
    {
        return ID;
    }
    public void setID(int ID)
    {
        this.ID = ID;
    }
    
    //get and set Balance
    public double getBalance()
    {
        return balance;
    }
    public void setBalance()
    {
        this.balance = balance;
    }
    
    //get and set AnnualInterestRate
    public double getAnnualInterestRate()
    {
        return annualInterestRate;
    }
    public void setAnnualInterestRate()
    {
        this.annualInterestRate = annualInterestRate;
    }
    
    //get date
    public String getDate()
    {
        return dateCreated.toString();
    }
    
    //get and set MonthlyInterestRate
    public double getMonthlyInterestRate()
    {
        return monthlyInterestRate;
    }
    public void setMonthlyInterestRate()
    {
        annualInterestRate = annualInterestRate / 100;
        monthlyInterestRate = annualInterestRate / 12;
        this.monthlyInterestRate = monthlyInterestRate;
    }
    //get MonthlyInterest
    public double getMonthlyInterest()
    {
        double monthlyInterest = balance * monthlyInterestRate;
        return monthlyInterest;
    }
    
    //Method to withdraw from account, if overdrawn send message
    public double withdrawFromAccount(double amount)
    {
        if(amount > balance)
        {
            System.out.println("You are trying to withdraw too much money");
        }
        else
        {
            balance = balance - amount;
        }
        return balance;
    }
    
    //method to deposit into bank account
    public double depositIntoAccount(double amount)
    {
        balance = balance + amount;
        return balance;
    }
}

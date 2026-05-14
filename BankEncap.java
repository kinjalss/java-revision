package com.revision.in;

public class BankEncap {
    private double balance;
    private String accountNumber;

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if(balance>=0) {
            this.balance = balance;
        }
        else{
            System.out.println("Invalid balance");
        }
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
    public void deposit(int amount){
        balance=balance+amount;
    }//paise takne
    public void withdraw(int amount){
        if(amount<=balance) {
            balance = balance - amount;
            System.out.println("Balance after withdrawn:"+balance);
        }
        else{
            System.out.println("Insufficient balance");
        }
    }//paise kadhne
}

package com.revision.in;

public class BEMsin {
    public static void main(String[] args) {
        BankEncap b=new BankEncap();
        b.setAccountNumber("SOE234");
        b.setBalance(1000000);
        System.out.println("Account number:"+b.getAccountNumber());
        System.out.println("Balance:"+b.getBalance());

        b.withdraw(200000);

    }
}

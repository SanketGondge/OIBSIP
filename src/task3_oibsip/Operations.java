package task3_oibsip;

import java.util.Scanner;

public class Operations {

    Scanner sc = new Scanner(System.in);

    public void withdraw(Account acc) {
        System.out.print("Enter amount to withdraw: ");
        double amt = sc.nextDouble();

        if (amt <= acc.getBalance()) {
            acc.setBalance(acc.getBalance() - amt);
            System.out.println("Withdraw Successful");
            System.out.println("Balance: " + acc.getBalance());
        } else
        {
            System.out.println("Insufficient Balance");
        }
    }

    public void deposit(Account acc) {
        System.out.print("Enter amount to deposit: ");
        double amt = sc.nextDouble();

        acc.setBalance(acc.getBalance() + amt);
        System.out.println("Deposit Successful");
        System.out.println("Balance: " + acc.getBalance());
    }

    public void transfer(Account acc) {
        System.out.print("Enter transfer amount: ");
        double amt = sc.nextDouble();

        if (amt <= acc.getBalance()) {
            acc.setBalance(acc.getBalance() - amt);
            System.out.println("Transfer Successful");
            System.out.println("Balance: " + acc.getBalance());
        } else 
        {
        	
            System.out.println("Insufficient Balance");
        }
    }
}

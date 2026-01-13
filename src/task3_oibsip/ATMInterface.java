package task3_oibsip;

import java.util.Scanner;

public class ATMInterface {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter User ID: ");
        String id = sc.next();
        System.out.print("Enter PIN: ");
        String pin = sc.next();

        if(id.equals("Myaccount") && pin.equals("00014")) {
            System.out.println("Login Successful");

            Account account = new Account();
            Show menu = new Show();
            Operations op = new Operations();

            int choice;
            do {
                menu.showMenu();
                choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        ShowTransaction.showHistory();
                        break;

                    case 2:
                        op.withdraw(account);
                        break;

                    case 3:
                        op.deposit(account);
                        break;

                    case 4:
                        op.transfer(account);
                        break;

                    case 5:
                        System.out.println("Thank you for using ATM");
                        break;

                    default:
                        System.out.println("Invalid choice");
                }

            } while (choice != 5);

        } else 
        {
            System.out.println("Invalid Credentials");
        }
        sc.close();
		

	}

}

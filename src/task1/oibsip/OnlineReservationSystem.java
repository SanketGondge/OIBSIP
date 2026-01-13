package task1.oibsip;
import java.util.ArrayList;

import java.util.Scanner;


public class OnlineReservationSystem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> data = new ArrayList<>();
		int pnr = 1001001;
		System.out.println("online Reservation System");
		System.out.println("Enter Username :");
		String id = sc.next();
		System.out.println("Enter the Password :");
		String pass = sc.next();
		
		if(!id.equals("sanket") || !pass.equals("1*2*3*"))
		{
			System.out.println("login failed");
			return;
		}
		int choice = 0;

		while (choice != 3) {
		    System.out.println("1. Reservation");
		    System.out.println("2. cancellation");
		    System.out.println("3. exit");
		    System.out.print("Enter choice: ");
		    choice = sc.nextInt();
		    
		    if (choice == 1) {

			    System.out.println("Enter Passenger Name : ");
			    String name = sc.next();
			    System.out.println("Enter From : ");
			    String from = sc.next();
			    System.out.println("Enter To : ");
			    String to = sc.next();
			    pnr++;
			    String ticket = pnr + " " + name + " " + from + " " + to;
			    data.add(ticket);

			    System.out.println("Reservation Successfully done");
			    System.out.println("Your pnr Number is : " + pnr);
			}
		    else if (choice == 2) {

		        System.out.println("Enter pnr to Cancel : ");
		        String cancelPNR = sc.next();

		        boolean found = false;

		        for (int i = 0; i < data.size(); i++) {
		            if (data.get(i).startsWith(cancelPNR)) {
		                data.remove(i);
		                found = true;
		                System.out.println("Reservation is cancelled ");
		                break;
		            }
		        }

		        if (!found) 
		        {
		            System.out.println("PNR Not Found");
		        }
		        else if (choice == 3) 
		        {
		            System.out.println("Thank you");
		        }

		    }


		    
		}
		

		
		
		
		

	}

}

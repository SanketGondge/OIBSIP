package onlineexamination;

import java.util.Scanner;

public class OnlineExam {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Online Examination System");
		System.out.println("Enter the username :");
		String user = sc.next();	
		System.out.println("Enter the password :");
		String pwd = sc.next();
		
		if(user.equals("sanketg") && pwd.equals("123456")) {
			System.out.println("Login Successfull");
			System.out.println("Interface");
			System.out.println(" 1.Updated username");
			System.out.println("2.Updated password");
			System.out.println("3.start exam");
			System.out.println("4.logout");
			System.out.println("Enter your choice :");
			int choice = sc.nextInt();
			int score = 0;
			char ans;

			
			switch(choice) {
			case 1:
				System.out.println("Enter new username:");
			    user = sc.next();   
			    System.out.println("Username updated successfully");
			    break;
			case 2:
				 System.out.println("Enter new password:");
		         pwd = sc.next();   
		         System.out.println("Password updated successfully");
             	 break;
			case 3:
				System.out.println("Exam Started");
			    System.out.println("You have 45 seconds");

			  
			    System.out.println("Q1. OOPs Stands for?");
			    System.out.println("a) Organization lanuage ");
			    System.out.println("b) Object Oreianted Programming Language");
			    System.out.println("c) Abstraction");
			    System.out.println("d) None of the above");
			    ans = sc.next().charAt(0);
			    if(ans == 'b') {
			        score++;
			    }

			    
			    System.out.println("Q2. What is syntax for Scanner class?");
			    System.out.println("a) import scanner.*");
			    System.out.println("b) public static = new scanner ");
			    System.out.println("c) Scanner sc = new Scanner(System.in);");
			    System.out.println("d) None of the above ");
			    ans = sc.next().charAt(0);
			    if(ans == 'c') {
			        score++;
			    }

			   
			    System.out.println("Q3. Which is not a datatype?");
			    System.out.println("a) int");
			    System.out.println("b) float");
			    System.out.println("c) String");
			    System.out.println("d) print");
			    ans = sc.next().charAt(0);
			    if(ans == 'd') {
			        score++;
			    }
			     
			    
			    System.out.println("Q4. who invented Java Language?");
			    System.out.println("a) James Gosling");
			    System.out.println("b) Guido van Rossum ");
			    System.out.println("c) Jordan Walke");
			    System.out.println("d) Non of the above  ");
			    ans = sc.next().charAt(0);
			    if(ans == 'b') {
			        score++;
			    }

			    System.out.println("Time Over! Exam Submitted Automatically");
			    System.out.println("Your Score is: " + score + "/4");
			    break;
			case 4:
				System.out.println("logout");
				break;
			default:
				System.out.println("Incorrect choice");
			}
			
			
		}
		else 
		{
			System.out.println("Login Invalid");
			
		}
		
		
		

	}

}

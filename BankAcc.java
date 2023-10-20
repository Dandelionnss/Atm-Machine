package practice;

import java.util.Scanner;
import java.time.LocalTime;
import java.time.LocalDate;
public class BankAcc {

	public static void main(String[] args) {
		
		// Import Items //
		Scanner user = new Scanner(System.in);
		LocalTime time = LocalTime.now();
		LocalDate date = LocalDate.now();
		
		// Data type with value //
		int cash = 30000, pin = 91004, acc = 102270012;
		
		
		// User input pin //
		System.out.print("Enter your Pin : ");
		int pin1 = user.nextInt();
		
		// Comparing the Two Pins //
		if (pin == pin1) {
			
			System.out.println("\n1. View Balance");
			System.out.println("2. Deposit Money");
			System.out.println("3. Withdraw Money");
			System.out.println("4. Pin services");
			
			// User Should Enter the type of Transaction //
			System.out.print("\nChoose Transactions : ");
			int transaction = user.nextInt();
			
			switch (transaction) {
			
			case 1: // Case 1 //
						System.out.println("\nAccount number : " + acc);
						System.out.println("Date : " + date);
						System.out.println("Time : " + time);
						System.out.println("--------------------------------");
						System.out.println("Account Balance : " + cash);
						System.out.println("--------------------------------");
						System.out.println("\nThank you for Banking with Us...");
						break;
				
			case 2: // Case 2 //
						System.out.println("\nDo you want to receive a receipt?...");
						System.out.println("\n 1. Yes | 2. No");
						System.out.print("\nResponse : ");
						int response = user.nextInt();
						switch (response) {
				
						case 1: 
							System.out.println("\nBalance : " + cash);
							System.out.print("\nEnter The Amount to Deposit : ");
							int depos = user.nextInt();
							System.out.println("\nDeposited : " + depos);
							int current = cash + depos;
							System.out.println("\nCurrent Balance : " + current );
								
							// Displaying the receipt //
							System.out.println("\n*********** Receipt ***************");
							System.out.println("	BBM ATM BANKING		");
							System.out.println("Account Number : " + acc );
							System.out.println("Date : " + date);
							System.out.println("Time : " + time);
							System.out.println("--------------------------------");
							System.out.println("Balance : " + cash);
							System.out.println("Deposited : " + depos );
							System.out.println("--------------------------------");
							System.out.println("UPDATED BALANCE : " + current );
							System.out.println("--------------------------------");
							System.out.println("Thank you for Banking with Us...");
							break;
							
						case 2:
							System.out.println("\nBalance : " + cash);
							System.out.print("\nEnter The Amount to Deposit : ");
							depos = user.nextInt();
							System.out.println("\nDeposited : " + depos);
							current = cash + depos;
							System.out.println("\n--------------------------------");
							System.out.println("UPDATED BALANCE : " + current );
							System.out.println("--------------------------------");
							System.out.println("\nThank you for Banking with Us...");
							break;
								
						default: 
							System.out.println("\nYou Entered a Wrong Response...");
							
					}
					break;
				
			case 3: // Case 3
					System.out.println("\nDo you want to receive a receipt Copy?...");
					System.out.println("\n 1. Yes | 2. No");
					System.out.print("\nResponse : ");
					response = user.nextInt();
				
					// Executing Commands //
					switch (response) {
				
					case 1:
					
						System.out.println("\nBalance : " + cash);
						System.out.print("\nEnter the Amount to Withdraw : " );
						int withdraw = user.nextInt();
						
						// Comparing the amount to withdraw //
						if (cash >= withdraw) {
							int current = cash - withdraw;
							System.out.println("\nCollect : " + withdraw);
								
							// Displaying Receipt //
							System.out.println("\n*********** Receipt ***************");
							System.out.println("	BBM ATM BANKING		");
							System.out.println("Account Number : " + acc );
							System.out.println("Date : " + date);
							System.out.println("Time : " + time);
							System.out.println("--------------------------------");
							System.out.println("Balance : " + cash);
							System.out.println("Withdrew : " + withdraw );
							System.out.println("--------------------------------");
							System.out.println("UPDATED BALANCE : " + current );
							System.out.println("--------------------------------");
							System.out.println("Thank you for Banking with Us...");
						
						
						}else {
							
							System.out.println("\nInufficient Account Amount... Please Try Again>>");
							
						}
						break;
					
					case 2:
							System.out.println("\nBalance : " + cash);
							System.out.print("\nEnter the Amount to Withdraw : " );
							withdraw = user.nextInt();
					
							// Comparing the amount to withdraw //
							if (cash >= withdraw) {
								int current = cash - withdraw;
								System.out.println("\nCollect : " + withdraw);
								System.out.println("--------------------------------");
								System.out.println("UPDATED BALANCE : " + current );
								System.out.println("--------------------------------");
								System.out.println("\nThank you for Banking with Us...");
						
							}else {
								
								System.out.println("\nInufficient Account Amount... Please Try Again>>");
								
								}
							break;
					default: 
						System.out.println("You Entered a Wrong Response...");
					}
					
							break;
							
			case 4: // Case 4 //
				
				System.out.println("\nDo you want to receive a receipt copy?...");
				System.out.println("\n1. Yes |	2. No");  
				System.out.print("\nEnter the response : ");
				response = user.nextInt();
					
					// Executing Response //
					switch (response) {
					
						case 1:
						
						System.out.print("\nEnter the Previous Pin : ");
						int repin = user.nextInt();
					
						// Comparing Two Pins //
						if (pin == repin) {
						
							System.out.print("\nEnter the New Pin 		: ");
							int newpin = user.nextInt();
							System.out.print("Enter the Re-Enter New Pin	: ");
							int renew = user.nextInt();
						
								// Comparing new pins //
								if (newpin == renew) {
									
									System.out.println("\nYou Successfully Changed the Pin! ");
									
									// Displaying the receipt //
									System.out.println("\n\n*********** Receipt ***************");
									System.out.println("	BBM ATM BANKING		");
									System.out.println("Account Number : " + acc );
									System.out.println("Date : " + date);
									System.out.println("Time : " + time);
									System.out.println("--------------------------------");
									System.out.println("Previous Pin : " + pin);
									System.out.println("New Pin : " + renew );
									System.out.println("--------------------------------");
									System.out.println("Thank you for Banking with Us...");
									
								}else {
									
								System.out.println("You Entered incorrect Re-Enter New pin...");
								System.out.println("Please Try Again...");
								
									}
						}
					
						else {
						
							System.out.println("You Entered Incorrect Previous Pin...");
							System.out.println("Please Try Again...");
						
						}
						break;
						
						case 2:
							
							System.out.print("\nEnter the Previous Pin : ");
							repin = user.nextInt();
						
							// Comparing Two Pins //
							if (pin == repin) {
							
								System.out.print("\nEnter the New Pin 		: ");
								int newpin = user.nextInt();
								System.out.print("Enter the Re-Enter New Pin 	: ");
								int renew = user.nextInt();
							
									// Comparing new pins //
									if (newpin == renew) {
										
										System.out.println("\nYou Successfully Changed the Pin! ");
										
									}else {
										
									System.out.println("You Entered incorrect Re-EnterNew pin...");
									System.out.println("Please Try Again...");
									
										}
							}
						
							else {
							
								System.out.println("You Entered Incorrect Previous Pin...");
								System.out.println("Please Try Again...");
							}
							break; 
							
							default: 
								System.out.println("\nYou Entered a Wrong Response...");
							}
							break;
							
							default: 
								System.out.println("\nYou Entered a Wrong Response...");
							
							}	
				
						
					}
	
			else 
			{
				System.out.println("\nINCORRECT PIN...");
		}

	}

}

package application;

import java.util.Scanner;

import model.entities.Account;
import model.exceptions.DomainException;

public class Program {
	public static void main (String[] args) {
		Scanner tec = new Scanner(System.in);
		
		try {
			System.out.println("Enter account data: ");
			System.out.print("Number: ");
			int number = tec.nextInt();
			System.out.println("Holder: ");
			String holder = tec.next();
			System.out.println("Initial balance: ");
			double balance = tec.nextDouble();
			System.out.println("Withdraw limit: ");
			double withdrawLimit = tec.nextDouble();
			Account acc = new Account(number, holder, balance, withdrawLimit);
			
			System.out.println("Enter amount for withdraw: ");
			double amount = tec.nextDouble();
			acc.withdraw(amount);
			System.out.println("New balance: " +acc.getBalance());
		} 
		catch (DomainException e) {
			System.out.println("Error: "+e.getMessage());
		}
		tec.close();
	}

}

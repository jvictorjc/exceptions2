package application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;
import model.exception.DomainException;

public class ProgramExcepition {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
			System.out.print("Enter account data");
			System.out.print("Number: ");
			int number = sc.nextInt();
			System.out.print("Holder: ");
			sc.next();
			String holder = sc.nextLine();
			System.out.print("Initial balance: ");
			double balance = sc.nextDouble();
			System.out.print("Withdraw limit: ");
			double withdrawLimit = sc.nextDouble();
			Account account = new Account(number, holder, balance, withdrawLimit);
			System.out.print("Enter amount for withdraw: ");
			double amount = sc.nextDouble();
		try{	
			account.withdraw(amount);
			System.out.println(account);
		}
		catch (DomainException e) {
			System.out.println("Withdraw error: " + e.getMessage());
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		sc.close();
	}
}

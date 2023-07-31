package Adarsh;

import java.util.Scanner;

public class Encap_Main_Pro extends Encap_bank {
	
	double Balance=10000;

	public void bank_details() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter The Bank Name" );
		Bank_name = sc.nextLine();
		System.out.println();
		
		System.out.println("Enter The Branch Name" );
		Branch_name = sc.nextLine();
		System.out.println();
		
		System.out.println("Enter The Account Holder Name" );
		Ac_holder_name = sc.nextLine();
		System.out.println();
		
		System.out.println("Enter The Pin Number" );
		int pin = sc.nextInt();
		setPin_no(pin);
		System.out.println();
		System.out.println(getPin_no());
		System.out.println();
		
		System.out.println("Enter The Account Number" );
		int ac = sc.nextInt();
		setAccount_no(ac);
		System.out.println();
		System.out.println(getAccount_no());
		System.out.println();
		
		System.out.println("Enter The Amount of Deposit" );
		double desp = sc.nextDouble();
		Balance = desp + Balance;
		System.out.println();
		System.out.println("Total Balance Available in Account : " + Balance);
		System.out.println();
		
		System.out.println("Enter The Amount to Withdraw" );
		double wd = sc.nextDouble();
		Balance = wd - Balance;
		System.out.println();
		
		System.out.println("Account Holder Name : " + Ac_holder_name);
		System.out.println();
		System.out.println("Total Balance in Account : " + Math.abs(Balance));
		
		
		
	}

	public static void main(String[] args) {
		Encap_Main_Pro ob = new Encap_Main_Pro();
		ob.bank_details();		

	}

}

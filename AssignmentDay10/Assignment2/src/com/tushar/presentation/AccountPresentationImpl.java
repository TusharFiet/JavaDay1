package com.tushar.presentation;

import java.util.Scanner;

import com.tushar.bean.Account;
import com.tushar.service.AccountService;
import com.tushar.service.AccountServiceImpl;

public class AccountPresentationImpl implements AccountPresentation {
	private AccountService accountService=new AccountServiceImpl();
	
	@Override
	public void showMenu() {
		System.out.println("Account Management System");
		System.out.println("==================================");
		System.out.println("1. Check Your Balance ");
		System.out.println("3. Balance Transfer ");
		System.out.println("3. Update Account Holder Name ");
		System.out.println("4. Exit ");
		System.out.println("==================================");

	}

	@Override
	public void performMenu(int choice) {
		Scanner scanner=new Scanner(System.in);
		
		switch(choice) {
		case 1:
			System.out.println("Enter Your Account Number: ");
			int accNo=scanner.nextInt();
			
			int checkAccount=accountService.checkBalance(accNo);
			
			if(checkAccount!=0)
				System.out.println(checkAccount);
			else
				System.out.println("Account with account No "+accNo+" does not exist!");
			break;

		case 2:
			System.out.println("Enter Your Account Number: ");
			int accNo1=scanner.nextInt();
			
			System.out.println("Enter Another Person Account Number: ");
			int accNo2=scanner.nextInt();
			
			System.out.println("Enter Amount: ");
			int amount = scanner.nextInt();
			
			int userBal=accountService.checkBalance(accNo1);
			int anotherPersonBal=accountService.checkBalance(accNo2);
			
			if(userBal < amount)
				System.out.println("Insufficient Balance");
			else {
				
				System.out.println("Before Transaction Account number:"+accNo1+" Balance is: "+userBal);
				System.out.println("Before Transaction Account number:"+accNo2+" Balance is: "+anotherPersonBal);
				 userBal -= amount;
				 anotherPersonBal += amount;
				
				if(accountService.updateBalance(accNo1, userBal) && accountService.updateBalance(accNo2, anotherPersonBal)) {
					System.out.println("After Transaction Account number:"+accNo1+" Balance is: "+userBal);
					System.out.println("After Transaction Account number:"+accNo2+" Balance is: "+anotherPersonBal);
					System.out.println("Amount Transfer Successfully!");
				}
				else
					System.out.println("Amount Transfer Failed!");
			}	
			break;
			
		case 3:
			System.out.println("Enter Your Account Number: ");
			int accNo3 = scanner.nextInt();
			System.out.println("Enter Your Name : ");
			String name3=scanner.next();
			if(accountService.updateNameByAccountNumber(accNo3, name3))
				System.out.println("Account Name Updation Successful!");
			else
				System.out.println("Account Name Updation Failed!");
			break;
		case 4:
			System.out.println("Thanks for Using our System");
			System.exit(0);
		default:
			System.out.println("Invalid Choice");
		}


	}

}

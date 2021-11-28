package com.tushar.client;

import java.util.Scanner;

import com.tushar.presentation.*;

public class Client {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		AccountPresentation accPresentation=new AccountPresentationImpl();
		while(true) {
			accPresentation.showMenu();
			System.out.println("Enter choice : ");
			int choice=scanner.nextInt();
			accPresentation.performMenu(choice);
		}

	}

}

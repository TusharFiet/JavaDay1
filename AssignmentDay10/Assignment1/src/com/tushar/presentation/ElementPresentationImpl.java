package com.tushar.presentation;

import java.util.ArrayList;
import java.util.Scanner;

import com.tushar.bean.Element;
import com.tushar.service.ElementService;
import com.tushar.service.ElementServiceImpl;

public class ElementPresentationImpl implements ElementPresentation {

private ElementService elementService=new ElementServiceImpl();
	
	@Override
	public void showMenu() {
		System.out.println("Atomic Element Management System");
		System.out.println("==================================");
		System.out.println("1. List All Elements ");
		System.out.println("2. Search Element ");
		System.out.println("3. Add Element ");
		System.out.println("4. Delete Element ");
		System.out.println("5. Update Atomic Weight on an Element ");
		System.out.println("6. Exit ");
		System.out.println("==================================");

	}

	@Override
	public void performMenu(int choice) {
		Scanner scanner=new Scanner(System.in);
		
		switch(choice) {
		case 1:
			ArrayList<Element> elementList=elementService.searchAllElements();
			for(Element ele:elementList) {
				System.out.println(ele);
			}
			break;
			
		case 2:
			System.out.println("Enter Element name to be searched for : ");
			String name=scanner.next();
			
			Element searchedElement=elementService.searchElementByName(name);
			
			if(searchedElement!=null)
				System.out.println(searchedElement);
			else
				System.out.println("Element with name "+name+" does not exist!");
			break;
			
		case 3:
			System.out.println("Enter Element Atomic Weight : ");
			int atomicWeight=scanner.nextInt();
			System.out.println("Enter Element Name : ");
			String name1=scanner.next();
			System.out.println("Enter Symbol : ");
			String symbol=scanner.next();
		
			Element element=new Element(atomicWeight, name1, symbol);
			
			if(elementService.insertElement(element))
				System.out.println("RECORD ADDED!");
			else
				System.out.println("RECORD NOT ADDED!");
			break;
			
		case 4:
			System.out.println("Enter Element name : ");
			String name2=scanner.next();
			if(elementService.removeElement(name2))
				System.out.println("Deletion Successful!");
			else
				System.out.println("Deletion Failed!");
			break;
		case 5:
			System.out.println("Enter Element name : ");
			String name3=scanner.next();
			System.out.println("Enter New Atomic Weight : ");
			int newAtomicWeight=scanner.nextInt();
			if(elementService.updateAtomicWeightByElementName(name3, newAtomicWeight))
				System.out.println("Atomic Weight Updation Successful!");
			else
				System.out.println("Atomic Weight Updation Failed!");
			break;
		case 6:
			System.out.println("Thanks for Using our System");
			System.exit(0);
		default:
			System.out.println("Invalid Choice");
		}
	}
}
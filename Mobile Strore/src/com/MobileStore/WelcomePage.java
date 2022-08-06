package com.MobileStore;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;



public class WelcomePage {

	public static void main(String[] args) {
				
		
		
		
	Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("-------------");
		System.out.println("welcome to store ");
//		1) press 1 to list all mobiles
//		2) search a perticular model
//		3) login as admin

		
		int num=3;
		
		if(num==1){
			
			
			
//			list of mobiles -> brands  then -> modells in that brands
			
			
		}
		if (num==2){
		
//			search by sepcific model   of  mobile 
//			then back to step one buy process
//			
//			(here the spcific behaviour)
//	
			
			searchMobileByModel(scanner);
			
			
		}
		if(num==3){
//			then ask for admin  user id and pass 
//			then give him access to add  the mobile into the list 
			try {
				System.out.println("welcome to addmin page ");
				
				addMobileToDb(scanner);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
		
		
		
	}

	private static void addMobileToDb(Scanner scanner) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("number of moble to add");
		int num=scanner.nextInt();
		ArrayList<Mobile> mobilelist= new  ArrayList<Mobile>();
		
		for(int i=0;i<num;i++){	
			Mobile m=new Mobile(); 
		System.out.println("enter the mobile model");
		scanner.nextLine();
		String Model=scanner.nextLine();
		System.out.println("Model"+Model);
		System.out.println("name of the mobile");
//		scanner.nextLine();
		String name=scanner.nextLine();
		System.out.println("name:"+name);
		
		System.out.println("size of the ram ");
//		int ram=scanner.nextInt();
//		
//		System.out.println("size of the Storage ");
//		int space=scanner.nextInt();
//		System.out.println("size of the price ");
//		Long price=scanner.nextLong();
//		System.out.println("size of the Stock ");
//		int stock=scanner.nextInt();
//		
//		m.setModel(Model);
//		m.setName(name);
//		m.setRam(ram);
//		m.setSpace(space);
//		m.setPrice(price);
//		m.setStock(stock);
//		m.setStock(stock);
//		m.setPrice(price);
//		
//		mobilelist.add(m);
//		
//		}
//		
//			SaveMobileListToDb(mobilelist);	
	}}

	private static void SaveMobileListToDb(ArrayList<Mobile> mobilelist) throws IOException {
		ArrayList<Mobile>list =mobilelist;
		FileWriter writer= new FileWriter("C:/Users/munna/Desktop/Mobile.csv");
		for(int i=0;i<list.size();i++){
			Mobile mob=list.get(i);
		writer.write(mob.toString());
		writer.flush();
		
		}
		writer.close();
	}
		
		
		
	

}

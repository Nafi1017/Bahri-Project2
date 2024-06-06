package com.asrtek.basicjava;

public class ForEachLoop {

	public static void main(String[] args) {
					//012
		String name = "Sami Vai, Arif Vai, Rana Vai";
									//0        1            2            3
		String [] nameArray  = {"Sami Vai", "Arif Vai" , "Rana Vai", "Riyad Vai"};
		
		System.out.println(nameArray.length); //4
		
		System.out.println(nameArray[0]);
		System.out.println(nameArray[1]);
		System.out.println(nameArray[2]);
		
		for (int i =0; i<nameArray.length; i++) {
			System.out.println(nameArray[i]);
		}
		System.out.println("-------------------------------");
		
		String  search = "Sami Vai";
		for (String name1 : nameArray) {
			if (name1.equals(search)) {
				System.out.println(name1);
				break;
			}
		}
	   }}




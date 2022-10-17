package com.capg;
import java.util.Scanner;

public class Source {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int count=0;
		if(num>0) {
			String[] designations =new String[num];
			String[] input=new String[num];
			for( int i=0;i<num;i++) {
			input[i]=sc.next();
				
			}
			for(int i=0;i<num;i++) {
				if(input[i].contains("HR")) {
					designations[count]=input[i];
					count++;
				}
			}
			if(count>0) {
				System.out.println("total " + count + " designations in HR department");
				for(int j=0;j<count;j++) {
					System.out.println(designations[j].toUpperCase());
				}
			}
			else {
				System.out.println("No designations in the HR department");
			}
		}
		else {
			System.out.println("INVALID INPUT");
		}
	}

}

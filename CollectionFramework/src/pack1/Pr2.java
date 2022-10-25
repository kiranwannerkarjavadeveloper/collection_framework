package pack1;

import java.util.*;

public class Pr2 {
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		String str;
		Scanner sc=new Scanner (System.in);
		for (int i = 0; i < 5; i++) {
			System.out.println("enter the city :");
			al.add(sc.nextLine());
		}
		System.out.println("city visited by user :"+ al);
		for (int i = 0; i < al.size(); i++) {
			str=(String)al.get(i);
			for (int j = 0; j < str.length(); j++) {
               if(j<3) {
            	   System.out.print(str.charAt(j));
               }else {
            	   System.out.print("*");
               }
			}
			System.out.println();
		}
	}	
}

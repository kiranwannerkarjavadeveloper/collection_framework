package pack1;

import java.util.ArrayList;
import java.util.Scanner;

public class Pr11 {
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add( new Dish ("idli",50, "southIndian"));
		al.add( new Dish("vada",120, "chinese"));
		al.add( new Dish("biryani",54, "rice"));
		al.add( new Dish("veg pulav",60, "southIndian"));
		
		//read the category from the user and display no.of dishes available in the menu for that category
		//if no dishes display suitable message
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the category of dish :");
		String category=sc.nextLine();
           int count=0;
		for (int i = 0; i < al.size(); i++) {
			Dish temp=(Dish)al.get(i);
			if(temp.getCategory().equalsIgnoreCase(category)) {
				count++;
				//temp.displayDishDetails();
			}
			
		}
		if(count>0)
		{
			System.out.println(count);
		}
		else
			System.out.println("No dish available");
	}
	}

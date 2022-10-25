package pack1;

import java.util.ArrayList;
import java.util.Scanner;

public class Pr10 {
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add( new Dish ("idli",50, "southIndian"));
		al.add( new Dish("vada",120, "chinese"));
		al.add( new Dish("biryani",54, "rice"));
		al.add( new Dish("veg pilav",60, "southIndian"));
		//read the name of dish from the user...display 
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the name of dish");
		String dishName=sc.nextLine();

		for (int i = 0; i < al.size(); i++) {
			Dish temp=(Dish)al.get(i);
			if(temp.getName().equalsIgnoreCase(dishName))
				temp.displayDishDetails();

			else {
				System.out.println(" sorry "+dishName+" dish not present");
			}
			break;
		}
	}
}

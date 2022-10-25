package pack1;

import java.util.ArrayList;
import java.util.Scanner;

public class Pr12 {
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add( new Dish ("idli",50, "southIndian"));
		al.add( new Dish("vada",120, "chinese"));
		al.add( new Dish("biryani",54, "rice"));
		al.add( new Dish("veg pulav",60, "southIndian"));

		Scanner sc=new Scanner(System.in);
		System.out.println("enter the name of dish");
		String dishName=sc.nextLine();
		int count=0;
		for (int i = 0; i < al.size(); i++) {
			Dish temp=(Dish)al.get(i);
			if(temp.getName().equalsIgnoreCase(dishName))
				//temp.displayDishDetails();
				count++;
			if(count>0) {
				al.remove(i);
			}else {
				System.out.println("dish not available");
			}
			break;
		}
		System.out.println(al);



	}
}

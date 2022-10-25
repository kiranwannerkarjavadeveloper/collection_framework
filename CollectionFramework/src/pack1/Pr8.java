package pack1;

import java.util.ArrayList;

public class Pr8 {
public static void main(String[] args) {
	ArrayList al=new ArrayList();
	al.add( new Dish ("idli",50, "southIndian"));
	al.add( new Dish("vada",120, "chinese"));
	al.add( new Dish("biryani",54, "rice"));
	al.add( new Dish("veg pilav",60, "southIndian"));
	// print all name of dishes
	for (int i = 0; i < al.size(); i++) {
		System.out.println(((Dish)al.get(i)).getName());
		
	}
}
}

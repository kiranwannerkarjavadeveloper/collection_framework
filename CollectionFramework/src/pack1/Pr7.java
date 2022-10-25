package pack1;

import java.util.ArrayList;

public class Pr7 {
public static void main(String[] args) {
	ArrayList al=new ArrayList();
	al.add( new Dish ("idli",50, "southIndian"));
	al.add( new Dish("vada",120, "chinese"));
	al.add( new Dish("biryani",54, "rice"));
	al.add( new Dish("veg pilav",60, "southIndian"));
	//System.out.println(al);
	
	System.out.println(((Dish)al.get(0)).getName());
	System.out.println(((Dish)al.get(1)).getPrice());
	System.out.println(((Dish)al.get(2)).getCategory());
}
}

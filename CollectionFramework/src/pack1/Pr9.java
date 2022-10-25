package pack1;

import java.util.ArrayList;

public class Pr9 {
public static void main(String[] args) {
	ArrayList al=new ArrayList();
	al.add( new Dish ("idli",50, "southIndian"));
	al.add( new Dish("vada",120, "chinese"));
	al.add( new Dish("biryani",54, "rice"));
	al.add( new Dish("veg pilav",60, "southIndian"));
	for (int i = 0; i < al.size(); i++) {
		Dish temp=(Dish)al.get(i);
		if(temp.getCategory().equalsIgnoreCase("southIndian"))
		System.out.println(temp.getName());
	}
}
}

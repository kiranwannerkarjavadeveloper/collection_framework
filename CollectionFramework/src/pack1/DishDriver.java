package pack1;

import java.util.ArrayList;
import java.util.Arrays;

public class DishDriver {
	private static final String Object = null;

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add( new Dish ("idli",50, "southIndian"));
		al.add( new Dish("vada",120, "chinese"));
		al.add( new Dish("biryani",54, "rice"));
		al.add( new Dish("veg pilav",60, "southIndian"));
		System.out.println(al);


	}

}

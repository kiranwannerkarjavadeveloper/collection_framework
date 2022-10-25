package pack1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class Pr13 {
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add( new Dish ("idli",50, "southIndian"));
		al.add( new Dish("vada",120, "chinese"));
		al.add( new Dish("biryani",55, "rice"));
		al.add( new Dish("veg pilav",60, "southIndian"));
		Collections.sort(al, new Pr14());
		//		Collections.sort(al,(Dish o1, Dish o2)->o1.getCategory().compareTo(o2.getCategory()));
		//		Collections.sort(al,(Dish o1, Dish o2)->o1.getName().compareTo(o2.getName()));
		//		
		for (int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i));

		}
		//		System.out.println("=====================================================");
		//		Collections.sort(al,(Dish o1, Dish o2)->o1.getName().compareTo(o2.getName()));
		//		for (int i = 0; i < al.size(); i++) {
		//			System.out.println(al.get(i));
		//			
		//		}


	}
}

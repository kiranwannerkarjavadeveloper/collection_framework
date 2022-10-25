package pack1;

import java.lang.Object;
import java.util.Objects;


public class Dish implements Comparable{
	private String name;
	private int price;
	private String category;
	public Dish()
	{
		super();
	}
	public Dish(String name, int price, String category) {
		super();
		this.name = name;
		this.price = price;
		this.category = category;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public void displayDishDetails() {
		System.out.println(" Name of Dish :"+ name);
		System.out.println(" Price of Dish :"+ price);
		System.out.println(" Category of Dish :"+ category);
	}
	@Override
	public String toString() {
		return "Dish [name=" + name + ", price=" + price + ", category=" + category + "]";
	}
	@Override
	public int hashCode() {
		//return Objects.hash(name,price,category);
		return name.hashCode()+price+category.hashCode();
	}
	@Override
	public boolean equals(Object o) {
		Dish p=(Dish)o;
		if(this.name.equals(p.name)&&  this.price==p.price&&this.category.equals(p.category)) {
			return true;
		}
		else {
			return false;
		}
	}
	
		
	@Override
	public int compareTo(Object o) {
      Dish p1=(Dish)o;
	if(this.price>p1.price)
		return 1;
	if(this.price==p1.price)
		return 0;
		return -1;
//		return this.name.compareTo(p1.name);
	}

}







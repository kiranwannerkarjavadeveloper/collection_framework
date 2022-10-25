package pack1;

import java.util.Objects;

public class Pr5 {
int id;
String name;

//@Override
//public int hashCode() {
//	
//	return Objects.hash(id,name);
//	
//	
//}
public static void main(String[] args) {
	String s1="java";
	String s2="java";
	System.out.println(s1.hashCode());
	System.out.println(s2.hashCode());
	System.out.println(s1.hashCode()==s2.hashCode());
	
	
}

}

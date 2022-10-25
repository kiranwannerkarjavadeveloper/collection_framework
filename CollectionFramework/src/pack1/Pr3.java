package pack1;

import java.util.*;
public class Pr3 {
	public static void main(String[] args) {
		Scanner s= new Scanner (System.in);
		ArrayList a= new ArrayList();
		try {
			for(int i=0;i<5;i++)
			{
				System.out.println("Enter the fvrt coulour");
				a.add(s.next());
			}
		}
		catch(InputMismatchException e)
		{
			System.out.println("Enter the colour only");
		}
		System.out.println("Enter the lucky number");
		int ln=0;
		try {
			ln=s.nextInt();
		}
		catch(InputMismatchException e)
		{
			System.out.println("Enter the number value only");
		}

		for(int i=0;i<a.size();i++)
		{
			String str=(String)a.get(i);
			if(ln==str.length())
			{
				System.out.println(str);
			}
		}
	}
}

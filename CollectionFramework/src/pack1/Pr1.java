package pack1;

import java.util.ArrayList;
import java.util.Scanner;

public class Pr1 {

	public static void isPrime(int x,int y) {
		int flag;
		for (int i = x; i <=y ; i++) {
			flag=1;
			for (int j =2 ; j <i/2; j++) {
				if(i%j==0) {
					flag=0;
					break;
				}
			}
			if(flag==1) {
				System.out.print(i+",");
			}
		}
	}

	public static void main(String[] args) {

		Pr1.isPrime(10,100);
	}
}




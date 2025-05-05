package automaction;

import java.util.Scanner;

public class IF {
	public static void main(String[] args) {
		int a;
		Scanner sc=new Scanner(System.in);
		System.out.print("ENter A : ");
		a=sc.nextInt();
		if(a>0)
		{
			System.out.println("A Is Positive number");
			
		}
		else {
			System.out.println("A Is Negative NUmber");
			
		}
	}

}

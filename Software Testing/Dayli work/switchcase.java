package automaction;

import java.util.Scanner;

import javax.print.attribute.SetOfIntegerSyntax;

public class switchcase {
	public static void main(String[] args) {
		int a,b,ans,choice;
		Scanner sc=new Scanner(System.in);
		System.out.println("*****************************************************");
		System.out.println("Enetr a : ");
		a=sc.nextInt();
		System.out.println("*****************************************************");
		System.out.println("Enter b : ");
		b=sc.nextInt();
		System.out.println("*****************************************************");
		
		System.out.println("1. Addition");
		System.out.println("2. Subtraction");
		System.out.println("3. Multiplication");
		System.out.println("4. Division");
		System.out.println("*****************************************************");
		
		System.out.println("Enter Your Choice : ");
		choice=sc.nextInt();
		System.out.println("*****************************************************");
		
		switch(choice)
		{
		case 1 :
				ans=a+b;
				System.out.println("Addition : "+ans);
				System.out.println("*****************************************************");
				break;
		case 2 :
				ans=a-b;
				System.out.println("Subtraction : "+ans);
				System.out.println("*****************************************************");
				break;
		case 3 :
				ans=a*b;
				System.out.println("Multiplication : "+ans);
				System.out.println("*****************************************************");
				break;
		case 4 : 
				ans=a/b;
				System.out.println("Division : "+ans);
				System.out.println("*****************************************************");
				break;
			default :
				System.out.println("Invalid Choice. Please try again");
				System.out.println("*****************************************************");
				
		}
		
		
		
	}

}

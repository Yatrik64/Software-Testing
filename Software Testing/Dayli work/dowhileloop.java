package automaction;

import java.util.Scanner;

public class dowhileloop {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,sum=0;
		System.out.println("Enter n : ");
		n=sc.nextInt();
		do 
		{
		sum=sum+n;
		n--;
		
		}while (n<0);
			System.out.println("sum : "+sum);
		
	}

}

package automaction;

import java.util.Scanner;

public class whileloops {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,sum=0;
		System.out.println("Enter n :");
		n=sc.nextInt();
		while(n>0)
		{
			sum=sum+n;
			n--;
		}
		System.out.println("sum"+sum);
	}

}

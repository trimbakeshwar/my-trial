package bridgelabz;

import java.util.Scanner;

public class leapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter name");
		int year = sc.nextInt();
		if(year<10000  && year>999)
		{
			if((year%4==0 && year%100!=0) ||(year%400==0))
			{
				System.out.println("leap year");
			}
			else
					System.out.println("not leap year");
		}
	}

}

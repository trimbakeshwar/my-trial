package Book;

import java.util.Scanner;

class MainBook {

	
	private static String Book_title;
	private static int price;
	public static void main(String[] args) {
		Book b1=new Book();
		

		String Book_title;
	      int price;
		
			create_book();
			show_book();

	}
		private static void create_book()
		{
			
		
			
			Scanner BD=new Scanner(System.in);
			System.out.println("enter book title");
			Book_title=BD.nextLine();
			System.out.println("price is");
			price=BD.nextInt();
			
			
		}
		private static void show_book()
		{
			System.out.println("Book name is :"+Book_title);
			
			System.out.println("price is :"+price);
		}
		
				

	}




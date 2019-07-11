package day4;

import java.util.Scanner;

public class badBoys {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ray = 10; 
		double cross = 4;
		float pie = 3.14f;
		long money = 100;
		boolean blue = true;
		String bean = "Skudd";
		String say = "yellow";
		
		Scanner Ray=new Scanner(System.in);
		
		System.out.println("name");
		bean= Ray.next();
		System.out.println("favorite color");
		say= Ray.next();
		System.out.println("how many siblings");
		money= Ray.nextLong();
		 
		System.out.println(bean  + "favorite color is" + say + ",she has" + money + "siblings.");
	
						
					
						

	}

}

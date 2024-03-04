package daire_cevre_alan;

import java.util.Scanner;

public class daire_cevre_alan {
	
	
	
		public static void main(String[] args) {
			
			// pi sayısı 3 olarak kabul edilecektir.
			
			Scanner input = new Scanner(System.in);
			
			int r,pi,cevre,alan;
			pi = 3;
			
			System.out.print("Dairenin yarı çapını giriniz :");
			r = input.nextInt();
			
			alan = pi *(r*r);
			cevre = 2*(pi*r);
			System.out.println("Dairenin alanı :" + alan);
			System.out.println("Dairenin çevresi :" + cevre);
			
			
		}

}

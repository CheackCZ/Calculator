package Kalkulacka;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Zadej první èíslo: ");
		int cislo = sc.nextInt();
		
		System.out.println("Zadej operaci, kterou chceš provést: \n1) / \n2) * \n3) + \n4) -");
	    int operace = sc.nextInt();
	    
	    System.out.println("Zadej druhé èíslo: ");
	    int cislo1 = sc.nextInt();
		
	    Kalkulacka k1 = new Kalkulacka(cislo, cislo1);
	    
	    if(operace == 1) {
	   		System.out.println(cislo + " / " + cislo1 + " = " + k1.Deleni());
	   	} else if (operace == 2) {
	   		System.out.println(cislo + " * " + cislo1 + " = " + k1.Soucin());
	   	} else if (operace == 3) {
    		System.out.println(cislo + " + " + cislo1 + " = " + k1.Soucet());	    	
    	} else if (operace == 4) {
	   		System.out.println(cislo + " - " + cislo1 + " = " + k1.Rozdil());
	   	} else {
	   		System.out.println("Umím pouze: +; -; *; /.");
	   	}
	    
	    sc.close();
	   }
	    
	    
	

}

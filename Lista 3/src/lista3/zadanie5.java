package lista3;

import java.util.Scanner;

public class zadanie5 {
	
	public static void main(String[] args) { 
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the value: ");
		String value = sc.nextLine();
		
		if (value.length()==11)
		{
			System.out.print("This value is PESEL.");
			Dane(value);
		}
		
		else if ((value.length()>0) && (value.length()<=3))
		{
			System.out.print("This value is age.");
			int age=Integer.valueOf(value);
			Dane(age);
		}
		
		else
		{
			System.out.print("This value neither age nor PESEL.");
		}
		
		
		
		
		sc.close();
	}
	
	public static void Dane(String pesel) {
		System.out.println("Twoja data urodzenia to 19" + pesel.substring(0, 2) +"." + pesel.substring(2, 4) +"."+pesel.substring(4, 6));
		}
	
	public static void Dane(int wiek) {
		int r = 2021-wiek;
		System.out.println("Urodziles sie w " + r + " roku ");
		}
	
}

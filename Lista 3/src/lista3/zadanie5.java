package lista3;

import java.util.Scanner;

public class zadanie5 {
	
	public static void main(String[] args) { 
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the value: ");
		String value = sc.nextLine();
		
		if(value.contains("."))
		{
			 String[] data = value.split("[.]");
			 
			 int dzien=Integer.valueOf(data[0]);
			 int miesiac=Integer.valueOf(data[1]);
			 int rok=Integer.valueOf(data[2]);
			 Dane(dzien, miesiac, rok);
		}
		else if(value.contains(" "))
		{
			String[] in = value.split(" ");
			String imie;
			String nazwisko;
			if(in.length==2)
			{
				imie=in[0];
				nazwisko=in[1];
				Dane(imie, nazwisko);
			}
			else
			{
				String imie2;
				imie=in[0];
				imie2=in[1];
				nazwisko=in[2];
				Dane(imie,imie2,nazwisko);
			}
		}
		
		else if (value.length()==11)
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
			System.out.print("not good.");
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
	
	public static void Dane(String imie,String nazwisko) {
		
		System.out.println("Imie: " + imie+"  Nazwisko: "+ nazwisko);
		}
	
	public static void Dane(String imie1,String imie2, String nazwisko) {
		
		System.out.println("Pierwsze imie: "+ imie1 + "  Drugie imie: " +imie2+"  Nazwisko: "+ nazwisko);
		}
	
	public static void Dane(int dzien, int miesiac, int rok) {
	String m="";
		switch(miesiac)
		{
			case 1:
				m="stycznia";
				break;
			case 2:
				m="lutego";
				break;
			case 3:
				m="marca";
				break;
			case 4:
				m="kwietnia";
				break;
			case 5:
				m="maja";
				break;
			case 6:
				m="czerwca";
				break;
			case 7:
				m="lipca";
				break;
			case 8:
				m="sierpnia";
				break;
			case 9:
				m="wrzesnia";
				break;
			case 10:
				m="padziernika";
				break;
			case 11:
				m="listopada";
				break;
			case 12:
				m="grudnia";
				break;
		}
		System.out.println("Urodziles sie " + dzien+" "+ m+" " + rok + " roku ");
	}
}

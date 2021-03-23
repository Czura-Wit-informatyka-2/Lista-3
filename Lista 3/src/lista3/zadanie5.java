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
			 
			 int day=Integer.valueOf(data[0]);
			 int month=Integer.valueOf(data[1]);
			 int year=Integer.valueOf(data[2]);
			 Data(day, month, year);
		}
		else if(value.contains(" "))
		{
			String[] in = value.split(" ");
			String name;
			String surname;
			if(in.length==2)
			{
				name=in[0];
				surname=in[1];
				Data(name, surname);
			}
			else
			{
				String name2;
				name=in[0];
				name2=in[1];
				surname=in[2];
				Data(name,name2,surname);
			}
		}
		
		else if (value.length()==11)
		{
			System.out.println("This value is PESEL.");
			Data(value);
		}
		
		else if ((value.length()>0) && (value.length()<=3))
		{
			System.out.println("This value is age.");
			int age=Integer.valueOf(value);
			Data(age);
		}
		
		else
		{
			System.out.print("not good.");
		}
		
		
		
		
		sc.close();
	}
	
	public static void Data(String pesel) {
		System.out.println("Your birth date is 19" + pesel.substring(0, 2) +"." + pesel.substring(2, 4) +"."+pesel.substring(4, 6));
		}
	
	public static void Data(int age) {
		int r = 2021-age;
		System.out.println("You were born in " + r + " year ");
		}
	
	public static void Data(String name,String surname) {
		
		System.out.println("Name: " + name+ "  Surname: "+ surname);
		}
	
	public static void Data(String name1,String name2, String surname) {
		
		System.out.println("First name: "+ name1 + "  Second name: " +name2+"  Surname: "+ surname);
		}
	
	public static void Data(int day, int month, int year) {
	String m="";
		switch(month)
		{
			case 1:
				m="january ";
				break;
			case 2:
				m="february";
				break;
			case 3:
				m="march";
				break;
			case 4:
				m="april";
				break;
			case 5:
				m="may";
				break;
			case 6:
				m="june";
				break;
			case 7:
				m="july";
				break;
			case 8:
				m="august";
				break;
			case 9:
				m="september";
				break;
			case 10:
				m="october";
				break;
			case 11:
				m="november";
				break;
			case 12:
				m="december ";
				break;
		}
		System.out.println("You were born  " + day +" "+ m +" " + year + " year. ");
	}
}

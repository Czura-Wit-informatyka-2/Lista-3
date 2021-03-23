package lista3;

import java.util.Scanner;

public class zadanie2 {

	public static void main(String[] args) { 
		
		Scanner sc=new Scanner(System.in);
		
		String longerWord, shorterWord;
		Boolean result=true;
		
		System.out.print("Enter first word: ");
		String word1 = sc.nextLine();
		System.out.print("");
		
		System.out.print("Enter second word: ");
		String word2 = sc.nextLine();
		
		int l1 = word1.length();
		int l2 = word2.length();
		if(l1==l2)
		{
			for(int i = 0;i<l1;i++)
			{
				if(word1.charAt(i)!=word2.charAt(i))
				{
					result=false;
					break;
				}			
			}
		}
		else 
		{
				if(l1>l2)
				{
					longerWord=word1;
					shorterWord=word2;
				}
				else
				{
					longerWord=word2;
					shorterWord=word1;
				}
				
			for(int i = 0;i<longerWord.length()-shorterWord.length()+1;i++)
			{
				if (longerWord.charAt(i)!=shorterWord.charAt(0))
				{
					continue;
				}
				for(int j=1;j<shorterWord.length();j++)
				{
					if(longerWord.charAt(i+j)==shorterWord.charAt(j))
					{
						continue;
					}
					result=false;
					break;
				}
			}		
		}	
		if(result == true)
		{
			System.out.print("Yes is an answer");
		}
		else
		{
			System.out.print("Nope");
		}
		sc.close();

	}
	
}

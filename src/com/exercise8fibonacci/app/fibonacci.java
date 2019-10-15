package com.exercise8fibonacci.app;
import java.util.Scanner;
public class fibonacci {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int cont1=0;
		int cont2=1;
		long fibonacci=1;
		int bound=0;
		
		Scanner input = new Scanner(System.in);
		
		
		do
		{
			System.out.println("cuantos fibonaccis desea calcular ");
			bound = input.nextInt();
			if (bound<=0)
			{
				System.out.println("debes introducir un numero mayor que cero stupid");
			}
		}
		while(bound<=0);
		
		for (int i=0; i<bound; i++)
		{
			System.out.print(fibonacci+" ");
			fibonacci = cont1+cont2;
			cont1=cont2;
			cont2 =(int) fibonacci;
			
			
		}

	}

}

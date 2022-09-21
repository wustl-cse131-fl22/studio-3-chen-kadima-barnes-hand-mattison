package studio3;

import java.util.Scanner;
import javax.crypto.spec.DHPublicKeySpec;

public class Sieve {

	public static void main(String args[]) {
	Scanner in = new Scanner(System.in);
	{
	System.out.println("Enter a number for n");
	int n = in.nextInt();
	
	boolean [] array = new boolean[n + 1];
	
	for (int i = 0; i<array.length; ++i) 
	{
			array[i] = true;
			
	}
	
	for (int z = 2; z<array.length; ++z)
	{
		if (array[z] == true)
		{
			for (int m = z + 1; (array.length - 1 - m)%m == 0; ++m)
			{
				array[m] = false;
			}
			System.out.println(z);			
		}
		}
	
	
	}
	
}										
}
		
		
		
		
		
	
	
	
	
	
	
	
	
	


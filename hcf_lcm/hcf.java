/*
creating a java program to print the hcf using while loop
*/

public class hcf
{

	hcf()         // default constructor
	{
	}

	public int HCF(int a, int b)   // assuming a is less than b
	{

		while(a != 0)
		{
			int i = a;
			a = b % a;
			b = i;
		}

		return b;
	}
}
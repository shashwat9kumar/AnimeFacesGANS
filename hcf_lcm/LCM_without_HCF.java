/*
Finding LCM without using HCF
*/

public class LCM_without_HCF
{	
	public static void main(String x[])
	{
		/*
			The LCM will always lie in the range :   larger(a,b)< LCM < Product(a,b)
		*/

		int a = Integer.parseInt(x[0]);
		int b = Integer.parseInt(x[1]);


		int lcm = 0;


		int larger = a > b ? a : b ;
  		int smaller = a < b ? a : b ;

		for(int i = larger ;  i <= ( a*b ) ; i += larger)
		{
			if(i % smaller == 0)
			{
				lcm = i;
				break;
			}
		}


		System.out.println("The LCM of " + a + " and " + b + " is : " +lcm);
	}
}
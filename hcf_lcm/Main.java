/*

Main class to run lcm and hcf class

*/


public class Main
{
	public static void main(String x[])    // assuming entered numbers are not 0's
	{	
		int a = Integer.parseInt(x[0]);
		int b = Integer.parseInt(x[1]);

		int big = a > b ? a : b;      // To find the larger and smaller number
		int small = a < b ? a : b;

		a = small;
		b = big;

		hcf obj1 = new hcf();
		lcm obj2 = new lcm();

		int h = obj1.HCF(a,b);
		int l = obj2.LCM(a,b);

		System.out.println("The HCF of " + a + " and " + b + " is : " + h);
		System.out.println("The LCM of " + a + " and " + b + " is : " + l);
		
	}
}
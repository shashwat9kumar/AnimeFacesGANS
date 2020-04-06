/*
Creating a lcm class to find lcm using the formula:

	lcm X hcf = a X b

So using the hcf.java class
*/

public class lcm
{	

	lcm()
	{}


	public int LCM(int a, int b)    // assuming a is smaller than b
	{
		hcf obj = new hcf();
		
		int hcf_ = obj.HCF(a,b);

		int lcm_ = ( ( a * b ) / hcf_ );

		return lcm_;

	}
}
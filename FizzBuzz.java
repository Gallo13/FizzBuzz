import java.util.Scanner;

class FizzBuzz
{
	public static void main(String argv[])
	{
		/*
		Write code where Fizz is replaces any number
		divisible by 3 and Buzz replaces any number
		divisible by 5 and FizzBuxx replaces any number
		divisible by both 3 and 5.
		*/
		
		Scanner myscan = new Scanner(System.in);

		System.out.print("Enter number: ");
		int num = myscan.nextInt();
		
		if(num % 3 == 0)
			System.out.print("Fizz");
		else if(num % 5 == 0)
			System.out.print("Buzz");
		else if(num % 15 == 0)
			System.out.print("FizzBuzz");
		
	}
}
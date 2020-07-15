package controller;

import java.util.Scanner;

//Car interface has one abstract method to calculate the fare
interface Car
{
	void calculateFare(int numberOfKilometersTravelled);
}

// Mini , a child class of Car interface
class Mini implements Car
{
	//Calculates the fare of Suv based on number of kms travelled.
	@Override
	public void calculateFare(int numberOfKilometersTravelled) {
		int finalCost = 0;
		if(numberOfKilometersTravelled <75)
		{
			if(numberOfKilometersTravelled>3)
			{
				int remainingDistance = numberOfKilometersTravelled-3;
				if(remainingDistance <= 15)
				{
					finalCost =50;
					finalCost += remainingDistance * 10;
					System.out.println("Mini : Rs." + finalCost);
				}
				else if(remainingDistance > 15)
				{
					finalCost =50;
					int temp = remainingDistance - 15;
					int initialDistance = 15;
					finalCost += initialDistance * 10;
					finalCost += temp * 8;
					System.out.println("Mini : Rs." + finalCost);
				}
			}
			if (numberOfKilometersTravelled > 0 && numberOfKilometersTravelled <3)
			{
				finalCost =50;
				System.out.println("Mini : Rs." + finalCost);
			}
		}
		// checking for specified condition if >75
		if(numberOfKilometersTravelled >75)
		{
			finalCost = numberOfKilometersTravelled * 8;
			System.out.println("Mini : Rs." + finalCost);
		}
	}	
}

//Sedan , a child class of Car interface
class Sedan implements Car
{
	//Calculates the fare of Suv based on number of kms travelled.
	@Override
	public void calculateFare(int numberOfKilometersTravelled) {
		int finalCost = 0;
		if(numberOfKilometersTravelled <100)
		{
			if(numberOfKilometersTravelled>5)
			{
				int tempDistance = numberOfKilometersTravelled-5;
				// checking for specified condition if <=15
				if(tempDistance <= 15)
				{
					finalCost = 80;
					finalCost += tempDistance * 12;
					System.out.println("Sedan : Rs." + finalCost);
				}
				else if(tempDistance > 15)
				{
					finalCost = 80;
					int temp = tempDistance-15;
					int initialDistance = 15;
					finalCost += initialDistance * 12;
					finalCost += temp * 10;
					System.out.println("Sedan : Rs." + finalCost);
				}
				else
				{
					finalCost = 80;
					System.out.println("Sedan : Rs." + finalCost);
				}
			}
		}
		// checking for specified condition if >=100
		else if (numberOfKilometersTravelled >=100)
		{
			finalCost = numberOfKilometersTravelled * 10;
			System.out.println("Sedan : Rs." + finalCost);
		}
		
	}
	
}

//Suv , a child class of Car interface
class Suv implements Car
{
	//Calculates the fare of Suv based on number of kms travelled.
	@Override
	public void calculateFare(int numberOfKilometersTravelled) {
		int finalCost = 0;
			//Calculating the minimum price
			if(numberOfKilometersTravelled<5)
			{
				System.out.println("SUV : Rs." + finalCost*numberOfKilometersTravelled);
			}
			// checking if distance is greater than 5 kms
			else if (numberOfKilometersTravelled>5)
			{
				int tempDistance = numberOfKilometersTravelled-5;
				// checking for specified condition if <15
				if(tempDistance <= 15)
				{
					finalCost =100;
					finalCost += tempDistance * 15;
					System.out.println("SUV : Rs." + finalCost);
				}
				else if(tempDistance > 15)
				{
					finalCost = 100;
					int temp = tempDistance-15;
					int initialDistance = 15;
					finalCost += initialDistance * 15;
					finalCost += temp * 12;
					System.out.println("SUV : Rs." + finalCost);
			}
		}
	}
}

// DRIVER CODE
public class Taxi {

	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args)
	{
		System.out.println("Enter the number of kilometers travelled : ");
		int numberOfKilometersTravelled = scanner.nextInt(); 
		
		//Object creation for Mini class using Dynamic Method Dispatch
		Car mini = new Mini();
		mini.calculateFare(numberOfKilometersTravelled);
		
		//Object creation for Sedan class
		Car sedan = new Sedan();
		sedan.calculateFare(numberOfKilometersTravelled);
		
		//Object creation for SUV class
		Car suv = new Suv();
		suv.calculateFare(numberOfKilometersTravelled);

	}
}

/*
TestCase:
Enter the number of kilometers travelled : 
20
Mini : Rs.216
Sedan : Rs.260
SUV : Rs.325
*/

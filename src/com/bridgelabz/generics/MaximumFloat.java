package com.bridgelabz.generics;

public class MaximumFloat {
	
	public static Float maximumFloat(Float num1, Float num2, Float num3) {

		Float maximumNumber = num1;
		if (num1.compareTo(num2) > 0 && num1.compareTo(num3) > 0)
			maximumNumber = num1;
		else if (num2.compareTo(num1) > 0 && num2.compareTo(num3) > 0)
			maximumNumber = num2;
		else
			maximumNumber = num3;
		return maximumNumber;

	}

	// print maximum Float numbers
	public static void main(String[] args) {
		System.out.println("Maximum Float Number Among 3 will be :- " + maximumFloat(98.6f, 78.7f, 45.8f));
	}
}s

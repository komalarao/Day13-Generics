package com.bridgelabz.generics;

public class MaximumInGenerics<T> {
	T num1, num2, num3;

	public static <T extends Comparable<T>> T maximumAmongThree(T num1, T num2, T num3) {

		T maximumNumber = num1;
		if (num1.compareTo(num2) > 0 && num1.compareTo(num3) > 0)
			maximumNumber = num1;
		else if (num2.compareTo(num1) > 0 && num2.compareTo(num3) > 0)
			maximumNumber = num2;
		else
			maximumNumber = num3;
		return maximumNumber;
	}
	// print maximum of three methods

	public static void main(String[] args) {
		System.out.println("The max Number Among Three String numbers is:-\n " + maximumAmongThree("krishna", "rahul", "sireesha"));

		System.out.println("The max Number Among Three Integer numbers is:-\n " + maximumAmongThree(98, 56, 67));
		System.out.println("The max Number Among Three Float numbers is:-\n " + maximumAmongThree(38.9f, 49.3f, 95.6f));
	}
}

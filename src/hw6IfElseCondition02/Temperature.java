package hw6IfElseCondition02;

import java.util.Scanner;

public class Temperature {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter today's temperature: ");
		int todaysTemperature = scanner.nextInt();
		if (todaysTemperature < 32) {
			System.out.println("Freezing");
		} else if (todaysTemperature >= 32 && todaysTemperature < 55) {
			System.out.println("Pleasant");
		} else if (todaysTemperature >= 55 && todaysTemperature < 73) {
			System.out.println("Getting Warmer");
		} else if (todaysTemperature >= 73 && todaysTemperature < 101) {
			System.out.println("Hot");
		} else {
			System.out.println("Ice on my head please");
		}
	}
}

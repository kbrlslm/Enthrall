package hw7UseOfNestedIf;

import java.util.Scanner;

public class DiabeticCondition {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("<-- Please Enter your Hemoglobin A1C  value below -->");
		double hbga1c = scanner.nextDouble();
		if (hbga1c > 6.4) {

			System.out.println("I am a diabetic patient");

		} else if (!(hbga1c > 6.4)) {
			if (hbga1c >= 5.7) {
				System.out.println("I am a pre-diabetic patient");
			} else if (hbga1c < 5.7) {
				System.err.println("I am a healthy person");
			}

			else {
				System.out.println("Congratulations! you are not diabetic");
			}
		} else {

			System.out.println("Enter the correct value");
		}
	}
}

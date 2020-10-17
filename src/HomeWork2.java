import java.util.Scanner;

public class HomeWork2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("enter 3 numbers");
		int num1, num2, num3;
		num1 = scan.nextInt();
		num2 = scan.nextInt();
		num3 = scan.nextInt();
		int largest;

		if (num1 > num2) {
			if (num1 > num3) {
				largest = num1;
			} else if (num2 > num1) {
				if (num2 > num3) {
					largest = num2;
				} else {
					largest = num3;
					System.out.println("The largest number is " + largest);
				}

			}
		}

	}

}

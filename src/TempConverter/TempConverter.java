package TempConverter;

import java.util.Scanner;

public class TempConverter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);


		System.out.println("-----------------------------------Welcome------------------------------------------" + "\n"
				+ "---Celsius-Fahrenheit/Fahrenheit-Celsius converter----" + "\n");

		//capture user input
		int count = 0;


		while (count < 5) {

			//Scanner sc = new Scanner(System.in);
			System.out.println("Choose conversion mode: " + "\n" + "1- Celcius Farenheit" + "\n" + "2- Farenheit Celcius" + "\n");
			int x = sc.nextInt();

			if (x == 1) {
				System.out.println("Value C -------------> value F" + "\n");

				//capture user input to convert the temperature to farenheit

				Scanner stdin1 = new Scanner(System.in);
				System.out.println("Enter Celcius Temperature");
				double celcius = stdin1.nextDouble();

				// call the method we made and pass the celcius into it
				myFahrenheit(celcius);

				break;

			} else if (x == 2) {
				System.out.println("value F----------------> value C" + "\n");

				//capture user input to convert the temperature to Celcius
				Scanner stdin2 = new Scanner(System.in);
				System.out.println("Enter Farenheit Temperature");
				double farenheit = stdin2.nextDouble();

				// call the method we made and pass the celcius into it
				myCelcius(farenheit);

				break;

			}
			count++;
		}

		//Scanner stdin = new Scanner(System.in);
		System.out.println("do you want to convert other temperature?" + "\n" + "1-Yes" + "\n" + "2-No");
		int choice = sc.nextInt();


		if(choice ==1) {
			System.out.println("");
		}
	}
		//here we define our method and give it one parameter, celcius
		public static void myFahrenheit(double celcius){
			double F = ((celcius * 9) / 5) + 32;
			System.out.println(" Today's F is:" + F);
		}

		//here we define our method and give it one parameter, farenheit
		public static void myCelcius(double fahrenheit){
			double C = ((fahrenheit - 32) * 5 / 9);
			System.out.println(" Today's C is:" + C);

	}
}


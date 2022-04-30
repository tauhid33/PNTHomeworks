package TempConverter;

import java.util.Scanner;

public class TempConverterPro {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int input = 0;
		int input2 = 0;
		int input3 = 0;
		
		double celsius = 0;
		double fahrenheit = 0;
		
		
		while (input2 != 2) {
			System.out.println("-----------------------------------Welcome------------------------------------------\r\n"
					+ "---Celsius-Fahrenheit/Fahrenheit-Celsius converter----");
			
			System.out.println("choose the conversion mode:\r\n"
					+ "1- Celsius-Fahrenheit\r\n"
					+ "2- Fahrenheit-Celsius");
			
			input = scanner.nextInt();
			
			
			if (input == 1) {
				
				System.out.println("Enter the temperature to convert: ");
				celsius = scanner.nextDouble();
				fahrenheit = ((celsius * 9) / 5) + 32;
				System.out.println("value C ------------------> value F: " + fahrenheit);
			
			} else if(input == 2) {
				
				System.out.println("Enter the temperature to convert: ");
				fahrenheit = scanner.nextDouble();
				celsius = ((fahrenheit - 32) * 5 / 9);
				System.out.println("value F----------------> value C: "+ celsius);
		
			} else {
			
				System.out.println("not a valid entry");
				break;
			} 
			
			while(input2 !=2) {
				System.out.println("do you want to convert other temperatures ? 1- Yes/2- No ");
				input2 = scanner.nextInt();
				if (input2 ==1) {
					
					
					
					System.out.println("-----------------------------------Welcome------------------------------------------\r\n"
							+ "---Celsius-Fahrenheit/Fahrenheit-Celsius converter----");
					
					System.out.println("choose the conversion mode:\r\n"
							+ "1- Celsius-Fahrenheit\r\n"
							+ "2- Fahrenheit-Celsius");
					
					input3 = scanner.nextInt();
					if (input3 == 1) {
					System.out.println("Enter the temperature to convert: ");
					celsius = scanner.nextDouble();
					fahrenheit = ((celsius * 9) / 5) + 32;
					System.out.println("value C ------------------> value F: " + fahrenheit);
				} else if(input3 == 2) {
					System.out.println("Enter the temperature to convert: ");
					fahrenheit = scanner.nextDouble();
					celsius = ((fahrenheit - 32) * 5 / 9);
					System.out.println("value F ------------------> value C: "+ celsius);
				} 
					
				} 
				if (input2 == 2) {
					System.out.println("Goodbye, see you soon");
					break;
				}
			}
		}
	}
}

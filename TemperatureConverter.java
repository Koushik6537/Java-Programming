import java.util.*;
class TemperatureConverter{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int exit;
		System.out.println();
		System.out.println("!------TEMPERATURE CONVERTER------!");
		while(true){
			System.out.println();
			System.out.println("1-Farhenheit to Celsius");
			System.out.println("2-Celsius to Farhenheit");
			System.out.println("3-Exit\n");
			System.out.println("Enter your choice of conversion:");
			int choice=scan.nextInt();

			switch(choice){
				case 1:
					System.out.println("Enter temperature in Farhenheit:");
					double fin=scan.nextDouble();
					double cout=farhenheitToCelsius(fin);
					System.out.printf("%.2f'F is equal to %.2f'C",fin,cout);
					System.out.println();
					System.out.println("Do you want to exit from the converter?(1-Yes,2-No): ");
					exit = scan.nextInt();
					if(exit==1){
						System.exit(0);
						break;
					} else {
						continue;
					}
				case 2:
					System.out.println("Enter temperature in Celsius:");
					double cin=scan.nextDouble();
					double fout=celsiusToFarhenheit(cin);
					System.out.printf("%.2f'C is equal to %.2f'F",cin,fout);
					System.out.println();
					System.out.println("Do you want to exit from the converter?(1-Yes,2-No): ");
					exit = scan.nextInt();
					if(exit==1){
						System.out.println("Exiting Temperature Converter,Thank You......");
						System.exit(0);
						break;
					} else {
						continue;
					}

				case 3:
					System.out.println("Exiting Temperature Converter, Thank You......");
					scan.close();
					return;
		
				default:
					System.out.println("Invalid choice. Please enter (1/2/3)");
					System.out.println();
					break;
			}
		}
	}
	public static double farhenheitToCelsius(double fin){
		return (fin - 32)*5/9;
	}
	public static double celsiusToFarhenheit(double cin){
		return (cin * 9/5)+32;
	}
}
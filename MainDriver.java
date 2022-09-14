	import java.util.Scanner;
	class MainDriver {
		public static void main(String[] args) {
			Scanner s = new Scanner(System.in);
			while(true){
			System.out.println("1 Addition \n 2 Subtraction \n 3 Multiplication \n 4 Division \n 5 Modulation \n 6 Exit");
			int choice = s.nextInt();
			switch(choice){
				case 1 :{
					System.out.println("Enter the 1st Value");
					int a = s.nextInt();
					System.out.println("Enter the 2st Value");
					int b = s.nextInt();
					int c = BasicCalculator.addition(a,b);
					System.out.println("The Addition of 1st value and 2nd Value is "+ c);
				}
					break;
				case 2 :{
					System.out.println("Enter the 1st Value");
					int a = s.nextInt();
					System.out.println("Enter the 2st Value");
					int b = s.nextInt();
					int c = BasicCalculator.subtraction(a,b);
					System.out.println("The Subtraction of 1st value and 2nd Value is "+ c);
				}
					break;
				case 3 :{
					System.out.println("Enter the 1st Value");
					int a = s.nextInt();
					System.out.println("Enter the 2st Value");
					int b = s.nextInt();
					int c = BasicCalculator.multiplication(a,b);
					System.out.println("The Multiplication of 1st value and 2nd Value is "+ c);
				}
					break;
				case 4 :{
					System.out.println("Enter the 1st Value");
					int a = s.nextInt();
					System.out.println("Enter the 2st Value");
					int b = s.nextInt();
					int c = BasicCalculator.division(a,b);
					System.out.println("The Division of 1st value and 2nd Value is "+ c);
				}
					break;
				case 5 :{
					System.out.println("Enter the 1st Value");
					int a = s.nextInt();
					System.out.println("Enter the 2st Value");
					int b = s.nextInt();
					int c = BasicCalculator.modulation(a,b);
					System.out.println("The Modulation of 1st value and 2nd Value is "+ c);
				}
					break;
				case 6 : 
					System.out.println("Thank you!!!");
					System.exit(0);
					break;
				default :
					System.out.println("Invalid Choice");
		}
	}
	}
}
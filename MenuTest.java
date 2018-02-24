import java.util.Scanner;


public class MenuTest {

	private static  Scanner scanner ;

	public static void main(String[] args) {

		Menu menu = new Menu();

		menu.addItem(new MenuItem("Add Numbers", new MenuCommand() {
			
			@Override
			public void run() {
			   scanner = new Scanner(System.in);
			   System.out.println("Please enter two numbers to add");
			   int num1 = scanner.nextInt();
			   int num2= scanner.nextInt();
			   System.out.println("Sum of two given numbers is: "+(num1+num2));
			}
		}));
		
		menu.addItem(new MenuItem("Multiply numbers",new MenuCommand() {
			
			@Override
			public void run() {
				scanner = new Scanner(System.in);
				System.out.println("Please enter two numbers to multiply");
				int num1 = scanner.nextInt();
				int num2= scanner.nextInt();
				System.out.println("Multiplication of two given numbers is: "+(num1*num2));
				
			}
		}));
		
		menu.addItem(new MenuItem("Quit", new MenuCommand() {
			
			@Override
			public void run() {
				System.out.println("Program ends");
				System.exit(0);		
			}
		}));
		
		while(true)
			menu.display();
	}

}

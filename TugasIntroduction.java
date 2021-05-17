import java.util.Scanner;
// tugas pertama (introduction)
// made by Complexx
public class TugasIntroduction {
	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner scanner = new Scanner(System.in);
		boolean flag = true;
		int input = 0;
		while(flag) {
			System.out.println("1. Start The Simulation!!");
			System.out.println("2. Close App");
			System.out.printf("Choice >> ");
			try {
				input = scanner.nextInt();
				scanner.nextLine();
			}catch(Exception e) {
				continue;
			}
			switch(input) {
				case 1:
					option1();
					break;
				case 2:
					System.out.println("Thank you for using the app!!");
					flag=false;break;
				default:
					break;
			}
		}
		scanner.close();		
	}
	public static void option1() {
		int first=0;
		int second=0;
		String dummy1;
		do {
			System.out.printf("Input the first number [0-100]: ");
			try {
				first = scanner.nextInt();
				scanner.nextLine();
			}catch(Exception e) {
				continue;
			}
		}while(first<1 || first>100);
		
		do {
			System.out.printf("Input the second number [0-100]: ");
			try {
				second = scanner.nextInt();
				scanner.nextLine();
			}catch(Exception e) {
				continue;
			}
		}while(second<1 || second>100);	
		System.out.println("Basic Java Data Types");
		float div=(float)first/(second);
		System.out.println("+================================================================================================================+");
		System.out.println("+ + (String Type) | (Character Type ) | * (Integer Type) | / (Floating Type) | input 1 == input 2 (Boolean Type) +");                              
		System.out.println("+================================================================================================================+");
		System.out.printf("+     " + "%d" + " + " + "%-7d" + "|" + "        %c %-8c" + "|" + "         %-9d" + " | " + "%-18f" + " |         " + (first==second) +"                   |+\n" ,first,second, first ,second , first*second, div);
		System.out.println("Press Enter to proceed...");
		dummy1 = scanner.next();
		System.out.printf("\n\n");
		System.out.println("Basic Arithmetic Operations");
		System.out.println("| + | - | *  | / | % |");
		System.out.printf("%d   %d  %d  %d   %d\n", first+second, first-second, first*second, first/second, first%second);
		System.out.println("Press Enter to proceed...");
		dummy1 = scanner.next();
		boolean p1=false;
		
		do {
			
			System.out.println("Give me value for p1 [true | false]: ");
			try {
				p1=scanner.nextBoolean();
				scanner.nextLine();
			} catch (Exception e) {
				System.out.println("input numbers only");
				continue;
			}
			
		}while(p1 != true && p1 != false);
		
		boolean p2=false;
		
		do {
			
			System.out.println("Give me value for p2 [true | false]: ");
			try {
				p2=scanner.nextBoolean();
				scanner.nextLine();
			} catch (Exception e) {
				System.out.println("input numbers only");
				continue;
			}
			
		}while(p2!=true && p2!=false);
		System.out.println("=================================================================");
		System.out.println("Logical Table");
		System.out.println("=================================================================");
		System.out.printf("P1 = %s, P2 = %s\n", p1==true ? "T":"F" , p2==true ? "T":"F");
		System.out.println("|\t!P1\t||\t!P2\t||\t&&\t||\t||\t|");
		System.out.println("|\t"+!p1+"\t|"+"|\t"+!p2+"\t|"+"|\t"+(p1==true && p2==true)+"\t|"+"|\t"+(p1==true||p2==true)+"\t|");
		System.out.println("=================================================================");
		System.out.println("Press anything to go back to main menu!");
		scanner.nextLine();
	}
}


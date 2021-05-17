import java.util.Scanner;

public class BlueJackMain {
	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		boolean flag = true;
		int input = 0;
		BlueJackMethods bjm = new BlueJackMethods();
		while(flag) {
			System.out.println("Options");
            System.out.println("1. Start Sharing");
            System.out.println("2. Update Participants");
            System.out.println("3. Delete Participants");
            System.out.println("4. Close App");
            System.out.printf("Choice >> ");
			try {
				input = scanner.nextInt();
				scanner.nextLine();
			}catch(Exception e) {
				continue;
			}
			switch(input) {
				case 1:
					bjm.StartSharing();break;
				case 2:
					bjm.UpdateParticipant();break;
				case 3:
					bjm.DeleteParticipant();break;
				case 4:
					flag=false;bjm.exit();break;
			}
		}
	}
}

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
public class BlueJackMethods {
	static Scanner scanner = new Scanner(System.in);
	public ArrayList<BlueJackUsers> users = 
			new ArrayList<BlueJackUsers>();
	public BlueJackMethods() {
		;
	}
	public BlueJackUsers createUser() {
		String username;
		int number = -1;
		do {
			System.out.printf("Input a number [0-100]:");
			try {
				number = scanner.nextInt();
				scanner.nextLine();
			}catch(Exception e) {
				continue;
			}
		}while(number<0 || number>100);
		do {
			System.out.printf("Could you give me your username [5 - 20 Characters]? ");
			username = scanner.next();
			scanner.nextLine();
		}while(!validasi(username));
		BlueJackUsers newPerson = new BlueJackUsers(number,username);
		return newPerson;
	}
	public void StartSharing() {
		BlueJackUsers newPerson = createUser();
		this.users.add(newPerson);
		System.out.printf("You are the %d that joins the game\n",this.users.size());
		System.out.printf("Your share number : %d\n",newPerson.getNumber());
		System.out.println("Press Anything to continue...");
		scanner.nextLine();
	}
	public void UpdateParticipant() {
		if(this.users.size()==0) {
			System.out.println("There is no data");
			System.out.println("Press Anything to continue...");
			scanner.nextLine();
			return;
		}else {
			int input = -1;
			do {
				System.out.println("+============================================+");
				System.out.println("+ Share List                                 +");
				System.out.println("+============================================+");
				int num = 1;
				for (int i=0;i<this.users.size();i++) {
					System.out.printf("| %d\t| %s\t| %d\t|\n",num,this.users.get(i).getUsername(),this.users.get(i).getNumber());
					num++;
		        }
				System.out.println("+============================================+");
				System.out.printf("Which participant you would like to update [1 - %d][0 to exit]? ",this.users.size());
				try {
					input = scanner.nextInt();
				}catch(Exception e) {
					continue;
				}
			}while(input<0 || input>this.users.size());
			if(input==0) {
				return;
			}
			BlueJackUsers updatePerson = createUser();
			this.users.set((input-1), updatePerson);
			System.out.println("Update successful!");
			scanner.nextLine();
		}
	}
	public void DeleteParticipant() {
		if(this.users.size()==0) {
			System.out.println("There is no data");
			System.out.println("Press Anything to continue...");
			scanner.nextLine();
			return;
		}else {
			int input = -1;
			do {
				System.out.println("+============================================+");
				System.out.println("+ Share List                                 +");
				System.out.println("+============================================+");
				int num = 1;
				for (int i=0;i<this.users.size();i++) {
					System.out.printf("| %d\t| %s\t| %d\t|\n",num,this.users.get(i).getUsername(),this.users.get(i).getNumber());
					num++;
		        }
				System.out.println("+============================================+");
				System.out.printf("Which participant you would like to update [1 - %d][0 to exit]? ",this.users.size());
				try {
					input = scanner.nextInt();
				}catch(Exception e) {
					continue;
				}
			}while(input<0 || input>this.users.size());
			if(input==0) {
				return;
			}
			this.users.remove((input-1));
			System.out.println("Participant successfully removed from event!");
			scanner.nextLine();
		}
	}
	public void exit() {
		this.users = alphaSort(this.users);
		ArrayList<Integer> shuffling = new ArrayList<Integer>();
		for(int i=0;i<this.users.size();i++) {
			shuffling.add(this.users.get(i).getNumber());
		}
		Collections.shuffle(shuffling, new Random());
		for(int i=0;i<this.users.size();i++) {
			this.users.get(i).setAfterNumber(shuffling.get(i));
		}
		System.out.println("Here's the completed share list");
		System.out.println("Remember, sharing is caring, happy sharing :D");
		System.out.println("+============================================+");
		System.out.println("+ Share List                                 +");
		System.out.println("+============================================+");
		System.out.println("+ Username          | Before     | After     +");
		System.out.println("+============================================+");
		for(int i=0;i<this.users.size();i++) {
			System.out.printf("| %s\t| %d\t| %d\t|\n",
					this.users.get(i).getUsername(),this.users.get(i).getNumber(),this.users.get(i).getAfterNumber());
		}
		System.out.println("+============================================+");
	}
	public boolean validasi(String name) {
		if(name.length()<5 && name.length()>20){
            return false;
        }
		if(this.users.size()>0) {
			for (BlueJackUsers user: this.users) {
	            if(name.equals(user.getUsername()))
	            {
	                return false;
	            }
	        }
		}
		return true;
	}
	public ArrayList<BlueJackUsers> alphaSort(ArrayList<BlueJackUsers> users2) {
		for(int i=0;i<users2.size()-1;i++) {
			for(int j=i+1;j<users2.size();j++) {
				if(users2.get(i).getUsername().compareTo(users2.get(j).getUsername()) > 0) {
					BlueJackUsers temp = users2.get(i);
					this.users.set(i, users2.get(j));
					this.users.set(j, temp);
				}
			}
		}
		return users2;
	}
}
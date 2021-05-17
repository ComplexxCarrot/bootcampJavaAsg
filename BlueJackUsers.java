
public class BlueJackUsers {
	private int number;
	private String username;
	private int afterNumber;
	public BlueJackUsers(int number,String username){
		this.number=number;
		this.username=username;
		this.afterNumber = 0;
	}
	public int getNumber() {
		return this.number;
	}
	public void setNumber(int number) {
		this.number=number;
	}
	public String getUsername() {
		return this.username;
	}
	public void setUsername(String username) {
		this.username=username;
	}
	public void setAfterNumber(int num) {
		this.afterNumber = num;
	}
	public int getAfterNumber() {
		return this.afterNumber;
	}
}

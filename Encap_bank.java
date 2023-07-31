package Adarsh;

public class Encap_bank {
	
	String Bank_name;
	String Branch_name;
	private int Pin_no;
	private int Account_no;
	String Ac_holder_name;
	
	public void setPin_no(int pin) {
		this.Pin_no = pin;
	}
	
	public int getPin_no() {
		return Pin_no;
	}
	
	public void setAccount_no(int ac) {
		this.Account_no = ac;
	}
	
	public int getAccount_no() {
		return Account_no;
	}
	
	/*public void display_detail() {
		System.out.println("Your Bank Name is " + Bank_name);
		System.out.println("Your Branch Name is " + Branch_name);
		System.out.println("Your Pin Number is " + Pin_no);
		System.out.println("Your Account Number is " + Account_no);
		System.out.println("Your Name is " + Ac_holder_name);
	}*/
	
	
  
}

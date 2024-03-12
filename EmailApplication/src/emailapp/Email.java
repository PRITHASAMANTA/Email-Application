package emailapp;
import java.util.*;
public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private int defaultPasswordLength=10;
	private String depertment;
	private String email;
	private int mailboxCapacity =500;
	private String alternateEmail;
	private String companySuffix = "ayecompany.com";
	
	//constructor to receive the first name and last name//
	
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		System.out.println("EMAIL CREATED :"+ this.firstName + " " + this.lastName);
	
		
		//call a mess asking for the depertment and return the dept//
	
	this.depertment = setDepertment();
	//System.out.println("Depertment is:"+ this.depertment);
	
	//call a method that generate a random password//
	
	this.password = randomPassword(defaultPasswordLength);
	System.out.println("Your password is:"+ this.password);
	
	email=firstName.toLowerCase()+ "." + lastName.toLowerCase() + "@" + depertment + "." + companySuffix;
	//System.out.println("your email is :" + email);
	}
	
	//Ask for the dept//
		
		private String setDepertment() {
			System.out.print("new worker:" + firstName + "DEPERTMENT CODES\n1 for sales\n2 for development\n3for accounting\n0 for none\nEnter the depertment code:");
			Scanner sc = new Scanner(System.in);
			
			int deptChoice = sc.nextInt();
			if(deptChoice == 1) {return "sales";}
			
			else if(deptChoice == 2) {return "dev";}
			
			else if(deptChoice == 3) { return "account";}
			else {return "";}
		}
	
	
	
	
	
	//generate a random password//
		private String randomPassword(int length) {
			String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ#%$@0123456789";
			char[] password = new char[length];
			for(int i=0;i<length;i++) {
				int rand = (int)(Math.random() * passwordSet.length());
				password[i]= passwordSet.charAt(rand);
			}
			return new String (password);
		}
	
	//set mail box capacity//
		
		public void setMailboxCapacity(int capacity) {
			this.mailboxCapacity = capacity;
		}
		
	//set alternate Email//
		
		public void setalternateEmail(String altEmail) {
			this.alternateEmail = altEmail;
		}
	
	//alternate password//
		 void changePassword(String password) {
			this.password = password;
		}
		 public int getMailboxCapacity() {
			 return mailboxCapacity;
		 }

		 public String getAlternateEmail() {return alternateEmail;}
		 public String getPassword() {return password;}
		 
		 public String showInfo(){
			 return "DISPLAY NAME:" +firstName+ " " +lastName+
					 "\nCOMPANY EMAIL : " + email +
					 "\nMAILBOX CAPACITY:" + mailboxCapacity + "mb";
		 }

}

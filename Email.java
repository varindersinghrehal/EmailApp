package emailApp;

import java.util.Scanner;

public class Email {

	private String email;
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private int mailboxCapacity = 500;
	private int defaultPasswordLength = 10;
	private String alternateEmail;
	private String companysuffix = "begearcompany.com";

	//constructor to receive the first name and last name
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		//System.out.println("EMAIL CREATED: " + this.firstName + " " + this.lastName);

		// call a method asking for the department - return department
		this.department = setDepartment();
		//System.out.println("Department: " + this.department);

		// call a method that returns a random password
		this.password = randomPassword(defaultPasswordLength);
		System.out.println("Your password is: " + this.password);

		// combile elements to generate email
		email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + companysuffix;
		//System.out.println("Your email is: " + email);
	}

	//ask for the department
	private String setDepartment () {
		System.out.println("Department Codes\n1 for sales\n2 for department\n3 for accounting\n4 for name\nEnter department code: ");
		Scanner in = new Scanner(System.in);
		int depChoice = in.nextInt();		

		if (depChoice == 1) {
			return "sales"; 
		}else if(depChoice == 2) {
			return "development";
		}else if(depChoice == 3) {
			return "accounting";
		}else {
			return "";
		}

	}
	//generate a random password
	private String randomPassword(int length) {
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
		char[] password = new char[length];
		for (int i = 0; i < length; i++) {
			int rand = (int) (Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(rand);
		}
		return new String (password);
	}

	// set the mailbox capacity
	public void setMailboxCapicity(int capicity) {
		this.mailboxCapacity = capicity;
	}

	//set the alternate email
	public void setAlternateEmail(String altEmail) {
		this.alternateEmail = altEmail;
	}

	// change the password
	public void changePassword(String password) {
		this.password = password;
	}
	public int getMailboxCapicity() {
		return mailboxCapacity;
	}

	public String getAlternativeEmail() {
		return alternateEmail;
	}
	public String getPassword() {
		return password;
	}
	public String showInfo() {
		return "DISPLAY NAME:" + firstName + 
				" " + lastName + "\nCOMPANY MAIL: " + 
				email + "\nMAILBOX CAPICITY: " 
				+ mailboxCapacity + "mb"
				;
	}
}

import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private int mailboxCapacity;
	private String alternateEmail;

	// Constructor to receive first name and last name
	public Email (String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		System.out.println("Email Created: " + this.firstName + " " + this.lastName);

		// Call a method asking for the department - return the department
		this.department = setDepartment();
		System.out.println("Depepartment: " + this.department);
	}

	// ask for department
	private String setDepartment() {
		System.out.print("Department Codes:\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\nEnter department code: ");
		Scanner in = new Scanner(System.in);
		int depChoice = in.nextInt();
		if (depChoice == 1) return "sales";
		else if (depChoice == 2) return "dev";
		else if (depChoice == 3) return "acct";
		else return "";
	}

	// generate random password

	// set alternate email

	// change the password
}
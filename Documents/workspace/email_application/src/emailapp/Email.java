package emailapp;

import java.util.Scanner;

public class Email {
	
		// TODO Auto-generated method stub
		private String firstName;
		private String lastName;
		private String department;
		private String password;
		private String email;
		private int mailboxCapacity = 500;
		private int defaultPasswordLength = 10;
		private String alternateEmail;
		private String companySuffix = "aycompany.com";
	
		
		//constructor
		public Email(String firstName, String lastName, String department, String password, int mailboxCapacity,
				String alternateEmail) {
			super();
			this.firstName = firstName;
			this.lastName = lastName;
			this.department = department;
			this.password = password;
			this.mailboxCapacity = mailboxCapacity;
			this.alternateEmail = alternateEmail;
			
			//calling method
			this.department = setDepartment();
			System.out.println("Department: " + this.department);
			
			this.password = randomPassword(defaultPasswordLength);
			System.out.println("your password is: "+ this.password);
			
			
			//combine elements to generate email
			
			email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "."+ companySuffix;
			System.out.println("Your email is: "+ email);
			
			
		}
		
		//ask for the department
		private String setDepartment(){
			System.out.println("enter the department \n1 for the accounting \n0 for none");
			Scanner in = new Scanner(System.in);
			int depChoice = in.nextInt();
			if (depChoice == 1){
				return "sales";
			}
			else if (depChoice == 2) {return "dev";}
			else if (depChoice == 3) {return "acct";}
			
			else{return "";}
		}
	
		

		//generate a random password
		private String randomPassword(int length){
			String passwordSet = "ABCDEFGHIJKLMNOP";
			char[] password = new char[length];
			for (int i = 0; i <length; i++){
				int rand = (int) (Math.random() * passwordSet.length());
				
				password[i] = passwordSet.charAt(rand);
				
			}
			return new String( password);
		}
		
		
		
		
		// set the mailbox capacity
		public void setMailboxCapacity(int capacity){
			this.mailboxCapacity = capacity;
		}
		
		
		
		
		//set the alternate email
		public void setAlternateEmail(String altEmail){
			this.alternateEmail = altEmail;
		}
		
		
		

		//change password
		public void changePassword(String password){
			this.password = password;
		}
		
		
		public int getMailboxCapacity(){
			return mailboxCapacity;
			}
		public String getAlternateEmail(){return alternateEmail;}
		
		public String getPassword(){return password;}
		
		
	}



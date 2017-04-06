import java.util.Scanner;

public class AccountRecordTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccountRecord application = new AccountRecord();
		Scanner input = new Scanner( System.in );
		System.out.printf("Please enter Account No, First Name, Last Name and Balance\n");
		application.setAccount( input.nextInt() );
		application.setFirstName(input.next() );
		application.setLastName( input.next() );
		application.setBalance( input.nextDouble() );
		
		System.out.printf("\n%s: %d\n%s: %s\n%s: %s\n%s: %.2f", "Account NUmber", application.getAccount(),
				"First Name", application.getFirstName(), 
				"Last Name", application.getLastName(),
				"Balance", application.getBalance() );
	}	// end method main
}	// end class AccountRecordTest

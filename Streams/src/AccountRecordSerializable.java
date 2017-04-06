// A class that represents one record of information

import java.io.Serializable;


public class AccountRecordSerializable implements Serializable {

		private int account;
		private String firstName;
		private String lastName;
		private double balance;
		
		// no-argument construct calls other constructor with default values
		public AccountRecordSerializable() {
			this( 0, "", "", 0.0 );		// call four-argument constructor 
		}	// end no-argument AccountRecord constructor

			// Initialize a record
		public AccountRecordSerializable( int acct, String first, String last, double bal ) {
			
			setAccount( acct );
			setFirstName( first );
			setLastName( last );
			setBalance( bal );
		}	// end four-argument AccountRecord constructor
		
		// set account number
		public void setAccount( int acct )
		{
			account = acct;
		}	// end method setAccount
		
		// get account number
		public int getAccount() {
			return account;
		}	// end method getAccount
		
		// set first name
		public void setFirstName( String first ) {
			firstName = first;
		}	// end method setFirstName
		
		// get first name
		public String getFirstName() {
			return firstName;	
		}	// end method getFirstName
		
		// set last Name
		public void  setLastName( String last ) {
			lastName = last;
		}	// end method setLastName
		
		public String getLastName() {
			return lastName;
		} // end method getLastName
		
		// set balance 
		public void setBalance( double bal ) {
			balance = bal;
		}	// end method setBalance
		
		//	get balance
		public double getBalance() {
			return balance;
		}	// end method getBalance
}	// end method AccountRecord



//Check account name - minimum 10 character, should not have any number
//Check Balance - Should not be negative
//Check account id - should not negative and length should be exact 5 digits

package PracticePrograms;

public class BANK {

	 String accountname = "MaheshDh11" ;
	 int balance = -10000;
	 int accountid= 12345;
	
	 
	 
	boolean accountnamecheck()
	{
		boolean accountvalidinvalid=false;
	
		if(accountname.length() < 10)
		{
			System.out.println("The account name is invalid");
			 accountvalidinvalid = false;
			
		}
		else
		{
			System.out.println("The account name is valid");
			accountvalidinvalid =  true;
		}
		return accountvalidinvalid;
		
	}
	
	
	boolean balancecheck()
	{
		boolean balancevalidinvalid=false;
		if(balance < 0)
		{
			System.out.println("The account balance is invalid");
			 balancevalidinvalid = false;
		}
		else
		{
			System.out.println("The account balance is valid");
			 balancevalidinvalid = true;
		}
		return balancevalidinvalid;
	}
	
	boolean accountidcheck()
	{  
		int accountid1 = Integer.toString(accountid).length();
		//System.out.println(accountid1);
		boolean accountidvalidinvalid=false;
		if(accountid1 < 5 || accountid1 > 5 || accountid < 0)
		{
			System.out.println("The account id is invalid");
			accountidvalidinvalid = false;
		}
		else	
		{
			System.out.println("The account id is valid");
			accountidvalidinvalid = true;
		}
		return accountidvalidinvalid;
	}
	
	public static void main(String[] args) {
		
		BANK sbi = new BANK();
		sbi.accountnamecheck();
		sbi.balancecheck();
		sbi.accountidcheck();
	}

}

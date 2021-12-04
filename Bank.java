import java.util.*;


class Bank
{
	public static void main(String args[])
	{
	String name;
	int ch;
	Scanner sc = new Scanner(System.in);
		
	Account sav = new Sav_Acct();
	Account cur = new Curr_Acct();
	while(true){

	System.out.println("Enter the type of the account\n1.Savings\n2.Current\n\n");
	
	ch = sc.nextInt();
	; 
	
	switch(ch){
		case 1: System.out.println("Enter your name : ");
			name = sc.next();
			sav.displaysheet(name);
			break;
		case 2: System.out.println("Enter your name : ");
			name = sc.next();	
			cur.displaysheet(name);
			break;
		default: System.out.println("\nWrong choice!!\n");
			return;
		}//for switch
		

	}
    }//for while
}


abstract class Account
{
  	String name;
	double amount;
	double balance = 20000;
	abstract void displaysheet(String name);

}

class Sav_Acct extends Account
{
		//provides compund interest, withdrawal facilities but no chequebook


		void displaysheet(String name)
		{
			System.out.println("Do you want to:\n1.Check interest\n2.Withdraw amount\n3.");
			int ch;
			Scanner sc =new Scanner(System.in);
			
			ch = sc.nextInt();
			double interest;
			
			double interestrate = 10/100;
			int numberperyear = 12;
			
			int  years = 4;			
			switch(ch)

			{

				case 1: System.out.println("Enter the amount you want to check interest for:");
					amount = sc.nextDouble();

					interest = amount*(Math.pow(1+(interestrate/numberperyear), years)) - amount;
					
					System.out.println("The interest at the interest rate of "+interestrate+" for a period of "+years+" years, will amount to 	

							"+interest);
					break;
				case 2: System.out.println("Enter the amount to withdraw: ");

					amount = sc.nextDouble();
					System.out.println("Amount after withdrawal of "+amount+" is "+(balance-amount));

					break;
				default: System.out.println("Wrong option"); return;


			}			

		}
}

class Curr_Acct extends Account
{
		//provides cheque book but no  interest
		//holders should maintain a minimum balance, otherwise service charge is imposed
	void displaysheet(String name)
	{
		
		

		
		System.out.println("Enter your choice: \n1.Display chequebook\n2.withdraw");
		int ch;
		Scanner sc = new Scanner(System.in);
		ch = sc.nextInt();
		
		switch(ch)
		{
			case 1: System.out.println("NAME OF ACCOUNT HOLDER: "+name+"\nAMOUNT IN BANK ACCOUNT :"+balance);
				break;
			case 2: System.out.println("Enter the amount that is to be withdrawn : ");
				amount = sc.nextDouble();

				if((balance-amount)<10000) {
				System.out.println("Balance will go below minimum require bal of 10k rupees, please head to the bank pay a service fee of rupees :"     

                                               +((10/100)*(balance - amount)));
							}
				else
				{	balance = balance - amount;
					System.out.println("NAME OF ACCOUNT HOLDER: "+name+"\nAMOUNT IN BANK ACCOUNT :"+balance);
					break;
					
					}
			default: System.out.println("Wrong choice");

		}
	

	}
		


}

//these two classes accept deposit
//display bal
//compute and deposit interest
//permit withdrawal and update balance
//check for minimum balance

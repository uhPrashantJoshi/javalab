import java.util.*;
import java.lang.Math.*;
class account{
  String name;
  int actno;
  float bal;
  void accept()
  { 
   Scanner sc=new Scanner(System.in);
   System.out.println("\nEnter the account name: ");
   name=sc.nextLine();
   System.out.println("\nEnter the account number: ");
   actno=sc.nextInt();
   System.out.println("\nEnter the account balance: ");
   bal=sc.nextFloat();
  }
  void display()
  {
   System.out.println("Details");
   System.out.println("Name: "+name+"\nAccount number: "+actno+"\nAccount balance: "+bal);
  }
  void deposits()
  {
   Scanner sc=new Scanner(System.in);
   System.out.println("Do you want to deposit(1-yes, 2-no)?: ");
   int d=sc.nextInt();
   if(d==1)
   {  System.out.println("Enter the amount to be deposited: ");
      int amt=sc.nextInt();
      bal=bal+amt;
      System.out.println("Available balance: "+bal);
   }
  }   
}

class current extends account{
  float servicechg=100;
  void cheque()
  { System.out.println("Cheque service is available");  }
  void withdrawal()
  { float amount;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the amount to be withdrawn (min bal=Rs 1000): ");
    amount=sc.nextFloat();
    if(amount>bal)
     {  System.out.println("Insufficient balance");  }
    else
     {  bal=bal-amount;
        if(bal<1000)
          { bal=bal-servicechg;
            System.out.println("Service charge of Rs."+servicechg+" is added");
            System.out.println("Available balance= "+bal);
          }
        else
          {
           System.out.println(amount+" withdrawn");
           System.out.println("Available balance= "+bal);
          }
     }
  }
}


class savings extends account{
  void cheque()
  { System.out.println("Cheque service is not available");  }
  void cmpdint()
  { int t,n,p;
    double r,amt,ci;
    Scanner sc=new Scanner(System.in);
    System.out.println("\nCompound interest");
    System.out.println("Enter the principal amount: ");
    p=sc.nextInt();
    System.out.println("Enter the rate of interest, time elapse: ");
    r=sc.nextDouble();
    t=sc.nextInt();
    System.out.println("Enter the no of times interest to be applied: ");
    n=sc.nextInt();
    amt=p*Math.pow(1 + (r / n), n * t);
    ci=amt-p;
    System.out.println("Compound interest after "+t+" years= "+ci);
  }
    
  void withdrawal()
  { float amount;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the amount to be withdrawn: ");
    amount=sc.nextFloat();
    if(amount>bal)
     {  System.out.println("Insufficient balance");  }
    else
     {  bal=bal-amount;   
        System.out.println(amount+" withdrawn");
        System.out.println("Available balance= "+bal);
     }
  }
}


class Bank{ public static void main(String args[])
{Scanner sc= new Scanner(System.in);
 int ch;
 savings ob1= new savings();
 current ob2= new current();
 System.out.println("Enter account type\n1.Savings\n2.Current");
 ch=sc.nextInt();
 switch(ch)
  { 
   case 1: ob1=new savings();
           ob1.accept();
  	   ob1.display();
           ob1.cheque();
  	   ob1.deposits();
           ob1.cmpdint();
  	   ob1.withdrawal();
	   break;
   case 2: ob2=new current();
           ob2.accept();
           ob2.display();
           ob2.cheque();
           ob2.display();
           ob2.withdrawal();
	   break;
   default: System.out.println("Invalid Input");
  }
 }
}

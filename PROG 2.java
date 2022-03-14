import java.util.*;
class student{
	String usn;
	String name;
	int n,i;
	double sgpa=0;
	int credit[];
	int tcredits=0;
	double marks[];
	Scanner sc=new Scanner(System.in);

	void accept()
	{
	System.out.println("Enter student name: ");
	name=sc.nextLine();
	System.out.println("Enter USN: ");
	usn=sc.nextLine();
	System.out.println("Enter the number of subjects: ");
	n=sc.nextInt();
	credit=new int[n];
	marks= new double[n];
	System.out.println("Subject Details: ");
	for(i=0;i<n;i++)
	{ 
		System.out.println("Enter credits for subject "+(i+1));
		credit[i]=sc.nextInt();
		System.out.println("Enter marks for subject "+(i+1));
		marks[i]=sc.nextInt();
		calculate(credit[i],marks[i],i);
	}}
	
	void calculate(int credits,double marks,int j)
	{ tcredits=tcredits+credits;
	  if(marks>=90 && marks<=100)
	  { sgpa=sgpa+(10*credits); }
	  else if(marks>=80 && marks<=89)
	  { sgpa=sgpa+(9*credits); }
	  else if(marks>=70 && marks<=79)
	  { sgpa=sgpa+(8*credits); }
          else if(marks>=60 && marks<=69)
	  { sgpa=sgpa+(7*credits); }
	  else if(marks>=50 && marks<=59)
	  { sgpa=sgpa+(6*credits); }
	  else if(marks>=40 && marks<=49)
	  { sgpa=sgpa+(5*credits); }
	  else {System.out.println("Failed in subject"+(j+1)); }
	}
        void display()
        {
	 System.out.println("Details");
	 System.out.println("Name: "+name);
	 System.out.println("USN: "+usn);
	 System.out.println("SGPA of student= "+(sgpa/tcredits));
	}}
class main{ public static void main(String args[])
{	student s1=new student();
            s1.accept();
	    s1.display();}
	  }

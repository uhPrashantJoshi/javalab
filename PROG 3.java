import java.util.*;
class book
{
 String name;
 String author;
 int price;
 int num_pages;
 book()
 {}
 book(String name,String author,int price, int num_pages){
	this.name=name;
	this.author=author;
	this.price=price;
	this.num_pages=num_pages;
 }

void accept(){
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter the name of the book:");
 name=sc.nextLine();
 System.out.println("Enter the author of the book:");
 author=sc.nextLine();
 System.out.println("Enter the price of the book:");
 price=sc.nextInt();
 System.out.println("Enter the number of pages of the book:");
 num_pages=sc.nextInt();
}

 public String toString()
 { 
  return("Name: "+name+"\nAuthor: "+author+"\nPrice: "+price+"\nNumber of pages: "+num_pages);
 }
}
class bookdet{ public static void main(String args[])
{
 int n,i;
 Scanner sc=new Scanner(System.in);
 book b1=new book("AHE","MNO",399,500);
 System.out.println("Constructor values:\n"+b1);
 
 System.out.println("Enter the number of books: ");
 n=sc.nextInt();
 book b[]=new book[n];
 for(i=0;i<n;i++)
 {  b[i]=new book();
    System.out.println("Enter details of Book "+(i+1));
    b[i].accept();
    
 }
 for(i=0;i<n;i++)
 { System.out.println("~~~~~~~Details of Book "+(i+1)+"~~~~~~~");
   System.out.println(b[i]);
 }
}
} 

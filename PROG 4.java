import java.util.*;
abstract class shape{
       double a,b;
       abstract void printarea();
}
       
class triangle extends shape{ 
	void getdata(double x,double y)
        { 
		a=x;b=y; 
	}
        void printarea()
        { 
         double area=0.5*a*b;
         System.out.println("Area of triangle= "+area);
        }
}

class rectangle extends shape{
	void getdata(double x,double y)
        { a=x;b=y; }
        void printarea()
        {double area=a*b; 
         System.out.println("Area of rectangle= "+area);
        }
}

class circle extends shape{
	void getdata(double x)
        { a=x; }
        void printarea()
        { double area=3.142*a*a;
         System.out.println("Area of circle= "+area);
        }
}

class abstarea{public static void main(String args[])
{ int ch;
  shape si;
  Scanner sc=new Scanner(System.in);
  rectangle r=new rectangle();
  triangle t=new triangle();
  circle c=new circle();
  System.out.println("1. Area of rectangle\n2. Area of triangle\n3.Area of circle\nEnter your choice");
  ch=sc.nextInt();
  switch(ch)
  {
   case 1: System.out.println("Enter length and breadth: ");
           double l=sc.nextDouble();
           double b=sc.nextDouble();
	   r.getdata(l,b);
           r.printarea();
           break;
   case 2: System.out.println("Enter base and height: ");
           double b1=sc.nextDouble();
           double h=sc.nextDouble();
	   t.getdata(b1,h);
           t.printarea();
           break;
   case 3: System.out.println("Enter radius: ");
           double r1=sc.nextDouble();
           c.getdata(r1);
           c.printarea();
           break;
   default: System.out.println("Invalid input");
  }
 }
}  

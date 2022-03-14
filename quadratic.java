import java.util.*;
class QuadRoot
{
public static void main(String args[])
{
int a,b,c,res;
float root1,root2,disc;
System.out.println("Enter the values of a,b,c:\n");
Scanner sc=new Scanner(System.in);
a=sc.nextInt();
b=sc.nextInt();
c=sc.nextInt();
disc=(b*b)-(4*a*c);
if(disc>0)
res=1;
else if(disc<0)
res=-1;
else
res=0;
switch(res)
{
case 1:
System.out.println("Root are real");
root1=((-1*b)+(float)(Math.sqrt(disc)))/(2*a);
root2=((-1*b)-(float)(Math.sqrt(disc)))/(2*a);
System.out.println("roots1:"+root1+"\nroot2:"+root2);
break;

case -1:
System.out.println("roots are imaginary");
disc=(-1)*disc;
float r1=(-b)/(2*a);
root1=((float)Math.sqrt(disc))/(2*a);
System.out.println("roots are:"+r1+"+i"+root1);
System.out.println(r1+"-i"+root1);
break;

case 0:System.out.println("roots are equal");
root1=root2=(-b)/(2*a);
System.out.println("roots are:"+root1+" "+root2);
break;
}
}
}

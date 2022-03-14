import java.util.*;
class fatherage extends Exception
{
    public String toString()
    {   return ("Father's age is less than 0"); }
}

class sonage extends Exception
{
    int a;
    sonage(int age){ a=age; }
    public String toString()
    {
        if (a<0)
        {
            return("Son's age is less than 0");
        }
        else 
        {   return("Son's age is greater than or equal to father's age, which isn't possible."); }
    }
}

class father
{
    public int agel;
    Scanner sc=new Scanner(System.in);
    int age1;
    father()
    {
        System.out.println("Enetr father's age: ");
        age1=sc.nextInt();
    }
    void ex1() throws fatherage
    {
        if(age1<0)
        {   throw new fatherage(); }
    }
}

class son extends father
{
    public int age2;
    Scanner sc=new Scanner(System.in);
    son()
    {
        System.out.println("Enter son's age: ");
        age2=sc.nextInt();
    }
    void ex2() throws sonage
    {
        if(age2 <0 || age2 > super.age1)
        {   throw new sonage (age2); }
    }
}

class Main{
    public static void main(String[] args) {
    son s=new son();
        try {
            s.ex1();
        }
        catch(fatherage e){
            System.out.println(e);
        }
        try{
            s.ex2();
        }    
        catch (sonage e) {
            System.out.println(e);
        }
    }
 }

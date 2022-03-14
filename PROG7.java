class Gen<T,V>{
    T ob1;
    V ob2;
   Gen(T x, V y)
   { ob1=x; ob2=y; }

   T getob1()
   { return ob1; }

   V getob2()
   { return ob2; }

   void showType()
   {
     System.out.println("value of T is "+ob1.getClass().getName());
     System.out.println("value of V is "+ob2.getClass().getName());
   }
}

class multigen{  public static void main(String args[])
    {
        Gen<Integer,String> iob;
        iob=new Gen<Integer,String>(12," 'Blue Blood Web Series' ");
        int x=iob.getob1(); 
        System.out.println("The value for x is"+" "+x);
        String y=iob.getob2();
        System.out.println("The value for y is "+y);
        iob.showType();
    }
}

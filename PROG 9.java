import java.util.*;
class multithread implements Runnable
{
    Thread t;
    String a;
    int b;
    multithread(String s, int n)
    {
        a=s; b=n;
        t=new Thread(this,"Thread");
        t.start();
    }
    public void run()
    {
        try {
            for(int i=5;i>0;i--)
            {
                System.out.println(a);
                Thread.sleep(b);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread exception");
        }
    }
}

class thread{
    public static void main(String[] args) {
        multithread n=new multithread("BMS College of Engineering",10000);
        multithread m=new multithread("CSE",2000);    
    } 
    
}

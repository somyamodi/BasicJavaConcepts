import java.lang.Exception;
class Abc extends Thread{
    public void run()
    {
        try
        {
        System.out.println ("Thread " + 
                  Thread.currentThread().getId() + 
                  " is running");
        }

        catch(Exception e) 
        { 
            // Throwing an exception 
            System.out.println ("Exception is caught"); 
        } 
    }}
public class Threads {
    
    public static void main(String[] args) {
        int n=2;
        for(int i=0;i<n;i++)
        {
            Threads obj=new Threads();
            Abc obj1=new Abc();
            obj1.start();
        }
    }
}

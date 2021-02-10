
public class Exception2
{
    public static void main(String[] args) {
        
        int a=10,b=0,c;
        try{
            
            c=a/b;
            System.out.println("try block");
        }
        catch(ArithmeticException e){
            System.out.println("catch block");
            
        }
        finally{
            System.out.println("Finally block");
        }
        
    }
}

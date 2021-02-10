
class Abc<T, U>
{
    T a;
    U b;
    Abc(T a, U b)
    {
        this.a=a;
        this.b=b;
    }
    void display()
    {
        System.out.println(a);
        System.out.println(b);
    }
}
public class Generics2 {
    public static void main(String[] args) {
        Abc<String,Integer>a1=new Abc<String,Integer>("Somya",100);
        
        a1.display();
        
    }
}

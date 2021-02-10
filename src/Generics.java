
class Abc<T>
{
    T a;
    Abc(T a)
    {
        this.a=a;
    }
    void display()
    {
        System.out.println(a);
    }
}
public class Generics {
    public static void main(String[] args) {
        Abc<Integer>a1=new Abc<Integer>(100);
        Abc<String>a2=new Abc<String>("Somya");
        a1.display();
        a2.display();
    }
}

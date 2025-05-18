import java.util.Scanner;
class Animal{
    void eat()
    {
        System.out.println("eating");
    }
}
class Tiger extends Animal{
    void roaring()
    {
        System.out.println("Tiger Roaring");
    }
}
public class SingleInheritance{
    public static void main(String[] args)
    {
        Tiger t=new Tiger();
        t.eat();
        t.roaring();
    }
}

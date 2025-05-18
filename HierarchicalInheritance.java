import java.util.Scanner;
class Animal{
    void eat()
    {
        System.out.println("Eating");
    }
}
class Tiger extends Animal{
    void roaring()
    {
        System.out.println("Tiger roaring");
    }
}
class cat extends Animal{
    void meow()
    {
        System.out.println("cat Meow");
    }
}
public class HierarchicalInheritance{
    public static void main(String[] args)
    {
        cat c=new cat();
        c.meow();
        c.eat();
        Tiger t= new Tiger();
        t.roaring();
        
        
    }
}

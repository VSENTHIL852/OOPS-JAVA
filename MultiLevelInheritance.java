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
class cat extends Tiger{
    void meow()
    {
        System.out.println("cat Meow");
    }
}
public class MultiLevelInheritance{
    public static void main(String[] args)
    {
        cat c= new cat();
        c.eat();
        c.roaring();
        c.meow();
        
    }
}

import java.io.IOException;
import java.util.*;
class C
{
    public static void main(String[] args)
    {
        Animal a=new Fish();
        a.eat();
        a.z();

    }
}
class Animal
{
    void eat()
    {
        System.out.println("Animal");
    }
    void z()
    {
        
    }
}
class Fish extends Animal
{
    void eat()
    {
        System.out.println("Fish");
    }
    void z()
    {
        System.out.println("zzz");
    }
}
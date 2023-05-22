//Inheritance: Properties and methods of base class are passsed onto a derived class
public class Inheritance
{
    public static void main(String[] args) 
    {
        Fish shark=new Fish();
        shark.eat();
    }    
}

//Base Class
class Animal
{
    String color;
    void eat()
    {
        System.out.println("Eats");
    }
    void breathe()
    {
        System.out.println("Breathes");
    }
}

//Derived class
class Fish extends Animal
{
    int fins;
    void swim()
    {
        System.out.println("Swims in water");
    }
}
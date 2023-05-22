public class OOPS
{
    public static void main(String[] args) 
    {
        Pen p1=new Pen();
        p1.setColor("blue");
    }
}
class Pen
{
    String color;
    int tip;
    void setColor(String nwColor)
    {
        color=nwColor;
    }

    void setTip(int nwTip)
    {
        tip=nwTip;
    }
}

class Student
{
    String name;
    int age;
    float percentage;

    void calcPercentage(int phy,int chem,int math)
    {
        percentage=(phy+chem+math)/3;
    }
}
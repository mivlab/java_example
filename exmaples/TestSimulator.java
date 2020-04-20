import java.io.*;

class Chick extends Animal {
    int leg = 2;
    void cry(){System.out.println("wang"); super.cry();}
}
class Cat extends Animal {
    int leg = 4;
    void cry(){System.out.println("miao"); super.cry();}
}
class Animal {
    int leg = 4;
    void cry(){ System.out.println("dong"); }
}
class Simulator {
    Animal a;
    void setAnimal(Animal a){ this.a = a;}
    void playSound(){
        a.cry();
    }
}
class test
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Simulator s = new Simulator();
        Chick d = new Chick();
        Cat c = new Cat();
        System.out.println("Chick' leg is " + d.leg);
        System.out.println("Cat' leg is " + c.leg);
        s.setAnimal(d);
        s.playSound();
        s.setAnimal(c);
        s.playSound();
        //System.out.println("hi");
    }
}
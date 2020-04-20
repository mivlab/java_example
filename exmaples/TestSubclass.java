
class Student{
    String num;
}

class UndergradStudent extends Student
{
    int dorm;
}

class Person
{
    private int height;
    private int weight;
    public String id;
    void setHeight(int h)
    {
        height = h;
    }
    private void talk()
    {
        System.out.println("i am a person " + id);
    }
}
class Worker extends Person
{
    String office_num;
    void work()
    {
        System.out.println("i am a worker " + id);
    }
}

public class TestSubclass {
    public static void main(String args[])
    {
        Person p = new Person();
        Worker w = new Worker();
        p.setHeight(170);
        p.id = "123456789x";
        w.id = "987654321x";
        //p.talk();
        w.work();
        //System.out.println("hello");
    }
}

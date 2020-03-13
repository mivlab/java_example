class CJLUStudent
{
    // 成员变量
    static String schoolName = "China Jiliang University";
    String name;
    int age;

    // 构造方法
    public CJLUStudent()
    {
        super();
    }

    public CJLUStudent(String name, int age)
    {
        super();
        this.name = name;
        this.age = age;
    }

    // 成员方法
    // getXxx()/setXxx()
    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    @Override
    public String toString()
    {
        return "Student [name=" + name + ", age=" + age + "] " + schoolName;
    }
}

public class TestStudent
{
    public static void main(String[] args)
    {
        // 创建学生数组(对象数组)。
        CJLUStudent [] students = new CJLUStudent[5];

        // 创建5个学生对象，并赋值。
        students[0] = new CJLUStudent("一", 27);
        students[1] = new CJLUStudent("二", 30);
        students[2] = new CJLUStudent("三", 30);
        students[3] = new CJLUStudent("四", 12);
        students[4] = new CJLUStudent("五", 35);

        // 遍历
        for (int x = 0; x < students.length; x++)
        {
            System.out.println(students[x]);
            //System.out.println(students[x].schoolName);
            System.out.println(CJLUStudent.schoolName);
        }
    }
}


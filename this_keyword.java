class Human1
{
    private int age;
    private String name;

    public int getAge() {
        return age;
    }
    public void SetAge(int age)
    {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
public class this_keyword {
    public static void main(String[] args) {
        Human1 obj=new Human1();
        System.out.println(obj.getName()+" : "+obj.getAge());
        obj.SetAge(30);
        obj.setName("Reddy");
        System.out.println(obj.getName()+" : "+obj.getAge());
    }
}

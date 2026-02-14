class Human2
{
    private int age;
    private String name;
// Constructor is same as method but without return type or no return type is needed
    public Human2() {
        age=12;
        name="John";
//        System.out.println("in constructor");
    }
    public int getAge(){
        return age;
    }
    public void SetAge(int age) {
        this.age=age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name=name;
    }
}
public class constructors {
    public static void main(String[] args) {
        Human2 obj=new Human2();
        Human2 obj1=new Human2();
        System.out.println(obj.getName()+" : "+obj.getAge());

//        obj.SetAge(30);
//        obj.setName("Reddy");
        //System.out.println(obj.getName()+" : "+obj.getAge());
    }
}

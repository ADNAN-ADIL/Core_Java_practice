class Human{
//    int age;
//    private int age = 11;
    private int age;
//    String name;
//    private String name = "Adnan";
    private String name;

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
public class Encapsulation {
    public static void main(String[] args) {
        Human obj = new Human();
//        obj.age = 11;
        obj.setAge(25);
//        obj.name = "Adil";
        obj.setName("Uzma");
        System.out.println(obj.getName() + " : " + obj.getAge());
    }
}

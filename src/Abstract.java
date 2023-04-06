abstract class Aminal
{
    String name;
    abstract public void Hello();
}
class Pig extends Aminal{
    private String name;
    private String age;


    @Override
    public void Hello() {
        System.out.println("Hello, java");
    }

    public Pig(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public Pig() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getAge() {
        return age;
    }
}

public class Abstract{
    public static void main(String[] args)
    {
        Pig a = new Pig();
        a.Hello();
    }


}
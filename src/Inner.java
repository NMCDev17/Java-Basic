class Test{
    public int a = 5;
    public class Inner1{
        int b = 10;
    }
}
public class Inner
{
    public static void main(String[] args)
    {
        //de tao 1 doi tuong cua class ben trong ta tao doi tuong cua lop ben ngoai;
        Test a = new Test();
        Test.Inner1 b = a.new Inner1();// sau do tao doi tuong cua lop ben trong;
        System.out.println(a.a + b.b);
    }
}
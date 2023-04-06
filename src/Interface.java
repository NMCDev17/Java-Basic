interface GiaoDien {
    void Hello();

    void HowAreYou();
}

// implements;
class DeployMent implements GiaoDien {
    public void Hello() {
        System.out.println("Hello Word");
    }

    public void HowAreYou() {
        System.out.println("How are you?");
    }
}

public class Interface {
    public static void main(String[] args) {
        DeployMent d = new DeployMent();
        d.Hello();
        d.HowAreYou();
    }
}

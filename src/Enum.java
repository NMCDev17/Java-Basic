
public class Enum {
    enum Level {
        medium,
        highlight,
        low
    }

    public static void main(String[] args) {
        Level m = Level.medium;
        System.out.println(m);
        // Lap 1 enum truy cap den cac hang so trong enum;
        for (Level x : Level.values()) {
            System.out.println(x);
        }
    }
}

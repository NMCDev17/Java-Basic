import java.util.*;

public class Array {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Nhap vao so luong phan tu trong mang: ");
        int n = Integer.parseInt(scan.nextLine());
        String[] a = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "]: ");
            a[i] = scan.nextLine();
        }
        for (String x : a) {
            System.out.print(x + " ");
        }
    }
}

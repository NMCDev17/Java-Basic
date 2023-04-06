import java.util.LinkedHashSet;
import java.util.Scanner;

public class LinkedSet {
    // tinh chat: cac phan tu trong linkedSet luu tru theo chieu input;
    // linkedSet luu tru cac phan tu khong duoc trung lap;
    // add() them 1 phan tu vao linkedSet();
    // size() tra ve so luong phan tu trong linkedSet();
    // addAll() them tat ca cac phan tu trong set 2 vao set 1
    // retail() xoa cac phan tu trong set 1 ma khong nam trong set 2
    // contains() kiem tra xem phan tu dang xet co nam trong linkedSet hay khong
    // (tra ve true or false)
    // removeAll() xoa tat cac phan tu nam trong set 1 va set 2
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        LinkedHashSet<Integer> set1 = new LinkedHashSet<>();
        int n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            int x = scan.nextInt();
            set1.add(x);
        }

        for (int x : set1)
            System.out.print(x + " ");
        System.out.println();
        LinkedHashSet<Integer> set2 = new LinkedHashSet<>();
        for (int i = 0; i < n; i++) {
            int x = scan.nextInt();
            set2.add(x);
        }
        set1.addAll(set2);
        for (int x : set1)
            System.out.print(x + " ");
        System.out.println();
        set1.removeAll(set2);
        for (int x : set1) {
            System.out.print(x + " ");
        }
    }
}

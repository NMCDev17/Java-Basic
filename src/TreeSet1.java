import java.util.TreeSet;
import java.util.Scanner;

public class TreeSet1 {
    // Tinh chat: Cac phan tu trong TreeSet duoc luu tru theo thu tu tu nho den lon;
    // add() them 1 phan tu vao TreeSet
    // size() tra ve so luong phan tu trong TreeSet
    // removeAll() xoa tat ca cac phan tu nam trong set 1 ma ton tai trong set 2;
    // contains() kiem tra xem 1 phan tu co nam trong set hay khong; (tra ve true
    // hoac false);
    // retail() xoa cac phan tu nam trong set 1 ma khong nam trong set 2;
    // addAll() them tat ca cac phan tu nam trong set 2 vao set 1;
    // first() tra ve phan tu nho nhat trong TreeSet ;
    // pollFirst() xoa phan tu o dau TreeSet;
    // pollLast() xoa phan tu o cuoi TreeSet;
    //lower() tra ve phan tu dau tien lon nhat < phan tu dang xet;
    //higher() tra ve phan tu nho nhat > phan tu dang xet;
    //ceiling() tra ve phan tu dau tien >= phan tu dang xet;
    //floor() tra ve phan tu cuoi cung <= phan tu dang xet;
    //headset() tra ve day cac phan tu < phan tu dang xet;
    //lastSet() tra ve day cac phan tu >= phan tu dang xet;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        TreeSet<Integer> set = new TreeSet<>();
        int n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            int x = scan.nextInt();
            set.add(x);
        }

        /*for (int x : set) {
            System.out.print(x + " ");
        }
        System.out.println();

        System.out.println("Phan tu nho nhat trong TreeSet la: " + set.first());
        System.out.println("Phan tu lon nhat trong TreeSet la: " + set.last());
        System.out.println();

        set.pollFirst();
        set.pollLast();*/
        for (int x : set) {
            System.out.print(x + " ");
        }
        System.out.println("\n"+ set.lower(5));
        System.out.println(set.higher(5));
        System.out.println(set.ceiling(5));
        System.out.println(set.floor(5));
        System.out.println(set.headSet(5));
    }

}

import java.util.LinkedList;
import java.util.Scanner;

//addLast(); add a element to last list;
//addFirst(); add a element to head list;
//getFirst(); selector to element first in list;
//getLast(); selector to element last in list;
//removeLast(); delete element last linked list;
//removeFist(); delete element first linked list;

public class LinkedList1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        LinkedList<SinhVien> sv = new LinkedList<SinhVien>();
        System.out.println("Nhap vao so luong sinh vien: ");
        int n = scan.nextInt();
        for (int i = 1; i <= n; i++) {
            SinhVien tmp = new SinhVien();
            System.out.println("Sinh vien thu " + i);
            tmp.Nhap();
            sv.addLast(tmp);
        }
        System.out.println("Danh sach sinh vien");

        for (SinhVien x : sv) {
            System.out.format("\n%-5s %-20s %-30s %-5s\n",
                    x.getMaSV(),
                    x.getName(),
                    x.getAddress(),
                    x.getGpa());
        }
    }
}

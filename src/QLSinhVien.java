import java.util.Scanner;

class QLSinhVien {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Nhap vao so luong sinh vien: ");
        int n = scan.nextInt();
        scan.nextLine();
        SinhVien[] sv = new SinhVien[n];
        for (int i = 0; i < n; i++) {
            sv[i] = new SinhVien();
            sv[i].Nhap();
        }
        System.out.format("%-10s %-20s %-20s %-5s",
                "Masv",
                "TenSv",
                "Address",
                "Gpa");
        for (int i = 0; i < n; i++) {
            System.out.format("\n%-10s %-20s %-20s %-5s",
                    sv[i].getMaSV(),
                    sv[i].getName(),
                    sv[i].getAddress(),
                    sv[i].getGpa());
        }
    }
}

import java.util.*;

public class SinhVien {
    private static int id = 0;
    private String masv, name, address;
    private float gpa;

    public SinhVien() {
        id++;
        this.masv = "nmc" + id;
        this.name = "";
        this.address = "";
        this.gpa = 0f;
    }

    public SinhVien(String id, String name, String address, float gpa) {
        this.name = name;
        this.address = address;
        this.gpa = gpa;
    }

    public void Nhap() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Nhap vao ten sinh vien: ");
        this.name = scan.nextLine();
        System.out.print("Nhap vao que quan sinh vien: ");
        this.address = scan.nextLine();
        System.out.print("Nhap vao diem gpa: ");
        this.gpa = Float.parseFloat(scan.nextLine());
    }

    public void Xuat() {
        System.out.println("MaSV: " + this.id);
        System.out.println("Ten SV: " + this.name);
        System.out.println("Address: " + this.address);
        System.out.println("GPA: " + this.gpa);
    }

    public String getMaSV() {
        return this.masv;
    }

    public String getName() {
        return this.name;
    }

    public String getAddress() {
        return this.address;
    }

    public float getGpa() {
        return this.gpa;
    }

    public int getId() {
        return this.id;
    }
}

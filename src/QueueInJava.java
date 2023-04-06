import java.util.ArrayDeque;
import java.util.Queue;

//queue la 1 interface trong java;
//de trien khai 1 queue ta tao 1 doi tg queue tham chieu den lop con cua no;
//Tinh chat cua queue la cac phan tu vao truoc se ra truoc (FIFO)
//methods in java:
//poll() xoa phan tu o dau hang doi;
//add() them 1 phan tu trong hang doi;
//contains() kiem tra 1 phan tu co trong hang doi khong tra ve true or false;
//size() tra ve so luong phan tu trong hang doi;
//peek() lay gia tri cua phan tu o dau hang doi;
public class QueueInJava {
    public static void main(String[] args) {
        Queue<Integer> qe = new ArrayDeque<>();
        System.out.println(qe.offer(2));
        System.out.println(qe.size());

    }
}

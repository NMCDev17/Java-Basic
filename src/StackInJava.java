import java.util.Stack;

public class StackInJava {
    // Tinh chat cua stack : cac phan tu vao sau se ra dau (LIFO)
    // methods in stack:
    // push() day 1 phan tu vao dinh stack
    // pop() xoa phan tu o dinh stack;
    // empty() kiem tra xem stack co rong khong;
    // peek() lay gia tri cua phan tu o dinh stack;
    // search() tra ve 1 neu phan tu ton tai trong stack, -1 neu phan tu khong ton
    // tai trong stack;
    // size() tra ve so luong phan tu trong stack;
    // contains() tra ve true neu phan tu co trong stack, false neu phan tu khong
    // ton tai;

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(3);
        st.push(5);
        st.push(2);
        st.push(2);
        System.out.println(st.size());
        System.out.println(st.search(2));
    }
}

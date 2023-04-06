import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Comparator;

public class BuildComparator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        List<Integer> li = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int x = scan.nextInt();
            li.add(x);
        }
        // Anomimus inner class;
        /*
         * Collections.sort(li, new Comparator<Integer>() {
         * 
         * @Override
         * public int compare(Integer a, Integer b) {
         * return a.compareTo(b);
         * }
         * });
         */
        // Bieu thuc lamda: (tham so) -> ket qua tra ve;
        Collections.sort(li, (Integer a, Integer b) -> a.compareTo(b));
        for (int x : li)
            System.out.print(x + " ");
    }

}

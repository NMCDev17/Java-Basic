import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

//add(); add a element to last array list;
// get(n); selector a element at index n;
//remove(n); delete a element at index n;
//size(); return length of array list;
//set(n,value); get value for element at index n;
//clear(); delete all elements;
public class Arraylist {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> myarr = new ArrayList<Integer>();
        for (int i = 0; i < 5; i++) {
            int x = scan.nextInt();
            myarr.add(x);
        }
        System.out.println();
        for (int st : myarr) {
            System.out.print(st + " ");
        }
        myarr.remove(1);

        System.out.println("\n");
        for (int st : myarr) {
            System.out.print(st + " ");
        }
        System.out.println();
        Collections.sort(myarr);
        for (int x : myarr) {
            System.out.print(x + " ");
        }
        System.out.println();
    }
}

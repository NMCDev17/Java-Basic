import java.util.HashMap;
import java.util.Map;

public class HashMap1 {
    // Tinh chat: map luu 1 cap key/ value, cac key thi khong duong trung nhau;
    // put() them 1 phan tu vao trong map;
    // get(key) truy xuat den gia tri cua key duoc truyen vao;
    // isEmpty() kiem tra xem map co rong hay khong;
    // size() tra ve so cap ky/value trong map;
    // containsKey(key) kiem tra xem 1 key co xuat hien trong map hay khong;

    // Moi 1 cap key/value trong map la 1 entry;
    // entrySet() day cac cap key/value vao trong set;
    // getKey() lay ra 1 key;
    // getValue() lay ra 1 value cua key tuong ung;
    // remove(key) xoa 1 cap ket/value thong qua key;
    // replace(key,value) cap nhap 1 value moi cho key;

    // map1.putAll(map2); them tat cac cac cap key/value cua map2 vao map1;
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("VietNam", "Nguyen Xuan Phuc");
        map.put("China", "Xin Jinping");
        map.put("North korea", "Kim Joung-Un");
        System.out.println(map.get("VietNam"));
        System.out.println(map.size());// return length of map;
        System.out.println(map.isEmpty());
        map.remove("North korea");// delete one key;
        map.replace("China", "Nguyen Hang Long");// update value to one key;
        Map<String, String> map2 = new HashMap<>();
        map.put("TFT", "Vu Manh Hung");
        map.put("LOL", "Nguyen Huu Duc");
        map.put("AOV", "Nguyen Manh Cuong");
        map.putAll(map2);
        // duyet cac cap key/value trong map;
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + "-" + entry.getValue());
        }
    }
}

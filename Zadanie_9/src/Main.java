import java.util.*;
import java.util.HashSet;
public class Main {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("aaa");
        arrayList.add("bbb");
        arrayList.add("bbb");
        arrayList.add("ccc");
        arrayList.add("ddd");
        arrayList.add("qqq");
        arrayList.add("qqq");
        arrayList.add("aaa");
        arrayList.add("aaa");
        arrayList.add("qqq");
        arrayList.add("ooo");
        arrayList.add("jjj");
        arrayList.add("jjj");
        arrayList.add("ccc");
        arrayList.add("aaa");
        Set<String> set = new HashSet<>();
        for ( int i = 0; i < arrayList.size(); i++){
            set.add(arrayList.get(i));
        }
        System.out.println(set);
        Map<String,Integer> map = new HashMap<>();
        for(int i = 0; i < arrayList.size(); i++){
            if(map.keySet().contains(arrayList.get(i))){
                map.put(arrayList.get(i), map.get(arrayList.get(i)) + 1);
            }else {
                map.put(arrayList.get(i), 1);
            }
        }
        System.out.println(map);

        PhoneDirectory phoneDirectory = new PhoneDirectory();
        phoneDirectory.add("Ivanov","321-321");
        phoneDirectory.add("Ivanov","123-123");
        phoneDirectory.add("Petrov","465-654");
        phoneDirectory.add("Sidorov","963-147");
        phoneDirectory.add("Sidorov","789-321");
        phoneDirectory.add("Sidorov","654-159");
        System.out.println("Номера Ivanov: " + phoneDirectory.get("Ivanov"));
        System.out.println("Номера Petrov: " + phoneDirectory.get("Petrov"));
        System.out.println("Номера Sidorov: " + phoneDirectory.get("Sidorov"));
    }
}

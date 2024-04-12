import java.util.ArrayList;
import java.util.HashMap;
import java.util.*;
public class PhoneDirectory {
    private Map<String,List<String>> phDirectory;
    public PhoneDirectory(){
        phDirectory = new HashMap<>();
    }
    public void add(String lastName, String phoneNumber){
        if(phDirectory.containsKey(lastName)== false){
            phDirectory.put(lastName, new ArrayList<>());
        }
        phDirectory.get(lastName).add(phoneNumber);
    }

    public List<String> get(String lastName){
        return phDirectory.get(lastName);
    }

}

import java.util.*;
public class CountNames {
    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<>();
        names.add("Ram");
        names.add("Sam");
        names.add("Arun");
        names.add("Ram");
        names.add("Ram");
        names.add("Arun");
        HashMap<String,Integer> CountMap=new HashMap<>();
        for(String name:names){
            if(CountMap.containsKey(name)){
                CountMap.put(name,CountMap.get(name)+1);
            }
            else{
                CountMap.put(name,1);
            }
        }
        System.out.println(CountMap);
    }
}

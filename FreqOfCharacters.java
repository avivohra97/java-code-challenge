import java.util.LinkedHashMap;
import java.util.Map;

public class FreqOfCharacters {
    public static void main(String[] args) {
        String one = "madam";
        LinkedHashMap<Character,Integer> countFreq = new LinkedHashMap<>();
        for(char c:one.toCharArray()){
            countFreq.put(c,countFreq.getOrDefault(c,0)+1);
        }
        for(Map.Entry m :countFreq.entrySet()){
            System.out.println("count of "+m.getKey()+" is "+m.getValue());
        }
    }
}

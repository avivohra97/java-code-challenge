import java.util.HashMap;

public class FrequencyOfCharacters {
    public static void main(String[] args) {
        String str = "madam";
        wordFreq(str);
        String str1 = "madam geeta professor";
        wordFreqArray(str1.split(" "));

    }
    public static void wordFreq(String str){
        HashMap<Character,Integer> map = new HashMap<>();
        for(Character c : str.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for(Character c: map.keySet()){
            System.out.println("freq for "+c+ " is "+map.get(c));
        }
    }
    public static void wordFreqArray(String strArr[]){
        HashMap<Character,Integer> map = new HashMap<>();
        for(String str:strArr){
            for(Character c : str.toCharArray()){
                map.put(c,map.getOrDefault(c,0)+1);
            }
        }

        for(Character c: map.keySet()){
            System.out.println("freq for "+c+ " is "+map.get(c));
        }
    }
}

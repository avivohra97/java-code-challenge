import java.util.Arrays;

public class ReverseVowels {
    public static void main(String[] args) {
        String str = "1aeb86oi2";
        String vowels = "aeiouAEIOU";
        int j = str.length()-1;
        char[] chr = str.toCharArray();
        System.out.println("before: "+Arrays.toString(chr));
        for(int i =0;i<str.length()&& i<=j;){
            if(vowels.indexOf(chr[i]) == -1) i++;
            else if(vowels.indexOf(chr[i]) != -1){
                while(vowels.indexOf(chr[j])==-1){
                    j--;
                }
                char temp = chr[i];
                chr[i]= chr[j];
                chr[j]=temp;
                i++;
                j--;
            }
        }
        System.out.println("After: "+Arrays.toString(chr));
    }
}

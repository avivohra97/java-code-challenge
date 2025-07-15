import java.util.Arrays;

public class ReverseOnlyLetters {
    public static void main(String[] args) {
        String str = "1ab86o2";
        StringBuilder result = new StringBuilder("");
        int j = str.length()-1;
        char[] chr = str.toCharArray();
        for(int i =0;i<str.length()&& i<j;i++){
            if(!Character.isLetter(chr[i])) i++;
            if(!Character.isLetter(chr[j])) j--;
            if(Character.isLetter(chr[i])){
                char temp = chr[i];
                chr[i]= chr[j];
                chr[j]=temp;
                i++;
                j--;
            }
        }
        System.out.println(Arrays.toString(chr));
    }
}

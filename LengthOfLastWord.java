public class LengthOfLastWord {
    public static void main(String[] args) {
        String s = "  Hello county      109    ";
        s = s.trim();
        int j = s.length()-1;
        int count = 0;
        while(j>=0){
            if(!Character.isWhitespace(s.charAt(j))){
                count++;
                j--;
            }else{
                break;
            }
        }
        System.out.println("length of last word is "+count);
    }
}

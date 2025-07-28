public class Palindrome {
    public static void main(String[] args) {
        String s1 = "amnma";
        System.out.println(s1 +" is palindrome or not? "+isPalindrome(s1));
        String s2 = "cannack";
        System.out.println(s2+" is valid palindrome or not "+isValidPalindrome(s2));
        String s3 = "cannkac";
        System.out.println(s3+" is valid palindrome or not "+isValidPalindrome(s3));
        String s4 = "canndack";
        System.out.println(s4+" is valid palindrome or not "+isValidPalindrome(s4));
    }
    public static  boolean isPalindrome(String s){
        if(s.isEmpty() || s.length() ==1 ) return true;
        for(int i=0,j=s.length()-1;i<j;i++,j--){
            if (s.charAt(i)!=s.charAt(j)) return false;
        }
        return true;
    }
    public static boolean isValidPalindrome(String s){
        if(s.isEmpty() || s.length() ==1 ) return true;
        for(int i=0,j=s.length()-1;i<j;i++,j--){
            if (s.charAt(i)!=s.charAt(j)){
                String sliced;
                if(j!=s.length()-1){
                    sliced = s.substring(0,j)+s.substring(j+1,s.length());
                }else{
                    sliced = s.substring(0,j);
                }
                if(isPalindrome(sliced)){
                    return true;
                }
                return false;
            }
        }
        return true;
    }
}

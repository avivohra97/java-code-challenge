public class LongestCommonPrefix {
    public static void main(String[] args) {
        String arr[] = {"dog","racecar","car"};
        System.out.println("longest common prefix is : "+ longestPrefix(arr));
        String arr1[] = {"flower","flow","flight"};
        System.out.println("longest common prefix is : "+ longestPrefix(arr1));
    }
    public static String longestPrefix(String []arr){
        String result = "";
        int j=0;
        if(arr[0].isEmpty()){
            return result;
        }else{
              for(int i =1;i<arr.length;i++){
                char pre = arr[0].charAt(j);
                if(arr[i].charAt(j) != pre) break;
                else{
                    j++;
                    result = result + pre;
                }
            }
        }
        return result;
    }
}

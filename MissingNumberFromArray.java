public class MissingNumberFromArray {
    public static void main(String[] args) {
        int[] num = {1,2,3,4,5,7};
        int finalNum = num[num.length-1];
        int sum = (finalNum * (finalNum+1))/2;
        int count = 0;
        for(int c: num) count+=c;
        System.out.println(sum);
        System.out.println("number missing from arrays is : "+(sum-count));
    }
}

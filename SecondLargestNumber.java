public class SecondLargestNumber {
    public static void main(String[] args) {
        int num[] = {1,2,56,73,456,1,-6};
        int maxNum = Integer.MIN_VALUE;
        int secondMaxNum = maxNum;
        for(int number:num){
            if(number>maxNum){
                secondMaxNum = maxNum;
                maxNum = number;
            } else if (number>secondMaxNum && number<maxNum) {
                secondMaxNum = number;
            }
        }
        System.out.println("max num is :"+maxNum);
        System.out.println("second maxNum is :"+secondMaxNum);
    }
}

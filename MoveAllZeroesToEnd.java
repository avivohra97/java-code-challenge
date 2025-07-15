public class MoveAllZeroesToEnd {
    public static void main(String[] args) {
        int num[] = {1,0,2,0,0,3,0,6};
        int zeroIndex = 0;
        int nonZeroIndex = 0;
        int current = 0;
        while(current<num.length){
            if(num[current]!=0){
                int temp = num[zeroIndex];
                num[zeroIndex] = num[nonZeroIndex];
                num[nonZeroIndex] = temp;
                zeroIndex ++;
                nonZeroIndex ++;
                current++;
            }else{
                nonZeroIndex++;
                current++;
            }
        }
        for(int i:num){
            System.out.print(i+", ");
        }
    }
}

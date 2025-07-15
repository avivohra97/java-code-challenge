import java.math.BigInteger;

public class ReverseInteger {
    public static void main(String[] args) {
        int n = 98765;
        reverseNum(n);
        // below will lead to overflow as reverse val exceeds max value range
        reverseNum(Integer.MAX_VALUE);
        reverseNumBigInt(BigInteger.valueOf(Integer.MAX_VALUE));
    }
    public static void reverseNum(int n){
        if(n > Integer.MAX_VALUE/10 ){
            System.out.println("cannot reverse it");
            System.exit(0);
        } else if(n< Integer.MIN_VALUE/10) {
            System.out.println("Cannot reverse it again");
            System.exit(0);
        }
        int result = 0;
        while(n>0){
            int rem = n%10;
            result = result * 10 + rem;
            n = n/10;
        }
        System.out.println("reverse num is :"+ result);
    }

    public static void reverseNumBigInt(BigInteger n){

        BigInteger result = BigInteger.valueOf(0);
        while(n.compareTo(BigInteger.ZERO)>0){
            System.out.println("inside condition");
            BigInteger rem = n.remainder(BigInteger.TEN);
            result = result.multiply(BigInteger.TEN).add(rem);
            n = n.divide(BigInteger.TEN);
        }
        System.out.println("reverse num is :"+ result);
    }
}

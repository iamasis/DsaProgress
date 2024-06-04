package DsaProgress._24_Time_Space_Complexity;

public class FIboNacciUsingBitwise {
    public static void main(String[] args) {
        System.out.println(Original(6));
        System.out.println(Mine(6));
    }
    static long Mine(int n){
        return (long) (0.447*(Math.pow(1.6180,n)));

    }
    static long Original(int n){
        return (long) ((Math.pow(((1+Math.sqrt(5))/2),n)-Math.pow(((1-Math.sqrt(5))/2),n))/Math.sqrt(5));
    }
}

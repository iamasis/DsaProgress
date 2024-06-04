package DsaProgress._25_BitwiseOperator;

public class _01_OddEven {
    public static void main(String[] args) {
        for(int i = 0; i < 25; i++){
            System.out.println(Check(i));
        }
    }
    static boolean Check(int n){
        return (n & 1 ) == 1;
    }
}

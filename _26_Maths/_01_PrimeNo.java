package DsaProgress._26_Maths;

public class _01_PrimeNo {
    public static void main(String[] args) {
        System.out.println(isprime(23));
    }
    static boolean isprime(int n){
        if(n <= 1){
            return false;
        }
        int c = 2;
        while(c * c < n){
            if(n % c == 0){
                return false;
            }else{
                c++;
            }
        }
        return true;
    }
}

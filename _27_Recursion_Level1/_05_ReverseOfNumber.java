package DsaProgress._27_Recursion_Level1;

public class _05_ReverseOfNumber {
    // method 1
    static int sum = 0;
    static void revno1(int n ){
        if(n == 0){
            return;
        }
        int rem = n % 10;
        sum = sum*10 + rem;
        revno1(n/10);
    }
    // Method 2 with the help of helper function
    static int helper(int n){
        int digits =(int) (Math.log10(n))+1;
        return revno2(n, digits);
    }
    static int revno2(int n, int digits){
        if(n % 10 == n){
            return n;
        }
        int rem = n %10;
        return rem * (int)(Math.pow(10, digits-1)) + revno2(n/10, digits-1);
    }
    public static void main(String[] args) {
//        revno1(567);
//        System.out.println(sum);
        int ans = helper(54321);
        System.out.println(ans);
    }
}

package DsaProgress._27_Recursion_Level1;

public class _06_CountZeroes {
    public static void main(String[] args) {
        System.out.println(count(120));
    }
    static int count(int n){
        if(n == 0){
            return 1;
        }
        return helper(n, 0);
    }
    static int helper(int n, int c){
        if(n == 0){
            return c;
        }
        int rem = n%10;
        if(rem == 0){
            return helper(n/10, c+1);
        }
        return helper(n/10, c);
    }
}

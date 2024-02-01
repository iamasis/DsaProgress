package DsaProgress._27_Recursion_Level1;


// https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero
public class _07_Steps {
    public static void main(String[] args) {
        System.out.println(totalsteps(20));
    }
    static int totalsteps(int n){
        return helper(n, 0);
    }
    static int helper(int n, int c){
        if(n == 0){
            return c;
        }
        if(n % 2 == 0){
            return helper(n/2, c+1);
        }
        return helper(n-1, c+1);
    }
}

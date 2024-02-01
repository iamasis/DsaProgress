package DsaProgress._26_Maths;

public class _06_HCFandLCM {
    public static void main(String[] args) {
        // Enculid theorem says that hcf(a, b) = hcf(rem(b,a),a)
        System.out.println(gcd(4, 9));
        System.out.println(lcm(2, 7));
    }
    // hcf is the min positive value of equation ax+by you can have
    //lcm is minimum no that can divisible by both a & b



    static int gcd(int a, int b) {
        if (a == 0) {
            return b;
        }
        return gcd(b%a, a);
    }
    // lcm = (a * b)/hcf(a,b)
    static int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }
}

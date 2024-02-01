package DsaProgress._26_Maths;
// newton sqrt = 0.5 * (x + (n/x)) where x is assumed root
public class _04_NewtonSQRT {
    public static void main(String[] args) {
        int n = 5;
        System.out.printf("%.3f",Math.sqrt(n));
        System.out.println();
        System.out.printf("%.3f", nwtsqrt(n));
    }
    static double nwtsqrt(int n){
        double x = n;
        double root;
        while(true){
            root = 0.5 * (x + (n/x));
            if(Math.abs(root -x) < 0.5){
                break;
            }
            x = root;
        }
        return root;
    }
}

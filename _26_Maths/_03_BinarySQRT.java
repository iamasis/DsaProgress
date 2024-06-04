package DsaProgress._26_Maths;

public class _03_BinarySQRT {
    public static void main(String[] args) {
        System.out.println(checkroot(40));
    }
    static double checkroot(int n){
        int s = 0;
        int e = n;
        double root = 0.0;
        while (s <= e){
            int m = s +(e -s)/2;
            if(m * m == n){
                return m;
            }
            if(m * m > n){
                e = m -1;
            }else {
                s = m + 1;
                root = m;
            }
        }
        double incr = 0.1;
        for (int i = 0; i < 3; i++){
            while(root * root  <= n){
                root += incr;
            }
            root -= incr;
            incr /= 10;
        }
        return root;
    }
}

package DsaProgress._29_PatternWithRecursion;

public class _01_Traingle {
    public static void main(String[] args) {
        traingle(10, 0);
//        revtraingle(5, 0);
    }
    static void traingle(int r, int c){
        if(r == 0){
            return;
        }
        if(c < r){
            traingle(r, c+1 );
            System.out.print("*");
        }else{
            traingle(r-1, 0);
            System.out.println();
        }
    }
    static void revtraingle(int r, int c){
        if(r == 0){
            return;
        }
        if(c < r){
            System.out.print("*");
            revtraingle(r, c+1 );
        }else{
            System.out.println();
            revtraingle(r-1, 0);
        }
    }

}

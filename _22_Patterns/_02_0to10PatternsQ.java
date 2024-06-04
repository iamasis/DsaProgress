package DsaProgress._22_Patterns;

public class _02_0to10PatternsQ {
    public static void main(String[] args) {
        int n = 5;;
        pattern10(n);
    }
    static void pattern1(int n){
        for(int row = 1; row <= n; row++){
            for (int col = 1; col <= n; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern2(int n){
        for(int row = 1; row <= n; row++){
            for (int col = 1; col <= row; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern3(int n){
        for(int row = 0; row < n; row++){
            for (int col = 1; col <= n-row ; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern4(int n){
        for(int row = 1; row <= n; row++){
            for (int col = 1; col <= row; col++){
                System.out.print(col +" ");
            }
            System.out.println();
        }
    }
    static void pattern5(int n){
        for(int row = 1; row < (2*n); row++){
            if(row <= n){
                for(int col= 1; col<=row; col++) {
                    System.out.print("* ");
                }
            }else{
                for(int col1 =1; col1 <= (2*n-row); col1++){
                    System.out.print("* ");
                }

            }
            System.out.println();
        }
    }
    static void pattern6(int n){
        for(int row = 1; row <= n; row++){
            int spaces = n-row;
            for(int space = 1; space<=spaces; space++){
                System.out.print(" ");
            }
            for (int col = 1; col <= row; col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern7(int n){
        for(int row = 0; row < n; row++){
            int spaces = row;
            for(int space = 0; space < spaces; space++){
                System.out.print(" ");
            }
            for (int col = 1; col <= n-row; col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern8(int n){
        for(int row = 1; row <= n; row++){
            int spaces = n-row;
            for(int space = 0; space < spaces; space++){
                System.out.print(" ");
            }
            for (int col = 1; col <= 2*row-1; col++){
                System.out.print("*");
            }
            for(int space = 0; space < spaces; space++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    static void pattern9(int n){
        for(int row = 1; row <= n; row++){
            int spaces = row-1;
            for(int space = 0; space < spaces; space++){
                System.out.print(" ");
            }
            for (int col = 1; col <= (2*n)-(2*row)+1; col++){
                System.out.print("*");
            }
            for(int space = 0; space < spaces; space++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    static void pattern10(int n){
        for(int row = 1; row <= n; row++){
            int spaces = n-row;
            for(int space = 0; space < spaces; space++){
                System.out.print(" ");
            }
            for (int col = 1; col <= row; col++){
                System.out.print("* ");
            }
            for(int space = 0; space < spaces; space++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }

}

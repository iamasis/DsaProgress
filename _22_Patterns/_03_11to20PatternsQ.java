package DsaProgress._22_Patterns;

public class _03_11to20PatternsQ {
    public static void main(String[] args) {
        int n = 5;
        pattern13(n);
    }
    static void pattern11(int n){
        for(int row = 1; row <= n; row++){
            int spaces = row-1;
            for(int space = 0; space < spaces; space++){
                System.out.print(" ");
            }
            for (int col = 1; col <= n-row+1; col++){
                System.out.print("*  ");
            }
            for(int space = 0; space < spaces; space++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    static void pattern12(int n){
        for(int row = 1; row <= 2*n; row++){
            if(row <= n){
                int spaces = row-1;
                for(int space = 0; space < spaces; space++){
                    System.out.print(" ");
                }
                for (int col = 1; col <= n-row+1; col++){
                    System.out.print("* ");
                }
                for(int space = 0; space < spaces; space++){
                    System.out.print(" ");
                }
                System.out.println();
            }else{
                int spaces = 2*n-row;
                for(int space = 0; space < spaces; space++){
                    System.out.print(" ");
                }
                for (int col = 1; col <= row-n; col++){
                    System.out.print("* ");
                }
                for(int space = 0; space < spaces; space++){
                    System.out.print(" ");
                }
                System.out.println();
            }
        }
    }
    static void pattern13(int n){
        for(int row = 1; row <= n; row++){
            if(row < n){
                int spaces = n-row;
                for(int space = 1; space <= spaces; space++){
                    System.out.print(" ");
                }
                for (int col = 1; col == 1; col++){
                    System.out.print("*");
                }
                //inner spaces
                if(row > 1){
                    int inspace = (2*row-3);
                    for(int space = 1; space <= inspace; space++){
                        System.out.print(" ");
                    }
                    for (int col = 1; col == 1; col++){
                        System.out.print("*");
                    }
                }
                for(int space = 1; space <= spaces; space++){
                    System.out.print(" ");
                }
                System.out.println();
            }
            if(row==n){
                for(int i=1; i<=(2*n-1);i++){
                    System.out.print("*");
                }
            }
        }
    }
}

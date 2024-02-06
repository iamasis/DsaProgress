package DsaProgress._37_Oops._06_ExceptionHandling;

public class ExceptionHandling {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;
        try{
            divide(a, b);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("This is always run");
        }
    }

    static int divide(int a, int b) throws ArithmeticException{
        if(b == 0){
            throw new ArithmeticException("Please do not divide by zero");
        }
        return a /b;
    }
}

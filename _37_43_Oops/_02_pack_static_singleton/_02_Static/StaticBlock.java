package DsaProgress._37_43_Oops._02_pack_static_singleton._02_Static;



//                          THIRD CLASS

public class StaticBlock {
    static int a = 10;
    static int b;
    static {
// will only run once, when the first obj is create i.e. when the class is loaded for the first time
        System.out.println("I am in static block");
        b = a * 2;
    }

    public static void main(String[] args) {
        StaticBlock obj1 = new StaticBlock();
        System.out.println(StaticBlock.a +","+StaticBlock.b);

        StaticBlock.b += 3;
        StaticBlock obj2 = new StaticBlock();
        System.out.println(StaticBlock.a +","+StaticBlock.b);
    }
}

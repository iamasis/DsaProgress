package DsaProgress._21_String_StringBuilder;

public class _01_Comparison {
    public static void main(String[] args) {
        String a = "kunal";
        String b = "kunal";
        System.out.println(a==b);

        // THIS WILL GIVE TRUE BECAUSE REF VARIABLE IS POINTING TO SAME VALUE IN HEAP MEMORY AND THEY
        // ARE IN SAME STRING POOL

        String c = new String("Ashish");
        String d = new String("Ashish");
        System.out.println(c==d);
        // THIS WILL GIVE FALSE BECAUSE WE EXPLICIT CREATE NEW OBJECT IN HEAP MEMORY AND THEY ARE NOT
        // IN THE STRING POOL


        // WHILE .equals CHECK THE OBJECT
        String e = new String("Ashish");
        String f = new String("Ashish");
        System.out.println(e.equals(f));
        //IT WILL GIVE TRUE BECAUSE IT CHECKS THE OBJECT
        System.out.println();
    }
}

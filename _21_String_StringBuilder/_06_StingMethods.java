package DsaProgress._21_String_StringBuilder;
import java.util.Arrays;
public class _06_StingMethods {
    public static void main(String[] args) {
        StringBuilder b = new StringBuilder();
        String name = "Kunal Kushwaha Hello World";
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.toLowerCase());
        System.out.println(name);
        System.out.println(name.indexOf('a'));
        System.out.println("     Kunal   ".strip());
        System.out.println(Arrays.toString(name.split(" ")));
    }
}


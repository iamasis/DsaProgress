package DsaProgress._21_String_StringBuilder;

public class _05_StringBuilder {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        for(int i=0; i<26; i++){
            char ch = (char)('a' +i);
            builder.append(ch+" ");
        }
        System.out.println(builder.toString());
        // NOW IT'S NOT CREATE NEW OBJECT EVERY TIME IT JUST MODIFIED
        builder.reverse();

        System.out.println(builder);
    }
}

package DsaProgress._32_to_34_Recursion_String;

public class _01_Stream {
    public static void main(String[] args) {
//        skip1("", "apple");
        System.out.println(skip4("This apple is very good in app setting"));
    }
    // p = processed, up = unprocessed
    // remove char 'a' from word
    static void skip1(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        if(ch == 'a'){
            skip1(p, up.substring(1));
        }else{
            skip1(p+ch, up.substring(1));
        }
    }
    static String skip2(String up){
        if(up.isEmpty()){
            return "";
        }
        char ch = up.charAt(0);
        if(ch == 'a'){
            return skip2(up.substring(1));
        }else{
            return ch + skip2(up.substring(1));
        }
    }
    // this will skip whole word
    static String skip3(String up){
        if(up.isEmpty()){
            return "";
        }
        if(up.startsWith("apple")){
            return skip3(up.substring(5));
        }else{
            return up.charAt(0) + skip3(up.substring(1));
        }
    }
    // if apple skip whole otherwise just app
    static String skip4(String up){
        if(up.isEmpty()){
            return "";
        }
        if(up.startsWith("app") && !up.startsWith("apple")){
            return skip4(up.substring(3));
        }
        if(up.startsWith("apple")){
            return skip4(up.substring(5));
        }else{
            return up.charAt(0) + skip4(up.substring(1));
        }
    }
}

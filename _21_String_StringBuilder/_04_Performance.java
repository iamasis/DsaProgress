package DsaProgress._21_String_StringBuilder;

public class _04_Performance {
    public static void main(String[] args) {
        String series = "";
        for(int i = 0; i < 26; i++){
            char ch = (char)('a' + i);
//            System.out.println(ch);
            series = series+ch;
        }
        System.out.println(series);
        //THIS IS NOT GOOD BECAUSE EVERY IT CREATES NEW OBJECT SO WE USE StringBuilder
    }
}

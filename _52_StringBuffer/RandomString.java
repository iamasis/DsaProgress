package DsaProgress._52_StringBuffer;
import java.util.Random;
public class RandomString {
    public static String generate(int size){
        Random random = new Random();
        StringBuffer sb = new StringBuffer();
        for(int i = 0; i < size; i++){
            int randomChar = 97 + (int)(random.nextFloat()*26);
            sb.append((char)randomChar);
        }
        return sb.toString();
    }
}

package DsaProgress._32_to_34_Recursion_String;

import java.util.ArrayList;


// leet code = https://leetcode.com/problems/letter-combinations-of-a-phone-number/,
// but it's different from we did;

public class _05_PhonePad {
    public static void main(String[] args) {
//        pad("", "12");
        System.out.println(padret("", "23"));
    }
    static void pad(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        int digit = up.charAt(0) - '0';
        for(int i = (digit-1)*3; i < digit*3; i++){
            char ch = (char) ('a' + i);
            pad(p+ch, up.substring(1));
        }
    }
    // add in arraylist
    static ArrayList<String> padret(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();
        int digit = up.charAt(0) - '0';
        for(int i = (digit-1)*3; i < digit*3; i++){
            char ch = (char) ('a' + i);
            ans.addAll(padret(p+ch, up.substring(1)));
        }
        return ans;
    }

}

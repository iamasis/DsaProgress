package DsaProgress._32_to_34_Recursion_String;

import java.util.ArrayList;

public class _02_SubSeq {
    public static void main(String[] args) {
        // method 1
        subSeq1("", "abc");
//        ArrayList<String> newlist = subseqlist1("", "abc");
//        System.out.println(newlist);
        // method 2
//        ArrayList<String> newlist = subseqlist2("", "abc");
//        System.out.println(newlist);
//        System.out.println(subseqAsciiRet("", "abc"));
    }
    static void subSeq1(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        subSeq1(p + ch, up.substring(1));
        subSeq1(p, up.substring(1));
    }
    static ArrayList<String> subseqlist1(String p, String up){
        if(up.isEmpty()){
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        subseqlist1(p + ch, up.substring(1));
        subseqlist1(p, up.substring(1));
        return list;
    }
    static ArrayList<String> list = new ArrayList<>();

    // Method 2 we have to not take arraylist outside
    static ArrayList<String> subseqlist2(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> left = subseqlist2(p+ch, up.substring(1));
        ArrayList<String> right = subseqlist2(p, up.substring(1));

        left.addAll(right);
        return left;
    }


    // Method 3 with ascii value
    static ArrayList<String> subseqAsciiRet(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> first = subseqAsciiRet(p + ch, up.substring(1));
        ArrayList<String> second = subseqAsciiRet(p, up.substring(1));
        ArrayList<String> third = subseqAsciiRet(p + (ch+0), up.substring(1));

        first.addAll(second);
        first.addAll(third);
        return first;
    }
}

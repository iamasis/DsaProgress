package DsaProgress._21_String_StringBuilder;

public class _07_Palindrome {
    public static void main(String[] args) {
        String str = "civic";
        System.out.println(isPalindrome(str));
    }
    static boolean isPalindrome(String str){
        str = str.toLowerCase();
        if (str == null || str.length() == 0) {
            return true;
        }
        else{
            for(int i=0; i< str.length()/2; i++){
                if(str.charAt(i) != str.charAt(str.length()-1-i)){
                    return false;
                }
            }
        }
        return true;
    }
}

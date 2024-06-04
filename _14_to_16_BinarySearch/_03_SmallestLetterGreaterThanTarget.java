package DsaProgress._14_to_16_BinarySearch;

public class _03_SmallestLetterGreaterThanTarget {
    public static void main(String[] args) {
        char[] letters = {'c', 'd', 'f', 'l'};
        char target = 'l';
        System.out.println(Search(letters, target));
    }
    static char Search(char[] letters, char target){
        int start = 0;
        int end = letters.length-1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(letters[mid] > target){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return letters[start % letters.length];
    }
}

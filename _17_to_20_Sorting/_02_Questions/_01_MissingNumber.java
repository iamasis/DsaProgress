package DsaProgress._17_to_20_Sorting._02_Questions;




// IT STARTS WITH (0, N)

public class _01_MissingNumber {
    public static void main(String[] args) {
        int[] arr = {0, 9, 1, 4, 3, 2, 5, 6, 7, 8, 10, 12};
        System.out.println(missnumber(arr));
    }
    static int missnumber(int[] arr){
        int i = 0;
        while(i < arr.length){
            int correct = arr[i];
            if(arr[i] < arr.length && arr[i] != arr[correct]){
                swap(arr, i, correct);
            }
            else{
                i++;
            }
        }

        // CASE-1  WHEN 'N' IS PRESENT IN THE ARRAY
        for(int index = 0; index < arr.length; index++){
            if(arr[index] != index){
                return index;
            }
        }
        //CASE-2  WHEN 'N' IS NOT PRESENT IN THE ARRAY
        return arr.length;
    }
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}

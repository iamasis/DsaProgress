package DsaProgress._37_Oops._06_Generics.Comparing;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Student kunal = new Student(12, 100.0f);
        Student ashish = new Student(13, 68.1f);
        Student rahul = new Student(13, 87.1f);
        Student arpit = new Student(13, 91.1f);
        Student aryan = new Student(13, 9.1f);

        Student[] list = {kunal, ashish, rahul, arpit, aryan};
        System.out.println(Arrays.toString(list));
        Arrays.sort(list); // it uses our comparable method to run
        System.out.println(Arrays.toString(list));



//        if(ashish.compareTo(kunal) > 0){
//            System.out.println("Ashish got more marks than Kunal");
//        }
    }
}

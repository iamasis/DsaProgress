package DsaProgress._37_43_Oops._01_Introduction;

public class _01_Main {
    public static void main(String[] args) {
//        Student ashish = new Student();
//        System.out.println(ashish.name);
//        ashish.rollno = 53;
//        ashish.name = "Ashish Tiwari";
//        ashish.marks = 85;
//        System.out.println(ashish.rollno);
//        System.out.println(ashish.name);
//        System.out.println(ashish.marks);

        Student random1 = new Student(13, 96.5f, "Ashish Tiwari");
        random1.greeting();
//        Student random2 = new Student(random1);
//        System.out.println(random2.name);
    }
}
class Student {
    int rollno;
    float marks;
    String name;
    Student () {
        // this is how you call a constructor from another constructor
        // internally: new Student (13, "default person", 100.0f);
        this (13, 100.0f, "default person");
    }
    Student (int Rollno, float mark, String naam){
        this.rollno = Rollno;
        this.marks = mark;
        this.name = naam;
    }
    void greeting(){
        System.out.println("Hello How are you "+this.name);
    }
    void changeName(String name){
        this.name = name;
    }
    Student  (Student other) {
        this.name = other.name;
        this.rollno = other.rollno;
        this.marks = other.marks;
    }
}


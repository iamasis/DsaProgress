package DsaProgress._37_43_Oops._06_Generics.Comparing;

public class Student implements Comparable<Student>{
    int rollno;
    float marks;

    public Student(int rollno, float marks) {
        this.rollno = rollno;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return marks +"";
    }

    @Override
    public int compareTo(Student o) {
        int diff = (int) (this.marks - o.marks);

        // if diff is 0 means both is equal
        // if diff is < 0 means 0 is biiger
        return diff;
    }
}

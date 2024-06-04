package DsaProgress._37_43_Oops._04_AccessControl;

public class Access {
    String name;
    int rno;
    private double marks;
    public void setMarks(Double marks){
        this.marks = marks;
    }
    public void setValues(String name, int roll){
        this.name = name;
        this.rno = roll;
    }

    public Double getMarks() {
        return marks;
    }

//    public Access(String name, int rollno, double marks){
//        this.name = name;
//        this.rno = rollno;
//        this.marks = marks;
//    }
}

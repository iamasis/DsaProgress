package DsaProgress._37_43_Oops._03_Principles._01_Inheritance;


//             THIS IS FIRST CLASS

public class Box {
    double l;
    double w;
    double h;
    Box (){
        this.l = -1;
        this.w = -1;
        this.h = -1;
    }

    // Box Cube
    Box(double side){
        this.l = side;
        this.w = side;
        this.h = side;

    }

    public Box(double l, double w, double h) {
        this.l = l;
        this.w = w;
        this.h = h;
    }

    Box (Box old){
        this.l = old.l;
        this.w = old.w;
        this.h = old.h;
    }
}

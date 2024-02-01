package DsaProgress._37_Oops._03_Principles._01_Inheritance;



//                 SECOND CLASS

import DsaProgress._37_Oops._03_Principles._01_Inheritance.Box;

public class BoxWeight extends Box {
    double weight;
    public BoxWeight() {
        this.weight = -1;
    }

    public BoxWeight(double l, double w, double h){
        super(l, w, h);
    }
    public BoxWeight(double l, double w, double h, double weight){
        super(l, w, h);
        this.weight = weight;
    }
}

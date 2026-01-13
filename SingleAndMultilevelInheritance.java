import other.tools.AdvCalc;

class VeryAdvCalc extends AdvCalc { // AdvCalc is present in Inheritance.java file
    public double power(int a,int b){ 
        return Math.pow(a, b);
    }
}
// VeryAdvCalc extends AdvCalc which extends Calc i.e VeryAdvCalc -> AdvCalc -> Calc (This is Multilevel Inheritance).Here, The 

public class SingleAndMultilevelInheritance {
    public static void main(String[] args) {
        VeryAdvCalc vac = new VeryAdvCalc();
        int r1 = vac.add(3 ,7);
        int r2 = vac.sub(8 ,4);
        int r3 = vac.multiply(2 ,4);
        int r4 = vac.div(8 ,4);
        double r5 = vac.power(2, 4);
        System.out.println("Addition = " + r1);
        System.out.println("Subtraction = " + r2);
        System.out.println("Multipliaction = " + r3);
        System.out.println("Division = " + r4);
        System.out.println("Power = " + r5);
    }
}
// Multiple Inheritance using classes is not supported in java as it causes AMBIGUITY.
package school.mjc.stage0.conditions.finalTask;

public class TriangleSidesValidator {
    public void validate(double firstSide, double secondSide, double thirdSide) {
//        suma długości jego dwóch boków jest większa od długości trzeciego boku
        double suma = firstSide + secondSide;
        double suma1 = firstSide + thirdSide;
        double suma2 = secondSide + thirdSide;
        if(suma > thirdSide && suma1 > secondSide && suma2 > thirdSide && firstSide != 0
                && secondSide != 0 && thirdSide != 0)
            System.out.println("this is a valid triangle");
        else
            System.out.println("it's not a triangle");
    }
}

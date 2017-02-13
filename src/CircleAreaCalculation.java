import java.lang.Math;

public class CircleAreaCalculation {

    public double calculateCircleArea(double localRadius) {
        ParameterValidator objectValidator=new ParameterValidator();
        if (objectValidator.validateIfPositive(localRadius) ) return Math.PI * Math.pow(localRadius, 2);
        else return 0;
    }
}

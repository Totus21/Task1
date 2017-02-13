
public class CirclePerimeterCalculation {

    public double calculateCirclePerimeter(double localRadius) {
        ParameterValidator objectValidator=new ParameterValidator();
        if (objectValidator.validateIfPositive(localRadius) ) return Math.PI * localRadius * 2;
        else return 0;
    }

}


public class CircleParameter {
    private double circleRadius;


    public void setCircleRadius(double localRadiusFigure) {
        ParameterValidator objectValidator=new ParameterValidator();
        if (objectValidator.validateIfPositive(localRadiusFigure)) circleRadius = localRadiusFigure;
        else circleRadius = 0;
    }

    public double getCircleRadius() {
        return circleRadius;
    }
}

package com.natasha_mishuk.figure.circle;

public class CircleParameter {
    private double circleRadius;
    private double circleArea;
    private double circlePerimeter;


    public void setCircleRadius(double localRadiusFigure) {

        ParameterValidator objectValidator = new ParameterValidator();
        if (objectValidator.validateIfPositive(localRadiusFigure)) {
            circleRadius = localRadiusFigure;
        } else {
            circleRadius = 0;
        }


    }

    public double getCircleRadius() {

        return circleRadius;
    }

    public void setCircleArea(double circleArea) {

        this.circleArea = circleArea;
    }

    public void setCirclePerimeter(double circlePerimeter) {

        this.circlePerimeter = circlePerimeter;
    }

    public double getCircleArea() {

        return circleArea;
    }

    public double getCirclePerimeter() {

        return circlePerimeter;
    }
}

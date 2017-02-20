package com.natasha_mishuk.figure.circle;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CircleParameter {
    private double circleRadius;
    private double circleArea;
    private double circlePerimeter;
    Logger logger = LogManager.getLogger("CircleParameter");


    public void setCircleRadius(double localRadiusFigure) {

        ParameterValidator objectValidator = new ParameterValidator();
        if (objectValidator.validateIfPositive(localRadiusFigure)) {
            logger.log(Level.INFO," entered radius -> "+localRadiusFigure+"is positive");
            circleRadius = localRadiusFigure;
            logger.log(Level.INFO," setCircleRadius sets circleRadius to "+localRadiusFigure);
        } else {
            logger.log(Level.WARN," entered radius -> "+localRadiusFigure+" is negative or equals to 0");
            circleRadius = 0;
            logger.log(Level.WARN," setCircleRadius sets circleRadius to 0");
        }


    }

    public double getCircleRadius() {
        logger.log(Level.INFO," getCircleRadius returns circleRadius -> " + circleRadius);
        return circleRadius;
    }

    public void setCircleArea(double circleArea) {
        logger.log(Level.INFO," setCircleArea sets circleArea -> " + circleArea);
        this.circleArea = circleArea;
    }

    public void setCirclePerimeter(double circlePerimeter) {
        logger.log(Level.INFO," setCirclePerimeter sets circlePerimeter -> " + circlePerimeter);
        this.circlePerimeter = circlePerimeter;
    }

    public double getCircleArea() {
        logger.log(Level.INFO," getCircleArea returns circleArea -> " + circleArea);
        return circleArea;
    }

    public double getCirclePerimeter() {
        logger.log(Level.INFO," getCirclePerimeter returns circlePerimeter -> " + circlePerimeter);
        return circlePerimeter;
    }
}

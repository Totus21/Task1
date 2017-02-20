package com.natasha_mishuk.figure.circle;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CirclePerimeterCalculation {

    Logger logger = LogManager.getLogger("CirclePerimeterCalculation");

    public void calculateCirclePerimeter(CircleParameter localCircle) {
        logger.log(Level.INFO," calculateCirclePerimeter calculates CirclePerimeter for circleRadius -> " + localCircle);
        localCircle.setCirclePerimeter( Math.PI * localCircle.getCircleRadius() * 2);
        logger.log(Level.INFO," calculateCirclePerimeter sets CirclePerimeter to " + localCircle.getCirclePerimeter());

    }

}

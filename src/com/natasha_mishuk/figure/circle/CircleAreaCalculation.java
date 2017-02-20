package com.natasha_mishuk.figure.circle;


import java.lang.Math;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CircleAreaCalculation {

    Logger logger = LogManager.getLogger("CircleAreaCalculation");

    public void calculateCircleArea(CircleParameter localCircle) {
        logger.log(Level.INFO," calculateCircleArea calculates CircleArea for circleRadius -> " + localCircle);
        localCircle.setCircleArea(Math.PI * Math.pow(localCircle.getCircleRadius(), 2));
        logger.log(Level.INFO," calculateCircleArea sets CircleArea to " + localCircle.getCircleArea());
    }

}

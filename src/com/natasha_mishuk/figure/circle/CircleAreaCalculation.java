package com.natasha_mishuk.figure.circle;


import java.lang.Math;



public class CircleAreaCalculation {

    public void calculateCircleArea(CircleParameter localCircle) {

        localCircle.setCircleArea(Math.PI * Math.pow(localCircle.getCircleRadius(), 2));
    }

}

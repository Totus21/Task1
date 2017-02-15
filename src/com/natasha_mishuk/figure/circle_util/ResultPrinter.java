package com.natasha_mishuk.figure.circle_util;

import com.natasha_mishuk.figure.circle.CircleParameter;

public class ResultPrinter {



    public void printErrorMessage() {

        System.out.println("Wrong value is entered. Try again\n");
    }
    public void askForParameterMessage() {

        System.out.println("Enter circle radius for calculation :\n");
    }
    public void askForFileNameMessage(){

        System.out.println("Enter file name :\n");
    }
    public void printFileExistsMessage(){
        System.out.println("File already exists!");

    }

    public void printFileDoesntExistsMessage(){
        System.out.println("File doesn't exist!");

    }

    public void printCircleRadius(double localRadius) {
        System.out.println("Entered radius = " + localRadius);

    }


    public void printCircleArea(double localArea) {
        System.out.println("Calculated circle area = " + localArea);

    }


    public void printCirclePerimeter(double localPerimeter) {
        System.out.println("Calculated circle perimeter = " + localPerimeter+"\n");
    }

    public void printConsoleResults(CircleParameter localCircle)
    {
                printCircleRadius(localCircle.getCircleRadius());
                printCircleArea(localCircle.getCircleArea());
                printCirclePerimeter(localCircle.getCirclePerimeter());


    }


}

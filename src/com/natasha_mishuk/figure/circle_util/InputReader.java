package com.natasha_mishuk.figure.circle_util;

import com.natasha_mishuk.figure.circle.CircleParameter;
import com.natasha_mishuk.figure.circle.ParameterValidator;
import java.io.File;
import java.util.Scanner;

public class InputReader {


    public void readRadiusFromConsole(CircleParameter localCircle) {

        Scanner objectReader = new Scanner(System.in);
        ResultPrinter objectPrinter = new ResultPrinter();
        ParameterValidator objectValidator=new ParameterValidator();

        if (objectReader.hasNextDouble()) {

            double enteredRadius=objectReader.nextDouble();

            if (objectValidator.validateIfPositive(enteredRadius)&&objectValidator.validateIfZero(enteredRadius)) {

                localCircle.setCircleRadius(enteredRadius);

            } else {

                objectPrinter.printErrorMessage();
                readRadiusFromConsole(localCircle);

            }

            } else {

                objectPrinter.printErrorMessage();
                readRadiusFromConsole(localCircle);

            }


        }


    public void readFileNameFromConsole(FileParameter localFile)
    {
        Scanner objectReader = new Scanner(System.in);
        ResultPrinter objectPrinter = new ResultPrinter();
        String fileName=objectReader.nextLine();
        File objectFile = new File(FileParameter.ROOT_DIR + fileName);


                if (!objectFile.exists()) {

                    localFile.setFileName(fileName);

                } else {

                    objectPrinter.printFileExistsMessage();
                    objectPrinter.askForFileNameMessage();
                    readFileNameFromConsole(localFile);

                }







    }
}

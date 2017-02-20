package com.natasha_mishuk.figure.main;

import com.natasha_mishuk.figure.circle_util.ResultPrinter;
import com.natasha_mishuk.figure.circle_util.InputReader;
import com.natasha_mishuk.figure.circle_util.FileParameter;
import com.natasha_mishuk.figure.circle_util.FileUtil;
import com.natasha_mishuk.figure.circle.CircleParameter;
import com.natasha_mishuk.figure.circle.CircleAreaCalculation;
import com.natasha_mishuk.figure.circle.CirclePerimeterCalculation;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.natasha_mishuk.figure.log_util.LoggerInitiator;

public class Runner {
    public static void main(String[] args)
    {
        Logger logger = LogManager.getLogger("Runner");

        //создание всех необходимых обьектов

        ResultPrinter objectPrinter= new ResultPrinter();
        logger.log(Level.INFO," objectPrinter is created");
        InputReader objectReader = new InputReader();
        logger.log(Level.INFO," objectReader is created");
        CircleParameter objectCircle=new CircleParameter();
        logger.log(Level.INFO," objectCircle is created");
        CircleAreaCalculation objectCircleArea=new CircleAreaCalculation();
        logger.log(Level.INFO," objectCircle is created");
        CirclePerimeterCalculation objectCirclePerimeter=new CirclePerimeterCalculation();
        logger.log(Level.INFO," objectCirclePerimeter is created");
        FileParameter objectFile=new FileParameter();
        logger.log(Level.INFO," objectFile is created");
        FileUtil objectFileUtil=new FileUtil();
        logger.log(Level.INFO," objectFileUtil is created");

        //чтение радиуса из консоли и расчет площади и периметра
        logger.log(Level.INFO," user is asked about circle radius ");
        objectPrinter.askForParameterMessage();
        objectReader.readRadiusFromConsole(objectCircle);
        logger.log(Level.INFO," read circle radius from console. Entered radius is " + objectCircle.getCircleRadius());
        objectCircleArea.calculateCircleArea(objectCircle);
        logger.log(Level.INFO," calculate circle area for radius from  console . Calculated area for radius from  console is " + objectCircle.getCircleArea());
        objectCirclePerimeter.calculateCirclePerimeter(objectCircle);
        logger.log(Level.INFO," calculate circle perimeter for radius from  console. Calculated perimeter for radius from  console is " + objectCircle.getCirclePerimeter());
        objectPrinter.printConsoleResults(objectCircle);
        logger.log(Level.INFO," area and perimeter for circle radius from console are printed in console");

        //чтение радиусов из файла и запись результатов в файл
       logger.log(Level.INFO," user is asked about file name ");
        objectPrinter.askForFileNameMessage();
        objectReader.readFileNameFromConsole(objectFile);
        logger.log(Level.INFO," read file name from console. Entered file name is " + objectFile.getFileName());
        objectFileUtil.createFiles(objectFile);
        logger.log(Level.INFO,"Create file " + objectFile.getFileName());
        objectFileUtil.fillFileWithTestData(objectFile);
        logger.log(Level.INFO, objectFile.getFileName()+" is filled out with test data");
        objectFileUtil.fillFileWithResults(objectFileUtil.readFromDataFile(objectFile),objectFile);
        logger.log(Level.INFO, "Result_"+ objectFile.getFileName()+" is filled out with result data");




    }
}

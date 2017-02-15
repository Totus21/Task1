package com.natasha_mishuk.figure.main;

import com.natasha_mishuk.figure.circle_util.ResultPrinter;
import com.natasha_mishuk.figure.circle_util.InputReader;
import com.natasha_mishuk.figure.circle_util.FileParameter;
import com.natasha_mishuk.figure.circle_util.FileUtil;
import com.natasha_mishuk.figure.circle.CircleParameter;
import com.natasha_mishuk.figure.circle.CircleAreaCalculation;
import com.natasha_mishuk.figure.circle.CirclePerimeterCalculation;




public class Runner {
    public static void main(String[] args)
    {


        //создание всех необходимых обьектов
        ResultPrinter objectPrinter= new ResultPrinter();
        InputReader objectReader = new InputReader();
        CircleParameter objectCircle=new CircleParameter();
        CircleAreaCalculation objectCircleArea=new CircleAreaCalculation();
        CirclePerimeterCalculation objectCirclePerimeter=new CirclePerimeterCalculation();
        FileParameter objectFile=new FileParameter();
        FileUtil objectFileUtil=new FileUtil();

        //чтение радиуса из консоли и расчет площади и периметра
        objectPrinter.askForParameterMessage();
        objectReader.readRadiusFromConsole(objectCircle);
        objectCircleArea.calculateCircleArea(objectCircle);
        objectCirclePerimeter.calculateCirclePerimeter(objectCircle);
        objectPrinter.printConsoleResults(objectCircle);

        //чтение радиусов из файла и запись результатов в файл
        objectPrinter.askForFileNameMessage();
        objectReader.readFileNameFromConsole(objectFile);
        objectFileUtil.createFiles(objectFile);
        objectFileUtil.fillFileWithTestData(objectFile);
        objectFileUtil.fillFileWithResults(objectFileUtil.readFromDataFile(objectFile),objectFile);




    }
}

package com.natasha_mishuk.figure.circle_util;

import com.natasha_mishuk.figure.circle.CircleAreaCalculation;
import com.natasha_mishuk.figure.circle.CircleParameter;
import com.natasha_mishuk.figure.circle.CirclePerimeterCalculation;
import java.util.Random;


import java.io.*;

public class FileUtil {


  public void createFiles( FileParameter localFile) {
      ResultPrinter objectPrinter=new ResultPrinter();
        File objectFile = new File(FileParameter.ROOT_DIR + localFile.getFileName());

        try {

            if (!objectFile.exists()) {
                localFile.setFileName(localFile.getFileName());
                objectFile.createNewFile();

            } else {
                objectPrinter.printFileExistsMessage();
                localFile.setFileName(localFile.getFileName() + localFile.getFileName().charAt((int)(localFile.getFileName().length()-1)));
                createFiles(localFile);

            }


        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public void fillFileWithTestData(FileParameter localFile) {
       ResultPrinter objectPrinter=new ResultPrinter();
       File objectFile = new File(FileParameter.ROOT_DIR + localFile.getFileName());
       Random objectRandom=new Random();
        try {
            if (!objectFile.exists()) {
                objectPrinter.printFileDoesntExistsMessage();
            } else {
                PrintWriter objectFileWriter = new PrintWriter(objectFile.getAbsoluteFile());

                try {

                    objectFileWriter.println(objectRandom.nextInt(100));
                    objectFileWriter.println(objectRandom.nextBoolean());
                    objectFileWriter.println(objectRandom.nextFloat());
                    objectFileWriter.println(objectRandom.nextInt(100));
                    objectFileWriter.println(objectRandom.nextFloat());
                } finally {

                    objectFileWriter.close();
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

   public double[] readFromDataFile(FileParameter localFile) {

       File objectFile = new File(FileParameter.ROOT_DIR + localFile.getFileName());
       double[] localResult = new double[5];

        try {
            BufferedReader objectBufferedReader = new BufferedReader(new FileReader(objectFile.getAbsoluteFile()));
            try {
                String stringFromFile;
                int index = 0;

                while ((stringFromFile = objectBufferedReader.readLine()) != null) {
                    try {
                        localResult[index] = Double.parseDouble(stringFromFile);
                        index++;
                    } catch (NumberFormatException e) {
                        localResult[index]=0;
                        index++;
                    }
                }
            } finally {
                objectBufferedReader.close();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return  localResult;



    }

    public void fillFileWithResults(double[] localResults, FileParameter localFile) {
        File objectFile = new File(FileParameter.ROOT_DIR + "Result_" + localFile.getFileName());
        CircleParameter objectCircle = new CircleParameter();
        CircleAreaCalculation objectArea = new CircleAreaCalculation();
        CirclePerimeterCalculation objectPerimeter = new CirclePerimeterCalculation();
        try {

            if (!objectFile.exists()) {
                objectFile.createNewFile();
                try {
                    PrintWriter objectFileWriter = new PrintWriter(objectFile.getAbsoluteFile());

                    try {
                        for (int i = 0; i < 5; i++) {
                            objectCircle.setCircleRadius(localResults[i]);
                            if (objectCircle.getCircleRadius() != 0){
                                objectPerimeter.calculateCirclePerimeter(objectCircle);
                                objectArea.calculateCircleArea(objectCircle);
                                objectFileWriter.println("Radius = " + objectCircle.getCircleRadius() +
                                                         " Perimeter = " + objectCircle.getCirclePerimeter() +
                                                         " Area = " + objectCircle.getCircleArea()  );
                            } else {
                                objectFileWriter.println("Wrong data format is used, so ignored for calculation"  );
                            }

                        }

                    } finally {

                        objectFileWriter.close();
                    }

                } catch (IOException e) {
                    throw new RuntimeException(e);
                }


            } else {
                System.out.println("File already exists!!!!");

            }


        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }


}

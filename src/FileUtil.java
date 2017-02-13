import java.io.*;

public class FileUtil {


    public boolean createFiles(String fileName, FileParameter localFile) {
        File objectFile = new File(FileParameter.rootDir + fileName);

        try {

            if (!objectFile.exists()) {
                localFile.setFileName(fileName);
                objectFile.createNewFile();
                return true;
            } else {
                System.out.println("File already exists!!!!");
                return false;
            }


        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public void fillFileWithTestData(FileParameter localFile) {

        File objectFile = new File(FileParameter.rootDir + localFile.getFileName());

        try {
            if (!objectFile.exists()) {
                System.out.println("File doesn't exist!!!!");
            } else {
                PrintWriter objectFileWriter = new PrintWriter(objectFile.getAbsoluteFile());

                try {

                    objectFileWriter.println("5");
                    objectFileWriter.println("-3");
                    objectFileWriter.println("0.55");
                    objectFileWriter.println("0");
                    objectFileWriter.println("uhhjb");
                } finally {

                    objectFileWriter.close();
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public double[] readFromDataFile(FileParameter localFile) {

        File objectFile = new File(FileParameter.rootDir + localFile.getFileName());
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
                        index--;
                    }
                }
            } finally {
                objectBufferedReader.close();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return localResult;

    }

    public void fillFileWithResults(double[] localResults, FileParameter localFile) {
        File objectFile = new File(FileParameter.rootDir + "Result_" + localFile.getFileName());
        CircleParameter data = new CircleParameter();
        CircleAreaCalculation area = new CircleAreaCalculation();
        CirclePerimeterCalculation perimeter = new CirclePerimeterCalculation();
        try {

            if (!objectFile.exists()) {
                objectFile.createNewFile();
                try {
                    PrintWriter objectFileWriter = new PrintWriter(objectFile.getAbsoluteFile());

                    try {
                        for (int i = 0; i < 5; i++) {
                            data.setCircleRadius(localResults[i]);

                            if (data.getCircleRadius() != 0)

                            {
                                objectFileWriter.println("Radius = " + data.getCircleRadius() +
                                        " Perimeter = " + perimeter.calculateCirclePerimeter(data.getCircleRadius()) +
                                        " Area = " + area.calculateCircleArea(data.getCircleRadius()));
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

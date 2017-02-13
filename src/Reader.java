import java.util.Scanner;

public class Reader {

    public void readMenuItem() {
        Scanner objectReader = new Scanner(System.in);
        Printer objectPrint = new Printer();
        FileUtil objectFile = new FileUtil();
        FileParameter objectFileParameters=new FileParameter();

        int menuItem;
        if (objectReader.hasNextInt()) {
            menuItem = objectReader.nextInt();
            if (menuItem == 1 ) {
                objectPrint.askForParameterMessage();
                readFromConsoleParameter();
            } else if (menuItem == 2){

                do {
                    objectPrint.askForFileNameMessage();

                }
                    while(!objectFile.createFiles(readFileParameters(),objectFileParameters));

                objectFile.fillFileWithTestData(objectFileParameters);
                objectFile.fillFileWithResults(objectFile.readFromDataFile(objectFileParameters),objectFileParameters);



            } else System.out.println("Exiting is selected. Closing the program");

        } else {
            objectPrint.printErrorMessage();
            objectPrint.printMainMenu();
            readMenuItem();
        }

    }

    public void readFromConsoleParameter() {
        Scanner objectReader = new Scanner(System.in);
        Printer objectPrint = new Printer();

        do

            if (objectReader.hasNextDouble()) {

               objectPrint.printConsoleResults(objectReader.nextDouble());
                objectPrint.askForParameterMessage();

            } else objectPrint.printErrorMessage();


        while (objectReader.hasNextDouble());

    }


    public String readFileParameters()
    {
        Scanner objectReader = new Scanner(System.in);

        do {
            return objectReader.nextLine();
        }
        while (objectReader.hasNextLine());


    }
}

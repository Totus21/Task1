/**
 * Created by Natasha_Mishuk on 2/8/2017.
 */
public class Printer {

    public void printMainMenu() {

        System.out.println("Please, select the way you want to get results:\n");
        System.out.println("Enter 1 - console input/output:\n");
        System.out.println("Enter 2 - file input/output:\n");
        System.out.println("Enter 3 - to exit the program\n");


    }

    public void printErrorMessage() {
        System.out.println("Wrong value is entered. Try again:\n");
    }
    public void askForParameterMessage() {
        System.out.println("Enter circle radius for calculation :\n");
    }
    public void askForFileNameMessage(){System.out.println("Enter file name :\n");}


    public void printCircleRadius(double localRadius) {
        System.out.println("Entered radius = " + localRadius);

    }


    public void printCircleArea(double localArea) {
        System.out.println("Calculated circle area = " + localArea);

    }


    public void printCirclePerimeter(double localPerimeter) {
        System.out.println("Calculated circle perimeter = " + localPerimeter+"\n");
    }

    public void printConsoleResults(double localRadius)
    {
        CircleParameter data = new CircleParameter();
        CircleAreaCalculation area = new CircleAreaCalculation();
        CirclePerimeterCalculation perimeter = new CirclePerimeterCalculation();

        data.setCircleRadius(localRadius);
            if (data.getCircleRadius() != 0) {
                printCircleRadius((data.getCircleRadius()));
                printCircleArea((area.calculateCircleArea(data.getCircleRadius())));
                printCirclePerimeter((perimeter.calculateCirclePerimeter(data.getCircleRadius())));
            } else printErrorMessage();




    }


}

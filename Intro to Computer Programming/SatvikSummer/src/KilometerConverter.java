/**
 * Created by guptar1 on 7/18/2019.
 */
public class KilometerConverter {

    public static void main(String[] args) {
        System.out.println("This program will tell you the number of kilometers in any number miles you give it and vice versa.");

        System.out.println("What is your name?");

        EasyReader console = new EasyReader();

        String name =  console.readLine();

        System.out.println("What is the number of miles that you want in kilometers?");

        double miles = console.readDouble();

        double kilometerdistance = miles * 1.6;

        System.out.println("What is the number of kilometers that you want in miles?");

        double kilometers = console.readDouble();

        double miledistance = kilometers * .621;

        System.out.println("The number of kilometers in " + miles + " miles is " + kilometerdistance);

        System.out.println("The number of miles in " + kilometers + " kilometers is " + miledistance);


    }
}

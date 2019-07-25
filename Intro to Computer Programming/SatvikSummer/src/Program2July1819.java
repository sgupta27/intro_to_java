/**
 * Created by guptar1 on 7/18/2019. This program is designed to allow user to input their initials
 * and three numbers. The program will then calculate and output the sum and
 * average of the numbers.
 */
public class Program2July1819 {

    public static void main (String args[]){
        EasyReader console = new EasyReader();

        System.out.println("What are your initials?");

        char firsti = console.readChar();

        char lasti = console.readChar();

        System.out.println(" This program will take three numbers and find their sum and average. What is the first number? ");

        double first = console.readDouble();

        System.out.println(" What is the second number? ");

        double second = console.readDouble();

        System.out.println(" What is the third number? ");

        double third = console.readDouble();

        System.out.println( " " + firsti + lasti + ", Your sum is " + (first + second + third));

        System.out.println( " " + firsti + lasti + ", Your average is " + (first + second + third)/3);

        double viki = 4.0/3;

        System.out.println(viki);

    }

}

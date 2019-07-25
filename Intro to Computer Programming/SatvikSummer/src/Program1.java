/***************************************************************************
 /***************************************************************************
 *
 * Name: Sarvesh Gupta Date Created: 9/8/2016 Date Modified: 9/15/2016 Program
 * #: 1 Description: This program is designed to allow user input of the
 * numerator and denominator of a fraction. The program will then echo back to
 * the screen the user-entered fraction. Bonus: 1 & 2 (Divide by 0 & Looping)
 *
 ****************************************************************************/

// Variable count only exists to decide whether continuing or not.
public class Program1 {

    public static void main(String args[]) {
        EasyReader console = new EasyReader();

        System.out.print("Name         = ");
        String userName = console.readLine();

        int answer = 1;

        while (answer == 1) {

            System.out.print("\n" + "Numerator    = ");
            double num = console.readDouble();

            System.out.print("\n" + "Denominator  = ");
            double den = console.readDouble();

            if (den == 0)
                System.out.print("\n" + "Sorry, you can't divide by zero. Try again." + "\n");
            else {
                System.out.print("\n" + userName + ", the fraction you just entered is " + num + "/" + den + ". ");

                double decimal = (double) num / den;

                System.out.print("\n\n" + userName + ", the decimal equivalent of your fraction is " + decimal + ".");
            }

            System.out.print("\n\n" + "Would you like to go again? 1= YES/0= NO = ");
            answer = console.readInt();
        }
    }
}
/***************************************************************************
 *
 * Name: Sarvesh Gupta Date Created: 9/8/2016 Date Modified: 9/15/2016 Program
 * #: 1 Description: This program is designed to allow user input of the
 * numerator and denominator of a fraction. The program will then echo back to
 * the screen the user-entered fraction. Bonus: 1 & 2 (Divide by 0 & Looping)
 *
 ****************************************************************************/
public class Program1July1819 {
    public static void main(String args[]) {
        System.out.println("What is your name, beta?");

        EasyReader console = new EasyReader();

        String name = console.readLine();

        int answer = 1;

        while (answer == 1) {
            System.out.println("What is the numerator?");

            int numerator = console.readInt();

            System.out.println("What is the denominator?");

            int denominator = console.readInt();

            if (denominator == 0) {
                System.out.println("Sorry you can't divide by 0! ");
            } else {
                System.out.println(name + ", Your decimal is " + numerator / denominator + "\n");

                System.out.println(name + ", Your fraction is " + numerator + " /" + denominator + "\n");

            }
            System.out.println("If you want to do another calculation, press 1, else press 2");

            answer = console.readInt();

        }//while

    }//main
}//class

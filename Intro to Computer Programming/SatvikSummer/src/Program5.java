/***************************************************************************
 /*	Name:
 Date Created:	10/31/16
 Date Modified:	11/09/16
 Program #:		5
 Description:	This program is designed to check to see if one number is a multiple of another number.
 Bonus:			0
 */

public class Program5 {

    public static void main(String args[]) {
        EasyReader console = new EasyReader();

        System.out.print("Name			= ");
        String userName = console.readLine();

        System.out.print("\nFirst number 		= ");
        double fNumber = console.readDouble();

        System.out.print("\nSecond number	        = ");
        double sNumber = console.readDouble();

        if (fNumber > sNumber) {
            double temp = fNumber;
            fNumber = sNumber;
            sNumber = temp;
        }

        if (sNumber % fNumber == 0) {
            System.out.print("\n" + userName + ", " + fNumber + " is a multiple of " + sNumber + ".");
        } else {
            System.out.print("\n" + userName + ", " + fNumber + " is not a multiple of " + sNumber + ".\n");
        }
    }
}


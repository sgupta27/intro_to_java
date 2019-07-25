/*
 	Name:			Sarvesh Gupta
	Date Created:	11/04/16
	Date Modified:	11/00/16
	Program #:		6
	Description:	This program will allow the user to enter the lengths of 3 sides of a triangle.
	Bonus:          0
*/

public class Program6 {

    public static void main(String args[]) {
        EasyReader console = new EasyReader();
        boolean again = true;
        do {
            System.out.print("Triangle Label (ex: ABC)	= ");
            String tLabel = console.readLine();

            System.out.print("\nSide 1				= ");
            int side1 = console.readInt();

            System.out.print("\nSide 2				= ");
            int side2 = console.readInt();

            System.out.print("\nSide 3				= ");
            int side3 = console.readInt();

            if (side1 == side2 && side2 == side3) {
                System.out.print("\nTriangle " + tLabel + " is equilateral");
            } else if (side1 == side2 || side2 == side3 || side1 == side3) {
                System.out.print("\nTriangle " + tLabel + " is isosceles");
            } else {
                System.out.print("\nTriangle " + tLabel + " is scalene");
            }
            System.out.print("\n\nWould you like to enter another triangle? Y/N ");
            console.readChar();
            char another = console.readChar();

            if (another == 'y' || another == 'Y') {
                again = true;
                System.out.print("\n\nOkay, let's go again.");
            }
        } while (again);
    }
}
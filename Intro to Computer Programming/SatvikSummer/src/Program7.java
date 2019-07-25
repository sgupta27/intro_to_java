/***************************************************************************

 Name:				Sarvesh Gupta
 Date Created:		11/15/16
 Date Modified:		11/00/16
 Program #:			7
 Description:		‘use the above description’
 Bonus:				?


 ****************************************************************************/

public class Program7 {

    public static void triType(double side01, double side02, double side03, double temp) {

        if (side01 > side02) {
            temp = side01;
            side01 = side02;
            side02 = temp;
        }
        if (side02 > side03) {
            temp = side02;
            side02 = side03;
            side03 = temp;
        }
        if (side01 > side03) {
            temp = side01;
            side01 = side03;
            side03 = temp;
        }


    }

    public static void main(String args[]) {

        EasyReader console = new EasyReader();
        boolean again = true;
        System.out.print("Please choose from the following menu:" + "\n1.	Find the Slope of a line given two points"
                + "\n2.	Determine if a triangle is a right triangle" + "\n3.	Exit" + "\n\nChoice (1-3) = ");
        int choice = console.readInt();
        if (choice == 1) {
            System.out.print("\nPoint 1:" + "\nX = ");
            double x1 = console.readDouble();
            System.out.print("Y = ");
            double y1 = console.readDouble();

            System.out.print("\nPoint 2:" + "\nX = ");
            double x2 = console.readDouble();
            System.out.print("Y = ");
            double y2 = console.readDouble();

            double slopeY = Math.abs(y2 - y1);
            double slopeX = Math.abs(x2 - x1);

            System.out.print("\nThe slope of the line is " + slopeY + "/" + slopeX);

        } else if (choice == 2) {

            System.out.print("Triangle Label (ex: ABC)	= ");
            console.readChar();
            String tLabel = console.readLine();
            System.out.print("Side 1                	= ");
            double side1 = console.readDouble();
            System.out.print("Side 2                	= ");
            double side2 = console.readDouble();
            System.out.print("Side 3                	= ");
            double side3 = console.readDouble();

            double side33 = side3 * side3;
            double side22 = side2 * side2;
            double side11 = side1 * side1;
            double side12 = side11 + side22;
            double side23 = side33 + side22;
            double side13 = side11 + side33;
            if (side33 == side12 || side22 == side13 || side11 == side23 ) {
                System.out.print("Yes, triangle "+tLabel+" is a right triangle.");
            }
            else {
                System.out.println("No, triangle "+tLabel+" is not a right triangle.");
            }
        } else {
            again = false;
        }

        while(again);

    }}

/***************************************************************************
 *
 * Name:          Sarvesh Gupta
 * Date Created:  9/19/16
 * Date Modified: 9/27/16
 * Program #:     2
 * Description:   This program is designed to allow user to input their initials
 * and three numbers. The program will then calculate and output the sum and
 * average of the numbers.
 * Bonus:         #1-Boolean Loop
 *
 *
 ****************************************************************************/

public class Program2 {

    public static void main(String args[]) {
        EasyReader console = new EasyReader();
        System.out.print("First and Last Initial = ");
        char first = console.readChar();
        char last = console.readChar();

        boolean again = true;
        do {

            System.out.print("\n" + "Number 1               = ");
            int n1 = console.readInt();

            System.out.print("\n" + "Number 2               = ");
            int n2 = console.readInt();

            System.out.print("\n" + "Number 3               = ");
            int n3 = console.readInt();

            System.out.print("\n" + first + last + ", the numbers you entered are:");
            System.out.print("\n" + n1);
            System.out.print("\n" + n2);
            System.out.print("\n" + n3);

            double num = (double) n1 + n2 + n3;
            double den = 3;
            double numdivden = (double) num / den;

            System.out.print("\n\n" + first + last + ", the average of your numbers is " + numdivden);
            System.out.print("\n" + "Go again? (0 to exit)");
            int userAns = console.readInt();
            if (userAns == 0) {
                again = false;
            }

        } while (again == true);

    }

}


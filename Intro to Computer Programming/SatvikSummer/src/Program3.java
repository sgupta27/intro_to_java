/***************************************************************************
 *
 * Name:          Sarvesh Gupta
 * Date Created:  9/26/14
 * Date Modified: 9/27/14
 * Program #:     3
 * Description:   This program is designed to allow user to enter five student
 * scores. The program will then calculate and output the sum and average of the
 * scores.
 * Bonus:         1- Output Letter Grade
 *
 ****************************************************************************/

public class Program3 {

    public static void main(String args[]) {
        EasyReader console = new EasyReader();

        boolean again = true;
        int i = 1;
        System.out.print("Student Name         = ");
        String userName = console.readLine();

        System.out.print("\nAssignment " + i + ":");
        i = i + 1;
        System.out.print("\nPoints Earned        = ");
        double pEarned1 = console.readDouble();
        System.out.print("\nPoints Possible      = ");
        double pAvailable1 = console.readDouble();

        System.out.print("\nAssignment " + i + ": ");
        i = i + 1;
        System.out.print("\nPoints Earned        = ");
        double pEarned2 = console.readDouble();
        System.out.print("\nPoints Possible      = ");
        double pAvailable2 = console.readDouble();

        System.out.print("\nAssignment " + i + ": ");
        i = i + 1;
        System.out.print("\nPoints Earned        = ");
        double pEarned3 = console.readDouble();
        System.out.print("\nPoints Possible      = ");
        double pAvailable3 = console.readDouble();

        System.out.print("\nAssignment " + i + ": ");
        i = i + 1;
        System.out.print("\nPoints Earned        = ");
        double pEarned4 = console.readDouble();
        System.out.print("\nPoints Possible      = ");
        double pAvailable4 = console.readDouble();

        System.out.print("\nAssignment " + i + ": ");
        i = i + 1;
        System.out.print("\nPoints Earned        = ");
        double pEarned5 = console.readDouble();
        System.out.print("\nPoints Possible      = ");
        double pAvailable5 = console.readDouble();

        System.out.print("\n" + userName + "'s scores are:");
        System.out.print("\n" + pEarned1 + " out of " + pAvailable1);
        System.out.print("\n" + pEarned2 + " out of " + pAvailable2);
        System.out.print("\n" + pEarned3 + " out of " + pAvailable3);
        System.out.print("\n" + pEarned4 + " out of " + pAvailable4);
        System.out.print("\n" + pEarned5 + " out of " + pAvailable5);

        double pEarned = pEarned1 + pEarned2 + pEarned3 + pEarned4 + pEarned5;

        double pAvailable = pAvailable1 + pAvailable2 + pAvailable3 + pAvailable4 + pAvailable5;

        double percent = (pEarned * 100) / pAvailable;

        System.out.print("\n\n" + userName + "'s Total Points:   " + pEarned + " out of " + pAvailable);

        System.out.print("\n\n" + userName + "'s Percent:        " + percent);
        String lGrade = ("F");
        if (percent >= 93) {
            lGrade = "A";
        } else if (percent >= 90) {
            lGrade = "A-";
        } else if (percent >= 87) {
            lGrade = "B+";
        } else if (percent >= 84) {
            lGrade = "B";
        } else if (percent >= 80) {
            lGrade = "B-";
        } else if (percent >= 77) {
            lGrade = "C+";
        } else if (percent >= 74) {
            lGrade = "C";
        } else if (percent >= 70) {
            lGrade = "C-";
        } else if (percent >= 67) {
            lGrade = "D+";
        } else if (percent >= 64) {
            lGrade = "D";
        } else if (percent >= 60) {
            lGrade = "D-";
        } else {
            lGrade = "F";
        }

        System.out.print("\n\n" + userName + "'s Letter Grade:   " + lGrade);

        System.out.print(" Would you like to enter another rectangle? Y/N");
        char another = console.readChar();

        System.out.print("\n" + "Go again? (0 to exit)");
        int userAns = console.readInt();
        if (userAns == 0) {
            again = false;
        }

        while (again == true);

    }
}
